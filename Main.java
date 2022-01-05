package com.company;

//import various libraries
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

//main function from which program will execute
public class Main {

    public static void main(String[] args) {
        //program outputs a prompt for the user to enter the student filename
        System.out.print("Enter the student filename: ");
        //Scanner object is created to read input
        Scanner inputFilename = new Scanner(System.in);
        //next line of input is saved into string variable, filename
        String filename = inputFilename.nextLine();

        //beginning of try...catch block to find specified file
        try {
            //current working directory is obtained and saved in String variable, currentDirectory
            String currentDirectory = System.getProperty("user.dir");

            //Scanner object finds the specified file using the variable filename in the current working directory
            Scanner scanner = new Scanner(new File(currentDirectory + "\\" + filename + ".csv"));

            //the first line of the .csv file is read into headerLine to remove it from further processing
            String headerLine = scanner.nextLine();

            //while loop to cycle through the remainder of the .csv file
            if (scanner.hasNext()) {
                //next line of .csv file is read into string variable, eachRow
                String eachRow = scanner.nextLine();

                //eachRow is split by commas and stored in an array of strings called studentInfo
                String[] studentInfo = eachRow.split(",");

                //new instance of Student class is created using studentInfo array
                Student student1 = new Student(studentInfo);
                //function is called from Student class to print the student's name and NSHE ID number
                student1.printStudentInfo();

                //storeEligibleCourses function of the Hospitality class is called to store all courses student is
                //eligible to take under the Hospitality Management degree program given their academic history
                student1.courseHistory.requirements.storeEligibleCourses();

                //Beginning of while loop that allows prompt to re-print until user enters correct choice
                while(true){

                    //Program outputs a prompt asking user which type of course plan they would like printed to output file
                    System.out.println("Would you like to...");
                    System.out.println("A. See " + student1.firstName + "'s remaining courses?");
                    System.out.println("B. See all the courses " + student1.firstName + " is eligible to take next semester?");
                    System.out.println("C. See course suggestions for only one term?");
                    System.out.println("D. See " + student1.firstName + "'s full graduation plan?");

                    //Scanner object is created to read input
                    Scanner userInput = new Scanner(System.in);
                    //next line of input from user is changed to uppercase and saved to String variable, choice
                    String choice = userInput.nextLine().toUpperCase();

                    //switch case statement using choice variable to determine action
                    switch (choice) {
                        //If user chooses option A, program outputs .txt file with all of student's remaining courses
                        case "A":
                            student1.courseHistory.requirements.printRemainingCourses(student1.createOutputFile("remainingCourses"));
                            return;
                        //If user chooses option B, program outputs .txt file with all of student's eligible courses
                        //Eligible courses are those for which the student meets the prerequisite but has not satisfied
                        case "B":
                            student1.courseHistory.requirements.printEligibleCourses(student1.createOutputFile("eligibleCourses"));
                            return;
                        //If user chooses option C, program outputs .txt file with one semester course plan
                        case "C":
                            student1.courseHistory.requirements.createSemesterPlan(student1.createOutputFile("semesterPlan"));
                            return;
                        //If user chooses option D, program outputs .txt file with full graduation plan
                        case "D":
                            student1.courseHistory.requirements.createGraduationPlan(student1.createOutputFile("gradPlan"));
                            return;
                        //If user enters a different choice than those listed above, program prints error message
                        default:
                            System.out.println("Error, please enter a valid choice.\n");
                    }
                }

            }
            //Scanner object closes and stops reading input
            scanner.close();

        } catch (FileNotFoundException e) {
            //If the specified filename is not found, program prints error message
            System.out.println("Cannot find specified file.");
        }
    }
}

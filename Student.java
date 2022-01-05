package com.company;

//import various libraries for use in this class
import java.io.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

//main body of class
public class Student {

    //declaration of variables representing attributes of a student
    String lastName;
    String firstName;
    String NSHEnumber;
    String major;
    String subplan;
    String catalogYear;
    Float GPA;
    Float GPB;
    Float totalCredits;
    Boolean internationalStatus;
    String classStanding;
    //declare object of type CourseHistory to later utilize with student's academic history
    CourseHistory courseHistory;

    //constructor of Student class that takes an array of Strings as input parameter
    Student(String[] studentInfo){
        //constructor takes the first 10 indices of the array of strings and saves values into the above-declared variables
        lastName = studentInfo[0];
        firstName = studentInfo[1];
        NSHEnumber = studentInfo[2];
        major = studentInfo[3];
        subplan = studentInfo[4];
        catalogYear = studentInfo[5];
        GPA = Float.parseFloat(studentInfo[6]);
        GPB = Float.parseFloat(studentInfo[7]);
        totalCredits = Float.parseFloat(studentInfo[8]);
        internationalStatus = Boolean.parseBoolean(studentInfo[9]);

        //save remainder of String array into another string array, courseHist
        String[] courseHist = Arrays.copyOfRange(studentInfo, 10, studentInfo.length);

        //instantiate object of type CourseHistory using student's course history and general information
        courseHistory = new CourseHistory(courseHist, studentInfo);

        // Determine class standing based on totalCredits
        if (totalCredits >= 90){
            classStanding = "Senior";
        } else if (totalCredits >= 60) {
            classStanding = "Junior";
        } else if (totalCredits >= 30) {
            classStanding = "Sophomore";
        } else {
            classStanding = "Freshman";
        }
    }

    //void function that prints student information to the command line
    void printStudentInfo() {
        System.out.println("The student you are referencing is ");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("NSHE: " + NSHEnumber);
    }

    //this function takes a string as input and returns a File data type
    File createOutputFile(String coursePlanType){
        //create a new File called outputFile using the student's last name, first name, and specified course plan type
        File outputFile = new File(lastName + "_" + firstName + "_" + coursePlanType + ".txt");

        //beginning of try...catch function that tries to write to the output file
        try{
            //DateFormat object created to store current date in specified format
            DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            //Store date in date variable
            Date date = new Date();

            //file output stream object called to generate output file
            FileOutputStream stream = new FileOutputStream(outputFile);
            //following text is written to the output file
            stream.write("William F. Harrah College of Hospitality\n".getBytes());
            stream.write("Academic Advising Summary\n".getBytes());
            stream.write(("Date: " + dateFormat.format(date) + "\n\n").getBytes());
            stream.write(("Name: " + firstName + " " + lastName + "\n").getBytes());
            stream.write(("NSHE: " + NSHEnumber + "\n").getBytes());
            stream.write(("Plan: " + major + "\n").getBytes());
            stream.write(("Sub-Plan: " + subplan + "\n").getBytes());
            stream.write(("Catalog Year: " + catalogYear + "\n").getBytes());
            stream.write(("Total credits: " + totalCredits + "\n").getBytes());
            stream.write(("Class standing: " + classStanding + "\n").getBytes());
            stream.write(("GPA: " + GPA + " \n").getBytes());
            stream.write(("GPB: " + GPB + " \n").getBytes());

            //the output stream is closed
            stream.close();
        //if the file is not found
        } catch (FileNotFoundException e) {
            //error message is printed
            System.out.println("Could not find the file." + e.toString());
        //if the program cannot output to the output file stream
        } catch (IOException e) {
            //error message is printed
            System.out.println("Error writing to the stream." + e.toString());
        }

        //function returns the output file
        return outputFile;
    }
}

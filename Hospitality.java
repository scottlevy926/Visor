package com.company;

//import various libraries for use in the class
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

//main body of the class
public class Hospitality {

    //two array lists containing Course objects are created to hold remaining and eligible courses respectively
    ArrayList<Course> remainingCourses = new ArrayList<>();
    ArrayList<Course> eligibleCourses = new ArrayList<>();
    //object of type Advising Notes is instantiated so various notes can be added to the student's advising summary
    AdvisingNotes advisingNotes = new AdvisingNotes();

    //variables are declared to hold information that will affect advising notes to be included in the summary
    Float GPA;
    Float GPB;
    String internationalStatus;
    String workExperience;

    //several objects of type Course are instantiated to represent each degree requirement of the Hospitality program
    Course firstYearSeminar = new Course("First Year Seminar", false, true, 3);
    Course ENG101 = new Course("ENG 101", false, true, 3);
    Course ENG102 = new Course("ENG 102", false, false, 3);
    Course secondYearSeminar = new Course("Second Year Seminar", false, false, 3);
    Course constitution = new Course("Constitution", false, true, 4);
    Course MATH120 = new Course("MATH 120", false, true, 3);
    Course labScience = new Course("Lab Science", false, true, 4);
    Course nonLabScience = new Course("Non-Lab Science", false, true, 3);
    Course analyticalThink = new Course("Analytical Thinking", false, true, 3);
    Course COM101 = new Course("COM 101", false, true, 3);
    Course humanities = new Course("Humanities", false, true, 3);
    Course fineArts = new Course("Fine Arts", false, true, 3);
    Course multicultural = new Course("Multicultural", false, true, 0);
    Course international = new Course("International", false, true, 0);
    Course HMD101 = new Course("HMD 101", false, true, 3);
    Course HMD120 = new Course("HMD 120", false, true, 3);
    Course HMD130 = new Course("HMD 130", false, true, 3);
    Course HMD200 = new Course("HMD 200", false, false, 2);
    Course HMD205 = new Course("HMD 205", false, false, 3);
    Course HMD220 = new Course("HMD 220", false, false, 3);
    Course HMD221 = new Course("HMD 221", false, false, 3);
    Course HMD225 = new Course("HMD 225", false, false, 3);
    Course HMD305 = new Course("HMD 305", false, false, 3);
    Course HMD310 = new Course("HMD 310", false, false, 4);
    Course HMD330 = new Course("HMD 330", false, false, 3);
    Course HMD340 = new Course("HMD 340", false, false, 4);
    Course HMD350 = new Course("HMD 350", false, false, 3);
    Course HMD405 = new Course("HMD 405", false, false, 3);
    Course HMD440 = new Course("HMD 440", false, false, 3);
    Course culminating1 = new Course("Culminating Experience 1", false, false, 3);
    Course culminating2 = new Course("Culminating Experience 2", false, false, 3);
    Course hospLDElec1 = new Course("Hospitality Elective 1 (100-499)", false, true, 3);
    Course hospLDElec2 = new Course("Hospitality Elective 2 (100-499)", false, true, 3);
    Course hospUDElec1 = new Course("Hospitality Elective 3 (300-499)", false, true, 3);
    Course hospUDElec2 = new Course("Hospitality Elective 4 (300-499)", false, true, 3);
    Course hospUDElec3 = new Course("Hospitality Elective 5 (300-499)", false, true, 3);
    Course openElec1 = new Course("Open Elective 1 (300-499)", false, true, 3);
    Course openElec2 = new Course("Open Elective 2 (300-499)", false, true,3);
    Course openElec3 = new Course("Open Elective 3 (100-499)", false, true, 3);
    Course openElec4 = new Course("Open Elective 4 (100-499)", false, true, 3);
    Course openElec5 = new Course("Open Elective 5 (100-499)", false, true, 3);

    //void function that utilizes degree requirements of Hospitality program to determine whether course prerequisites
    //have been met
    void applyPrerequisites(){

        //boolean variable declared and initialized to false to show that core courses have yet to be met
        boolean coreCoursesSatisfied = false;

        /* following if statements utilize any and all prerequisites of each degree requirement. If the prerequisite
        is marked as satisfied (based on course history provided in CourseHistory object), the subsequent course
        is marked as prerequisite met. */

        if (ENG101.isSatisfied) {
            ENG102.isPrereqMet = true;
        }

        if (firstYearSeminar.isSatisfied && ENG102.isSatisfied){
            secondYearSeminar.isPrereqMet = true;
        }

        if (ENG102.isSatisfied && MATH120.isSatisfied && HMD101.isSatisfied) {
            HMD205.isPrereqMet = true;
            HMD221.isPrereqMet = true;
            coreCoursesSatisfied = true;
        }

        if (coreCoursesSatisfied && COM101.isSatisfied && HMD120.isSatisfied) {
            HMD200.isPrereqMet = true;
        }

        if (coreCoursesSatisfied && HMD120.isSatisfied) {
            HMD220.isPrereqMet = true;
        }

        if (coreCoursesSatisfied && HMD205.isSatisfied) {
            HMD225.isPrereqMet = true;
        }

        if (coreCoursesSatisfied && analyticalThink.isSatisfied && HMD200.isSatisfied && HMD205.isSatisfied && HMD225.isSatisfied) {
            HMD305.isPrereqMet = true;
        }

        if (coreCoursesSatisfied && analyticalThink.isSatisfied && HMD205.isSatisfied) {
            HMD310.isPrereqMet = true;
        }

        if (coreCoursesSatisfied && HMD130.isSatisfied && HMD221.isSatisfied) {
            HMD330.isPrereqMet = true;
        }

        if (coreCoursesSatisfied && analyticalThink.isSatisfied && HMD221.isSatisfied) {
            HMD340.isPrereqMet = true;
        }

        if (coreCoursesSatisfied && HMD200.isSatisfied) {
            HMD350.isPrereqMet = true;
        }

        if (coreCoursesSatisfied && analyticalThink.isSatisfied && HMD225.isSatisfied && HMD340.isSatisfied && HMD350.isSatisfied) {
            HMD405.isPrereqMet = true;
        }

        if (coreCoursesSatisfied && analyticalThink.isSatisfied && HMD221.isSatisfied && HMD330.isSatisfied && HMD340.isSatisfied && HMD350.isSatisfied) {
            HMD440.isPrereqMet = true;
        }

        if (coreCoursesSatisfied && analyticalThink.isSatisfied && HMD405.isSatisfied) {
            culminating1.isPrereqMet = true;
            culminating2.isPrereqMet = true;
        }
    }

    //void function that evaluated whether courses are eligible to be taken and stores it into an array of course objects
    void storeEligibleCourses() {
        //delete any data already in the eligibleCourses array
        eligibleCourses.clear();

        //following if statements utilize isEligible function of course objects to determine course eligibility
        //if the course is eligible to be taken, it is added to the eligibleCourses array
        if (firstYearSeminar.isEligible()) {
            eligibleCourses.add(firstYearSeminar);
        }
        if (ENG101.isEligible()) {
            eligibleCourses.add(ENG101);
        }
        if (MATH120.isEligible()) {
            eligibleCourses.add(MATH120);
        }
        if (fineArts.isEligible()) {
            eligibleCourses.add(fineArts);
        }
        if (HMD101.isEligible()) {
            eligibleCourses.add(HMD101);
        }
        if (ENG102.isEligible()) {
            eligibleCourses.add(ENG102);
        }
        if (nonLabScience.isEligible()) {
            eligibleCourses.add(nonLabScience);
        }
        if (COM101.isEligible()) {
            eligibleCourses.add(COM101);
        }
        if (HMD120.isEligible()) {
            eligibleCourses.add(HMD120);
        }
        if (HMD130.isEligible()) {
            eligibleCourses.add(HMD130);
        }
        if (secondYearSeminar.isEligible()) {
            eligibleCourses.add(secondYearSeminar);
        }
        if (labScience.isEligible()) {
            eligibleCourses.add(labScience);
        }
        if (HMD200.isEligible()) {
            eligibleCourses.add(HMD200);
        }
        if (HMD205.isEligible()) {
            eligibleCourses.add(HMD205);
        }
        if (HMD221.isEligible()) {
            eligibleCourses.add(HMD221);
        }
        if (constitution.isEligible()) {
            eligibleCourses.add(constitution);
        }
        if (analyticalThink.isEligible()) {
            eligibleCourses.add(analyticalThink);
        }
        if (HMD220.isEligible()) {
            eligibleCourses.add(HMD220);
        }
        if (HMD225.isEligible()) {
            eligibleCourses.add(HMD225);
        }
        if (hospLDElec1.isEligible()) {
            eligibleCourses.add(hospLDElec1);
        }
        if (humanities.isEligible()) {
            eligibleCourses.add(humanities);
        }
        if (HMD340.isEligible()) {
            eligibleCourses.add(HMD340);
        }
        if (HMD350.isEligible()) {
            eligibleCourses.add(HMD350);
        }
        if (hospLDElec2.isEligible()) {
            eligibleCourses.add(hospLDElec2);
        } else {
            eligibleCourses.remove(hospLDElec2);
        }
        if (hospUDElec1.isEligible()) {
            eligibleCourses.add(hospUDElec1);
        }
        if (HMD305.isEligible()) {
            eligibleCourses.add(HMD305);
        }
        if (HMD310.isEligible()) {
            eligibleCourses.add(HMD310);
        }
        if (HMD330.isEligible()) {
            eligibleCourses.add(HMD330);
        }
        if (hospUDElec2.isEligible()) {
            eligibleCourses.add(hospUDElec2);
        }
        if (openElec3.isEligible()) {
            eligibleCourses.add(openElec3);
        }
        if (HMD405.isEligible()) {
            eligibleCourses.add(HMD405);
        }
        if (HMD440.isEligible()) {
            eligibleCourses.add(HMD440);
        }
        if (hospUDElec3.isEligible()) {
            eligibleCourses.add(hospUDElec3);
        }
        if (openElec1.isEligible()) {
            eligibleCourses.add(openElec1);
        }
        if (openElec4.isEligible()) {
            eligibleCourses.add(openElec4);
        }
        if (culminating1.isEligible()) {
            eligibleCourses.add(culminating1);
        }
        if (culminating2.isEligible()) {
            eligibleCourses.add(culminating2);
        }
        if (openElec2.isEligible()) {
            eligibleCourses.add(openElec2);
        }
        if (openElec5.isEligible()) {
            eligibleCourses.add(openElec5);
        }
    }

    //void function utilized to print advising notes that specifically go at the top of the advising summary
    void printTopAdvisingNotes(FileOutputStream stream) throws IOException {
        //if student's GPA is less than a 2.0
        if(GPA < 2.0){
            //advising note regarding GPA alert is added to the output file
            stream.write(advisingNotes.GPAalert.getBytes());
        }

        //if student's GPB is less than 0, but greater than -15
        if(GPB < 0 && GPB > -15){
            //advising note regarding risk of suspension is added to the output file
            stream.write(advisingNotes.riskOfSuspension.getBytes());
        }

        //if student's GPB is less than or equal to -15
        if(GPB <= -15){
            //advising note regarding university suspension is added to the output file
            stream.write(advisingNotes.universitySuspension.getBytes());
        }

    }

    //void function utilized to print advising notes that specifically go at the bottom of the advising summary
    void printBottomAdvisingNotes(FileOutputStream stream) throws IOException {

        //following if statements used to determine whether certain requirements are listed in remaining courses array
        //if they are contained in remaining courses array, corresponding advising note is also printed to output file

        if(workExperience.equals("N")){
            stream.write(advisingNotes.workExperience.getBytes());
        }

        if(remainingCourses.contains(ENG101)){
            stream.write(advisingNotes.englishPlacementScores.getBytes());
        }

        if(remainingCourses.contains(MATH120)){
            stream.write(advisingNotes.mathPlacementScores.getBytes());
            stream.write(advisingNotes.mathNotes.getBytes());
        }

        if(remainingCourses.contains(secondYearSeminar)){
            stream.write(advisingNotes.secondYearSeminar.getBytes());
        }

        if(remainingCourses.contains(labScience) || remainingCourses.contains(nonLabScience)){
            stream.write(advisingNotes.lifePhysicalScience.getBytes());
        }

        if(remainingCourses.contains(analyticalThink)){
            stream.write(advisingNotes.analyticalThink.getBytes());
        }

        if(remainingCourses.contains(fineArts)){
            stream.write(advisingNotes.fineArts.getBytes());
        }

        if(remainingCourses.contains(humanities)){
            stream.write(advisingNotes.humanities.getBytes());
        }

        if(remainingCourses.contains(multicultural)){
            stream.write(advisingNotes.multiculturalRequirement.getBytes());
        }

        if(remainingCourses.contains(international)){
            stream.write(advisingNotes.internationalRequirement.getBytes());
        }

        if(remainingCourses.contains(ENG102) || remainingCourses.contains(MATH120) || remainingCourses.contains(HMD101)){
            stream.write(advisingNotes.upperdivision.getBytes());
        }

        if(remainingCourses.contains(hospLDElec1) || remainingCourses.contains(hospLDElec2) ||
                remainingCourses.contains(hospUDElec1) || remainingCourses.contains(hospUDElec2) ||
                remainingCourses.contains(hospUDElec3)){
            stream.write(advisingNotes.hospitalityElecs.getBytes());
        }

        if(remainingCourses.contains(culminating1) || remainingCourses.contains(culminating2)){
            stream.write(advisingNotes.internshipInfo.getBytes());
        }

        if(internationalStatus.equals("Y")){
            stream.write(advisingNotes.internationalRestrictions.getBytes());
        }

        stream.write(advisingNotes.generalNotes.getBytes());
    }

    //void function utilized to print all courses student is eligible to take based on their current course history
    //takes existing output file as input parameter so it can be appended with appropriate advising information
    void printEligibleCourses(File outputFile){
        //beginning of try...catch block that attempts to write to an output file
        try{
            //FileOutputStream object is declared and provided outputFile is passed in append mode
            //This is to retain the previous information printed to the file and add appropriate advising information
            FileOutputStream stream = new FileOutputStream(outputFile, true);

            //top advising notes are printed by calling appropriate function and passing the output file stream variable
            printTopAdvisingNotes(stream);

            //the following header line is printed to the output file
            stream.write(("\nThese are the courses they currently qualify for under Hospitality (following the four-year plan):\n").getBytes());
            //for loop cycles through each object contained in eligibleCourses array and prints it to the output file
            for (Course eligibleCours : eligibleCourses) {
                stream.write((eligibleCours.courseNumber + "\n").getBytes());
            }

            //bottom advising notes are printed by calling appropriate function and passing the output file stream variable
            printBottomAdvisingNotes(stream);

            //close the output file stream
            stream.close();
        //if the file could not be found
        } catch (FileNotFoundException e) {
            //appropriate error message is printed
            System.out.println("Could not find the file." + e.toString());
        //if the function could not properly write to output file stream
        } catch (IOException e) {
            //appropriate error message is printed
            System.out.println("Error writing to the stream." + e.toString());
        }
    }
    //void function utilized to print all courses student has remaining based on their current course history
    //takes existing output file as input parameter so it can be appended with appropriate advising information
    void printRemainingCourses(File outputFile){
        //beginning of try...catch block that attempts to write to an output file
        try{
            //FileOutputStream object is declared and provided outputFile is passed in append mode
            //This is to retain the previous information printed to the file and add appropriate advising information
            FileOutputStream stream = new FileOutputStream(outputFile, true);

            //top advising notes are printed by calling appropriate function and passing the output file stream variable
            printTopAdvisingNotes(stream);

            //the following header line is printed to the output file
            stream.write("\nThese are the courses they have left under Hospitality:\n".getBytes());
            //for loop cycles through each object contained in remainingCourses array and prints it to the output file
            for (Course remainingCours : remainingCourses) {
                stream.write((remainingCours.courseNumber + "\n").getBytes());
            }

            //bottom advising notes are printed by calling appropriate function and passing the output file stream variable
            printBottomAdvisingNotes(stream);

            //close the output file stream
            stream.close();
        //if the file could not be found
        } catch (FileNotFoundException e) {
            //appropriate error message is printed
            System.out.println("Could not find the file." + e.toString());
        //if the function could not properly write to output file stream
        } catch (IOException e) {
            //appropriate error message is printed
            System.out.println("Error writing to the stream." + e.toString());
        }
    }

    //void function utilized to print one semester's worth of courses based on student's course history
    //takes existing output file as input parameter so it can be appended with appropriate advising information
    void createSemesterPlan(File outputFile){

        //prompt user to enter which semester they would like the plan for
        System.out.print("What semester would you like to create the plan for? ");
        //scanner object declared and next line is read into variable term
        Scanner inputTerm = new Scanner(System.in);
        String term = inputTerm.nextLine();

        //prompt user to enter how many courses for their specified term
        System.out.print("How many classes for the " + term + " term? ");
        //scanner object declared and next line is read into variable numOfCourses
        Scanner inputClasses = new Scanner(System.in);
        int numOfCourses = Integer.parseInt(inputClasses.nextLine());

        //integer variable credits is declared and initialized to 0 to be used in total semester count later on
        int credits = 0;

        //beginning of try...catch block that attempts to write to an output file
        try{
            //FileOutputStream object is declared and provided outputFile is passed in append mode
            //This is to retain the previous information printed to the file and add appropriate advising information
            FileOutputStream stream = new FileOutputStream(outputFile, true);

            //top advising notes are printed by calling appropriate function and passing the output file stream variable
            printTopAdvisingNotes(stream);

            //the following header line is printed to the output file
            stream.write(("\nRecommended courses for " + term + ":\n").getBytes());
            //for loop cycles through array of eligible courses until numOfCourses is reached
            for(int i = 0; i < numOfCourses; i++) {
                //each object in eligibleCourses is printed to output file
                stream.write((eligibleCourses.get(i).courseNumber + "\n").getBytes());
                //then, that course is marked as satisfied
                eligibleCourses.get(i).isSatisfied = true;
                //the credits of each course are added to credits variable
                credits += eligibleCourses.get(i).credits;
            }

            //total credits is printed to bottom of list of courses
            stream.write(("/ " + credits + " credits \n").getBytes());

            //an additional new line character is added for spacing
            stream.write("\n".getBytes());

            //header line is printed to denote alternative options
            stream.write(("And here are alternative options if the above are full:\n").getBytes());
            //for loop cycles through remaining course objects contained in eligibleCourses
            for(int i = numOfCourses; i < eligibleCourses.size(); i++) {
                //each course is printed as an alternative option to the already listed recommendations
                stream.write((eligibleCourses.get(i).courseNumber + "\n").getBytes());
            }

            //bottom advising notes are printed by calling appropriate function and passing the output file stream variable
            printBottomAdvisingNotes(stream);

            //close the output file stream
            stream.close();
        //if the file could not be found
        } catch (FileNotFoundException e) {
            //appropriate error message is printed
            System.out.println("Could not find the file." + e.toString());
        //if the function could not properly write to output file stream
        } catch (IOException e) {
            //appropriate error message is printed
            System.out.println("Error writing to the stream." + e.toString());
        }
    }

    //void function utilized to print a student't complete course plan through graduation
    //takes existing output file as input parameter so it can be appended with appropriate advising information
    void createGraduationPlan(File outputFile){
        //prompt user to enter how many classes would like to be taken each term
        System.out.print("How many classes per term? ");
        //scanner object is declared and value of next line is stored in classesPerTerm variable
        Scanner inputClasses = new Scanner(System.in);
        int classesPerTerm = Integer.parseInt(inputClasses.nextLine());

        //integer variable is set to number of course objects in remaining courses array
        int numClasses = remainingCourses.size();

        //number of terms left is determined by dividing total classes remaining by the classes per term
        int numOfTerms = numClasses / classesPerTerm;

        //beginning of try...catch block that attempts to write to an output file
        try{
            //FileOutputStream object is declared and provided outputFile is passed in append mode
            //This is to retain the previous information printed to the file and add appropriate advising information
            FileOutputStream stream = new FileOutputStream(outputFile, true);

            //print advising note regarding graduation to top of advising summary
            stream.write(advisingNotes.graduationCheck.getBytes());
            //print remaining notes to top of advising summary
            printTopAdvisingNotes(stream);

            //outside for loop cycles through each term until numOfTerms is reached
            for(int i = 0; i < numOfTerms; i++){
                stream.write("\n".getBytes());
                //header is provided at top of each term to denote number of semester
                stream.write(("Semester " + (i + 1) + ":\n").getBytes());

                //integer variable credits is declared and initialized to 0 to be used in total semester count later on
                int credits = 0;
                //beginning of try...catch block that catches index out of bound exception
                //this exception occurs once student has fewer classes left for one term than they originally planned for
                try{
                    //inner for loop cycles through each class to be planned for the current term
                    for(int j = 0; j < classesPerTerm; j++){
                        //each object in eligibleCourses is printed to output file
                        stream.write((eligibleCourses.get(j).courseNumber + "\n").getBytes());
                        //then, that course is marked as satisfied
                        eligibleCourses.get(j).isSatisfied = true;
                        //the credits of each course are added to credits variable
                        credits += eligibleCourses.get(j).credits;
                    }
                //if course planning reaches a point where the student has fewer courses left than variable classesPerTerm
                } catch (IndexOutOfBoundsException e) {
                    //function prints total credits at the end of the current term
                    stream.write(("/ " + credits + " credits\n").getBytes());
                    //and breaks out of outer for loop to complete the graduation plan
                    break;
                }

                /* if the try...catch block never reaches the exception, the function still prints total credits at
                end of current term */
                stream.write(("/ " + credits + " credits\n").getBytes());

                /* applyPrerequisites function is called at end of each term planning to acknowledge that as courses are
                planned, the student can use them as prerequisites for subsequent courses */
                applyPrerequisites();

                /* storeEligibleCourses function is called to update eligible courses array now that courses have been
                planned and are now considered to be satisfied (for the sake of planning) */
                storeEligibleCourses();
            }

            //print advising note regarding graduation ceremony under graduation plan
            stream.write(advisingNotes.gradCeremony.getBytes());

            //bottom advising notes are printed by calling appropriate function and passing the output file stream variable
            printBottomAdvisingNotes(stream);

            //close the output file stream
            stream.close();

        //if the file could not be found
        } catch (FileNotFoundException e) {
            //appropriate error message is printed
            System.out.println("Could not find the file." + e.toString());
        //if the function could not properly write to output file stream
        } catch (IOException e) {
            //appropriate error message is printed
            System.out.println("Error writing to the stream." + e.toString());
        }
    }
}
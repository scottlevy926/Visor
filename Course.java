package com.company;

//main body of class
public class Course {
    //following variables are declared to contain attributes of each individual course
    String courseNumber;
    boolean isSatisfied;
    boolean isPrereqMet;
    int credits;

    //constructor of class takes a string, two booleans, and an int as input parameters
    Course(String courseNumber, boolean isSatisfied, boolean isPrereqMet, int credits){
        //the provided string value is stored as the course number
        this.courseNumber = courseNumber;
        //the first provided boolean is stored to denote whether the course is satisfied
        this.isSatisfied = isSatisfied;
        //the second provided boolean is stored to denote whether the course's prerequisite has been met
        this.isPrereqMet = isPrereqMet;
        //the provided integer value is stored as the number of credits the course is worth
        this.credits = credits;
    }

    //function that returns true if the course has not been satisfied but the prerequisite has been met
    //this means that the student is eligible to take the course
    boolean isEligible() {
        return !isSatisfied && isPrereqMet;
    }

}

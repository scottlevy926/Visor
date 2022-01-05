package com.company;

//main body of class
public class CourseHistory {
    //object of type Hospitality is instantiated
    Hospitality requirements = new Hospitality();

    //constructor of the class takes two string arrays as input parameters
    CourseHistory(String[] studentHistory, String[] studentDemographics){

        //GPA variable of requirements object is set to value of index 6 of studentDemographics array
        requirements.GPA = Float.parseFloat(studentDemographics[6]);
        //GPB variable of requirements object is set to value of index 7 of studentDemographics array
        requirements.GPB = Float.parseFloat(studentDemographics[7]);
        //international status variable of requirements object is set to value of index 9 of studentDemographics array
        requirements.internationalStatus = studentDemographics[9];
        //work experience variable of requirements object is set to value of index 41 of studentHistory array
        requirements.workExperience = studentHistory[41];

        /* the following code evaluates value of each index of studentHistory array to determine whether the degree
        requirement is satisfied. If the index is equal to "Y," the corresponding degree requirement is marked as
        satisfied in the requirements object. Otherwise, the degree requirement is added to the array of remaining
        courses in the requirements object. */
        if(studentHistory[0].equals("Y")){
            requirements.firstYearSeminar.isSatisfied = true;
        } else{
            requirements.remainingCourses.add(requirements.firstYearSeminar);
        }
        if(studentHistory[1].equals("Y")){
            requirements.ENG101.isSatisfied = true;
        } else{
            requirements.remainingCourses.add(requirements.ENG101);
        }
        if(studentHistory[2].equals("Y")){
            requirements.ENG102.isSatisfied = true;
        } else{
            requirements.remainingCourses.add(requirements.ENG102);
        }
        if(studentHistory[3].equals("Y")){
            requirements.secondYearSeminar.isSatisfied = true;
        } else{
            requirements.remainingCourses.add(requirements.secondYearSeminar);
        }
        if(studentHistory[4].equals("Y")){
            requirements.constitution.isSatisfied = true;
        } else{
            requirements.remainingCourses.add(requirements.constitution);
        }
        if(studentHistory[5].equals("Y")){
            requirements.MATH120.isSatisfied = true;
        } else{
            requirements.remainingCourses.add(requirements.MATH120);
        }
        if(studentHistory[6].equals("Y")){
            requirements.labScience.isSatisfied = true;
        } else{
            requirements.remainingCourses.add(requirements.labScience);
        }
        if(studentHistory[7].equals("Y")){
            requirements.nonLabScience.isSatisfied = true;
        } else{
            requirements.remainingCourses.add(requirements.nonLabScience);
        }
        if(studentHistory[8].equals("Y")){
            requirements.analyticalThink.isSatisfied = true;
        } else{
            requirements.remainingCourses.add(requirements.analyticalThink);
        }
        if(studentHistory[9].equals("Y")){
            requirements.COM101.isSatisfied = true;
        } else{
            requirements.remainingCourses.add(requirements.COM101);
        }
        if(studentHistory[10].equals("Y")){
            requirements.humanities.isSatisfied = true;
        } else{
            requirements.remainingCourses.add(requirements.humanities);
        }
        if(studentHistory[11].equals("Y")){
            requirements.fineArts.isSatisfied = true;
        } else{
            requirements.remainingCourses.add(requirements.fineArts);
        }
        if(studentHistory[12].equals("Y")){
            requirements.multicultural.isSatisfied = true;
        } else{
            requirements.remainingCourses.add(requirements.multicultural);
        }
        if(studentHistory[13].equals("Y")){
            requirements.international.isSatisfied = true;
        } else{
            requirements.remainingCourses.add(requirements.international);
        }
        if(studentHistory[14].equals("Y")){
            requirements.HMD101.isSatisfied = true;
        } else{
            requirements.remainingCourses.add(requirements.HMD120);
        }
        if(studentHistory[15].equals("Y")){
            requirements.HMD120.isSatisfied = true;
        } else{
            requirements.remainingCourses.add(requirements.HMD120);
        }
        if(studentHistory[16].equals("Y")){
            requirements.HMD130.isSatisfied = true;
        } else{
            requirements.remainingCourses.add(requirements.HMD130);
        }
        if(studentHistory[17].equals("Y")){
            requirements.HMD200.isSatisfied = true;
        } else{
            requirements.remainingCourses.add(requirements.HMD200);
        }
        if(studentHistory[18].equals("Y")){
            requirements.HMD205.isSatisfied = true;
        } else{
            requirements.remainingCourses.add(requirements.HMD205);
        }
        if(studentHistory[19].equals("Y")){
            requirements.HMD220.isSatisfied = true;
        } else{
            requirements.remainingCourses.add(requirements.HMD220);
        }
        if(studentHistory[20].equals("Y")){
            requirements.HMD221.isSatisfied = true;
        } else{
            requirements.remainingCourses.add(requirements.HMD221);
        }
        if(studentHistory[21].equals("Y")){
            requirements.HMD225.isSatisfied = true;
        } else{
            requirements.remainingCourses.add(requirements.HMD225);
        }
        if(studentHistory[22].equals("Y")){
            requirements.HMD305.isSatisfied = true;
        } else{
            requirements.remainingCourses.add(requirements.HMD305);
        }
        if(studentHistory[23].equals("Y")){
            requirements.HMD310.isSatisfied = true;
        } else{
            requirements.remainingCourses.add(requirements.HMD310);
        }
        if(studentHistory[24].equals("Y")){
            requirements.HMD330.isSatisfied = true;
        } else{
            requirements.remainingCourses.add(requirements.HMD330);
        }
        if(studentHistory[25].equals("Y")){
            requirements.HMD340.isSatisfied = true;
        } else{
            requirements.remainingCourses.add(requirements.HMD340);
        }
        if(studentHistory[26].equals("Y")){
            requirements.HMD350.isSatisfied = true;
        } else{
            requirements.remainingCourses.add(requirements.HMD350);
        }
        if(studentHistory[27].equals("Y")){
            requirements.HMD405.isSatisfied = true;
        } else{
            requirements.remainingCourses.add(requirements.HMD405);
        }
        if(studentHistory[28].equals("Y")){
            requirements.HMD440.isSatisfied = true;
        } else{
            requirements.remainingCourses.add(requirements.HMD440);
        }
        if(studentHistory[29].equals("Y")){
            requirements.culminating1.isSatisfied = true;
        } else{
            requirements.remainingCourses.add(requirements.culminating1);
        }
        if(studentHistory[30].equals("Y")){
            requirements.culminating2.isSatisfied = true;
        } else{
            requirements.remainingCourses.add(requirements.culminating2);
        }
        if(studentHistory[31].equals("Y")){
            requirements.hospLDElec1.isSatisfied = true;
        } else{
            requirements.remainingCourses.add(requirements.hospLDElec1);
        }
        if(studentHistory[32].equals("Y")){
            requirements.hospLDElec2.isSatisfied = true;
        } else{
            requirements.remainingCourses.add(requirements.hospLDElec2);
        }
        if(studentHistory[33].equals("Y")){
            requirements.hospUDElec1.isSatisfied = true;
        } else{
            requirements.remainingCourses.add(requirements.hospUDElec1);
        }
        if(studentHistory[34].equals("Y")){
            requirements.hospUDElec2.isSatisfied = true;
        } else{
            requirements.remainingCourses.add(requirements.hospUDElec2);
        }
        if(studentHistory[35].equals("Y")){
            requirements.hospUDElec3.isSatisfied = true;
        } else{
            requirements.remainingCourses.add(requirements.hospUDElec3);
        }
        if(studentHistory[36].equals("Y")){
            requirements.openElec1.isSatisfied = true;
        } else{
            requirements.remainingCourses.add(requirements.openElec1);
        }
        if(studentHistory[37].equals("Y")){
            requirements.openElec2.isSatisfied = true;
        } else{
            requirements.remainingCourses.add(requirements.openElec2);
        }
        if(studentHistory[38].equals("Y")){
            requirements.openElec3.isSatisfied = true;
        } else{
            requirements.remainingCourses.add(requirements.openElec3);
        }
        if(studentHistory[39].equals("Y")){
            requirements.openElec4.isSatisfied = true;
        } else{
            requirements.remainingCourses.add(requirements.openElec4);
        }
        if(studentHistory[40].equals("Y")){
            requirements.openElec5.isSatisfied = true;
        } else{
            requirements.remainingCourses.add(requirements.openElec5);
        }

        //applyPrerequisites function of the requirements object is called to determine which courses have their
        //prerequisite met based on those that were marked as satisfied above
        requirements.applyPrerequisites();
    }
}


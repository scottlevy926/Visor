package com.company;

//main body of class
public class AdvisingNotes {

    /* this class contains several string variables that are added to the output file to complete the student's advising
    summary. The notes refer to various aspects of the student's degree requirements that necessitate additional information.*/

    String graduationCheck = "\nGRADUATION CHECK\n" +
            "I understand that I must complete the classes listed below in order to graduate.  If I fail to complete all \n" +
            "requirements, it is my responsibility to update my graduation semester with the Office of the Registrar (SSC-C).  \n" +
            "I am aware that my academic catalog is only valid for 10 years from the date of issue and prolonging my \n" +
            "graduation could result in additional requirements being added to my degree program before a degree will be \n" +
            "issued.\n" +
            "\n" +
            "IMPORTANT: One semester prior to your intended graduation date, it is your responsibility to log into MyUNLV, \n" +
            "go to the Academic Records tile and apply for graduation. Please make sure you apply only for the semester you \n" +
            "intend to complete ALL requirements.\n";

    String GPAalert = "\n**GPA ALERT**\n" +
            "Right now your GPA is below a 2.0. You must earn a 2.0 GPA for graduation and to avoid further probation or \n" +
            "possible suspension.\n";

    String universitySuspension = "\n**UNIVERSITY SUSPENSION**\n" +
            "You have been suspended due to poor academic progress.  You are required to sit out for one year from the date \n" +
            "your suspension was entered into the system.  \n" +
            "You will be eligible to return the semester of _____.  If you do not return that semester you will have to reapply \n" +
            "for future enrollment. \n" +
            "Prior to your return you will need to meet with your Advisor during the ____ semester to make a plan for future \n" +
            "terms and to have your Advising Hold removed.  \n" +
            "You can attend CSN during the year that you are waiting (Do not repeat any classes at CSN that you have taken \n" +
            "at UNLV) and you can take:\n";

    String riskOfSuspension = "\n**RISK OF SUSPENSION**\n" +
            "Based on your current GPA, you may be suspended once your final grades posts. If you are placed on university \n" +
            "suspension, you will be required to sit out for one year and will be eligible to return _________. It is \n" +
            "recommended to take courses at CSN while you are away, however, it is not recommended to retake failed courses \n" +
            "outside of UNLV. You will need to meet with an advisor during ________ semester prior to your enrollment into \n" +
            "_________ courses.\n";

    String workExperience = "\n**WORK EXPERIENCE**\n" +
            "1,000 HOURS OF WORK EXPERIENCE MUST BE COMPLETED AND VERIFIED BY THE BOB BOUGHNER CAREER CENTER \n" +
            "(HOS 128, 702-895-5554) ONE MONTH PRIOR TO GRADUATION. \n";

    String englishPlacementScores = "\n**ENGLISH PLACEMENT SCORES**\n" +
            "All students intending to earn a degree from UNLV must satisfy the composition requirement of ENG 101 and \n" +
            "ENG 102. English Composition requirements must be completed by the end of your freshman year. For placement \n" +
            "information contact the English Department (RLL) 702-895-3533 or visit https://www.unlv.edu/english/composition.\n\n";

    String mathPlacementScores = "\n**MATH PLACEMENT SCORES**\n" +
            "All students intending to earn a degree from UNLV must satisfy the Math course requirement by the end of your \n" +
            "freshman year. For placement information contact the Math Department (CDC Blg. 8) 702-895-3567 or visit \n" +
            "https://www.unlv.edu/math/placementoptions.\n\n";

    String secondYearSeminar = "\n**SECOND YEAR SEMINAR**\n" +
            "All admitted students must complete a Second Year Seminar (SYS) by the end of their second year at UNLV. \n" +
            "Currently approved SYS courses include: COE 202, ENG 231, ENG 232, or PBH 205 (choose one).\n\n";

    String lifePhysicalScience = "\n**LIFE & PHYSICAL SCIENCE COURSES**\n" +
            "Lab Science: BIOL 100, AST 103+105, AST 104 + 105, GEOL 101, GEOG 103+104, ANTH 102 + 110L (pick one lecture + lab).\n" +
            "Non-Lab Science:  ENV 101, ANTH 102, AST 103, AST 104, GEOL 100, GEOG 103, EGG 100, or NUTR 121.\n\n";

    String analyticalThink = "\n**ANALYTICAL THINKING**\n" +
            "The analytical thinking requirement can be satisfied by taking COM 104, 217, or PHIL 102 (pick one)\n\n";

    String fineArts = "\n**FINE ARTS**\n" +
            "Suggested Fine Arts:  ART 101, 160, DAN 100, 101, 103, 166*; FIS 100, 110, MUS 101, 121, 125, 134*; \n" +
            "THTR 100**, 105, 124*. (pick one) *Meets Multicultural **Meets International\n\n";

    String humanities = "\n**HUMANITIES**\n" +
            "Humanities elective can be satisfied by taking a History, Philosophy (except 102, 105 or 114) or Foreign \n" +
            "Language** course. We suggest: HIST 103**, HIST 212**, HIST 110*, PHIL 101, AAD 201/201D*, AAS/ENG 290*, \n" +
            "AAS 491/ENG 495A*, AAS 492/ENG 495B*, ENG 292*, ENG 494A*, ENG 496A*, ENG 496C*.  (Choose one) \n" +
            "*Meets Multicultural. **Meets International.\n\n";

    String multiculturalRequirement = "\n**MULTICULTURAL REQUIREMENT**\n" +
            "As of this date, you have not completed this requirement. See your program worksheet for ways to satisfy these \n" +
            " requirements within your program. Check the complete list of approved courses before enrolling: \n" +
            "https://www.unlv.edu/provost/multicultural-requirements.\n\n";

    String internationalRequirement = "\n**INTERNATIONAL REQUIREMENT**\n" +
            "As of this date, you have not completed this requirement. See your program worksheet for ways to satisfy these \n" +
            "requirements within your program. Check the complete list of approved courses before enrolling: \n" +
            "https://www.unlv.edu/provost/multicultural-requirements.\n\n";

    String upperdivision = "\n**UPPER DIVISION: PRE-MAJOR COMPLETION**\n" +
            "Enrollment in required upper division core courses (those with 300 or 400 numbers) will not be allowed if you \n" +
            "have not satisfactorily completed ENG 102/114, MATH 120, and HMD 101. You must also be in good academic standing \n" +
            "with an overall GPA of 2.0, AND BE A MAJOR IN THE HARRAH COLLEGE OF HOSPITALITY.\n\n";

    String hospitalityElecs = "\n**HOSPITALITY ELECTIVES**\n" +
            "Hospitality electives include courses with the prefix FAB, GAM, HMD, & TCA that do not appear on your \n" +
            "worksheet as a required class.  If you are thinking of declaring a concentration, be sure to talk with an \n" +
            "advisor before enrolling in elective courses. Courses numbered from 300-400 are considered upper division (UD). \n" +
            "FAB 333, GAM 442 or HMD 320 will satisfy the Multicultural requirement.  FAB 470, TCA 331 or 449 will satisfy \n" +
            "the International requirement.\n\n";

    String mathNotes = "\n***MATH Release***\n" +
            "\n" +
            "______I understand that I am being given a onetime permission to take two upper division Hospitality Core classes \n" +
            "without the requisite of MATH 124/MATH120. I will register in math as soon as possible because I know that if \n" +
            "I need math remediation; my graduation plan could be delayed as much as four semesters.  I also understand that \n" +
            "I will not be able to register for upper division classes on my own until I have completed MATH 124/MATH120.\n" +
            "\n" +
            "**MATH Alert**\n" +
            "\n" +
            "______ I understand that I have not completed my MATH 124/MATH120requirement. I know that I must complete this \n" +
            "requirement no later than __________ because I know that if I need math remediation coursework, it could delay \n" +
            "graduation as much as four semesters. I also understand that I will not be able to register for upper division \n" +
            "classes on my own until I have completed MATH 124/MATH120 with a passing grade.\n\n";

    String internshipInfo = "\n**INTERNSHIP INFORMATION**\n" +
            "You must get permission to register BEFORE you start the internship & be enrolled in the internship class \n" +
            "while you are completing the internship hours.  Instructor consent is required to register in the internship \n" +
            "course.  See the Hotel Career Center (HOS 128) (702-895-5554) (boughnercareerservices@unlv.edu) for all \n" +
            "internship approvals.\n\n";

    String gradCeremony = "\n**GRADUATION CEREMONY**\n" +
            "Students who have filed for August graduation can request permission to participate in May commencement \n" +
            "through the Office of the Registrar (SSC-C).  Decisions will be made on a case by case basis. August and \n" +
            "December graduates should participate in winter commencement.\n\n";

    String internationalRestrictions = "\nINTERNATIONAL RESTRICTIONS\n" +
            "1. You must be enrolled in 12 credits with a minimum of 9 credits of in-person (on campus) class.\n" +
            "2. Your final semester is the only term you can be part-time, and your schedule must still include an in-person (on campus) class. \n" +
            "   Note: if you fail one of your final classes, you will have one chance to be part-time again to take that class over and pass it.\n" +
            "3. You cannot take only an internship in Fall or Spring EVER. You must be enrolled in at least one in-person (on campus) class.\n" +
            "4. You are only able to take an internship out-of-state in the Summers. Must obtain permission from OISS.\n" +
            "5. CPT is required for all work in the U.S. (paid, unpaid or volunteer) or OPT could be affected.\n" +
            "6. OPT – apply 90 days prior to the end of your final semester.\n\n";

    String generalNotes = "\n**ENROLLMENT TROUBLE**\n" +
            "If MyUNLV is preventing you from enrolling into a Hospitality course for which you meet the prerequisite, \n" +
            "please complete the course permission request form available at https://www.unlv.edu/hospitality/advising. \n" +
            "For enrollment trouble in other courses, please contact the respective department housing the course.\n" +
            "\n" +
            "\n**HOSPITALITY COLLEGE CAREER EMAIL LIST**\n" +
            "Sign-up for the emailing list to receive information on internship/management training program applications, \n" +
            "full-time and part-time jobs, career events, employer information sessions, and more! Join at \n" +
            "http://tinyurl.com/BBC-Email-List.\n" +
            "\n\n\n\n\n" +
            "Student__________________________\n" +
            "Please take a moment to complete the advising survey that will be sent to your Rebelmail post your advising \n" +
            "appointment.\n" +
            "\n" +
            "Like us on Facebook https://www.facebook.com/UnlvHSPAdvising\n" +
            "\n" +
            "============================================================================\n" +
            "WAITLIST: You cannot be enrolled in the same class twice for the same semester.  If a spot opens for the one \n" +
            "you are wait listed for, and you are currently enrolled in another section of the same class, the system will \n" +
            "not add you to the new section.  \n" +
            "\n" +
            "PLAN OF STUDY NOTE: \n" +
            "All suggested course plans are subject to course availability. Listing courses in a course plan above, does \n" +
            "not guarantee that the courses will be offered in the future semesters indicated. Consult semester class \n" +
            "schedule as they are made available.\n" +
            "\n" +
            "OVERLOADS AND CREDIT LIMITS \n" +
            "**Maximum credits for Fall/Spring** 18 credits (Freshmen - 17credits)\n" +
            "**Maximum credits for Summer** Session 1 = 3 credits / Session 2 = 6 credits / Session 3 = 6 credits\n" +
            "To take an additional class in any of the above terms, you must have a 3.00 or higher GPA and obtain overload \n" +
            "approval before classes begin.\n\n";

}

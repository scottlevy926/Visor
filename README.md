# Visor
Academic Advising Tool

Our project will be a software program called VISOR that can serve as an advising tool for colleges and universities. Currently, there is no such product in use, and we believe VISOR has the opportunity to streamline and simplify a process that can normally be cumbersome.

Normally, an advisor would have to manually match up a student’s course history with their program requirements in order to advise them on which classes they should take for the following semester. This can be a time-consuming process. VISOR is meant to automate that process, by allowing an advisor to simply input a student’s ID# and receive multiple output options to help them recommend a course plan. It would serve as a tool that maximizes efficiency and accuracy and more ways to store and retrieve information. This program would open great opportunities to continue to implement new steps that would increase the performance and automate a whole section of, if not whole departments. 

In our prototype, we are using a spreadsheet which contains each student’s general information, along with a list of their program requirements. Each class within their program requirements is assigned a boolean operator to indicate whether or not the student has already taken that course. The program also accounts for class prerequisites, and that information is contained within the spreadsheet as well.

Upon running the program, the user is asked to input a student’s unique identifier (this could be a name or ID#). If the program cannot match the input with any student in the spreadsheet, it will output an error message and ask the user to try again. If the program does match the input with a student, it will then give the user four options:

-See the student’s remaining required courses

-See all the courses the student is eligible to take the following semester based on completed prerequisites

-See the student’s suggested courses for the following semester

-See the student’s complete graduation program

If the user does not select a valid option, the program will display an error message and ask the user to try again. Once the user has selected a valid option, the program will display the desired output. The advisor will then have all the relevant information they need to properly advise the student. The advisor would then ideally be able to print out a nicely formatted Word document of the just outputted student schedule.

That is the basic premise of how VISOR will run. Additionally, we would like to attach a graphical user interface to the program including one search box which would serve to search the student ID and another box asking for the advisor to input their name. As mentioned, with such a program, VISOR will boost efficiency and accuracy making it possible to add more flexibility to current staff members.



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

*/
package University;

import College.College;
import CourseSchedule.CourseLoad;
import CourseSchedule.CourseOffer;
import CourseSchedule.CourseSchedule;
import CourseSchedule.SeatAssignment;
import Department.Department;
import Persona.Person;
import Persona.PersonDirectory;
import Employee.EmployeeDirectory;
import Employee.EmployeeProfile;
import Faculty.FacultyDirectory;
import Faculty.FacultyProfile;
import Persona.Address;
import Student.StudentDirectory;
import Student.StudentProfile;
import Student.Transcript;

import UserAccounts.UserAccount;
import UserAccounts.UserAccountDirectory;


/**
 *
 * @author vrmohanc
 */
class ConfigureUniversity {

    static University initialize() {
        College college = new College("Engineering College");
        PersonDirectory personDirectory = new PersonDirectory(); 
        EmployeeDirectory employeeDirectory = new EmployeeDirectory();
        UserAccountDirectory userAccountDirectory = new UserAccountDirectory();
        StudentDirectory studentDirectory = new StudentDirectory();
        FacultyDirectory facultyDirectory = new FacultyDirectory();
        
        //link directories to university instance and pass it to app/login page
        University university = new University("NEW University", college, personDirectory,
            employeeDirectory, userAccountDirectory, studentDirectory, facultyDirectory);
        
        //create departments
        Department department1 = university.getCollege().newDepartment("Computer Science");
        Department department2 = university.getCollege().newDepartment("Information Technology");
        
        //Create courses
        department1.newCourse("High-Performance Computing", "EECE 5640",4);
        department1.newCourse("Introduction to Software Security", "EECE 5641", 4);
        department1.newCourse("Combinatorial Optimization", "EECE 5360", 4);
        department1.newCourse("Mobile Robotics", "EECE 5550", 4);
        department2.newCourse("Computer System Security", "CY 5130", 4);
        department2.newCourse("Mobile and Wireless Networking", "EECE 7364", 4);
        department2.newCourse("Web Design and User Experience Engineering", "INFO 6150", 4);
        department2.newCourse("Agile Software Development", "INFO 7245", 4);
        
        
        // Create Persons
        
        Person person001 = personDirectory.newPerson("ID1234", "John", "Smith", "10-16-1990"); //employee
        Person person002 = personDirectory.newPerson("ID3456", "Gina", "Montana", "11-15-1980"); //faculty
        Person person003 = personDirectory.newPerson("ID7890", "Adam", "Rollen", "09-10-2003"); //student
        Person person005 = personDirectory.newPerson("ID7845", "Jim", "Dellon", "01-01-2004"); //student
        Person person006 = personDirectory.newPerson("ID7845", "Anna", "Shnider", "01-01-2004"); //faculty
    
        //Person person001 = personDirectory.newPerson("John Smith"); //employee
        
        
        //creating address for faculty
        person002.getAddress().setLine1("127 Chipmunk Lane"); 
        person002.getAddress().setLine2("Unit 1");
        person002.getAddress().setCity("Portland");
        person002.getAddress().setState("NY");
        person002.getAddress().setZipCode("14202");
        
        person006.getAddress().setLine1("11 Valley View Drive");
        person006.getAddress().setLine2("");
        person006.getAddress().setCity("West Roxbury");
        person006.getAddress().setState("MA");
        person006.getAddress().setZipCode("02132");
        
        
        //Person person003 = personDirectory.newPerson("Adam Rollen"); //student

 
        
        //Person person007 = personDirectory.newPerson("Laura Brown");
        //Person person008 = personDirectory.newPerson("Jack While");
        //Person person009 = personDirectory.newPerson("Fidelity"); //we use this as customer

        // Create Admins to manage the univ
        
        EmployeeProfile employeeprofile0 = employeeDirectory.newEmployeeProfile(person001); //John Smith as employee username admin
        

        
        // create faculty      
        FacultyProfile facultyprofile0 = facultyDirectory.newFacultyProfile(person002); //Gina Montana as faculty username gina
        facultyprofile0.setDepartment(department1);
        facultyprofile0.setResearchArea("Artificial Intelligence");
        facultyprofile0.setTitle("Professor");
        
        FacultyProfile facultyprofile1 = facultyDirectory.newFacultyProfile(person006); //Anna Shnider as faculty username anna
        facultyprofile1.setDepartment(department1);
        facultyprofile1.setResearchArea("Encryption");
        facultyprofile1.setTitle("Professor");
        
        // create students       
        
        StudentProfile studentprofile0 = studentDirectory.newStudentProfile(person003); //Adam Rollen as student username adam
        StudentProfile studentprofile1 = studentDirectory.newStudentProfile(person005); //Jim Dellon as student username jim
        
        studentprofile0.setDepartment(facultyprofile0.getDepartment()); //assign computer science engg
        studentprofile0.setProgramEnrolled("MSIS");
        studentprofile0.setInstructionMode("Online");
        studentprofile0.setnUID("NUID46537");
        
        studentprofile1.setDepartment(facultyprofile0.getDepartment()); //assign computer science engg
        studentprofile1.setProgramEnrolled("MSDS");
        studentprofile1.setInstructionMode("OnCampus");
        studentprofile1.setnUID("NUID756893");
        
         //Create course schedule and offer with faculty assignments
         
        CourseSchedule csSpring2026 = department1.newCourseSchedule("Spring 2026");
        CourseOffer co1 = csSpring2026.newCourseOffer("EECE 5640"); 
        co1.generatSeats(15);
        co1.AssignAsTeacher(facultyprofile1);
        CourseOffer co2 = csSpring2026.newCourseOffer("EECE 5641");
        co2.AssignAsTeacher(facultyprofile0);
        co2.generatSeats(15);
        CourseOffer co3 = csSpring2026.newCourseOffer("EECE 5360");
        co3.generatSeats(10);
        co3.AssignAsTeacher(facultyprofile1);
        CourseOffer co4 = csSpring2026.newCourseOffer("EECE 5550");
        co4.generatSeats(18);
        co4.AssignAsTeacher(facultyprofile0);
        
        //Create student courseload, seat assignment, and grade
        Transcript transcript1 = studentprofile0.getTranscript();
        CourseLoad cl01Spring2026 = studentprofile0.newCourseLoad("Spring 2026");
        SeatAssignment sa1 = cl01Spring2026.newSeatAssignment(co1);
        SeatAssignment sa2 = cl01Spring2026.newSeatAssignment(co2);
        SeatAssignment sa3 = cl01Spring2026.newSeatAssignment(co3);
        SeatAssignment sa4 = cl01Spring2026.newSeatAssignment(co4);
        sa1.setGrade(3.7f);
        sa2.setGrade(4.0f);
        sa3.setGrade(3.3f);
        sa4.setGrade(3.3f);
        
        Transcript transcript2 = studentprofile1.getTranscript();
        CourseLoad cl02Spring2026 = studentprofile1.newCourseLoad("Spring 2026");
        SeatAssignment sa5 = cl02Spring2026.newSeatAssignment(co1);
        SeatAssignment sa6 = cl02Spring2026.newSeatAssignment(co2);
        SeatAssignment sa7 = cl02Spring2026.newSeatAssignment(co3);
        SeatAssignment sa8 = cl02Spring2026.newSeatAssignment(co4);
        sa5.setGrade(3.0f);
        sa6.setGrade(3.7f);
        sa7.setGrade(3.0f);
        sa8.setGrade(3.3f);        
        
        
        //Create hobbies and interests for students
        studentprofile0.addHobbies("Basketball");
        studentprofile0.addHobbies("Traveling");
        studentprofile0.addHobbies("Skiing");
        studentprofile0.addHobbies("Reading");
        studentprofile0.addInterests("Video game development");
        studentprofile0.addInterests("Artificial Intelligence");
        studentprofile0.addInterests("Cloud Computing");
        
        studentprofile1.addHobbies("Photography");
        studentprofile1.addHobbies("Hiking");
        studentprofile1.addHobbies("Golf");
        studentprofile1.addHobbies("Video games");
        studentprofile1.addInterests("Artificial Intelligence");
        studentprofile1.addInterests("Virtual Reality");
        studentprofile1.addInterests("Data Science");
        
        

   
        // Create User accounts that link to specific profiles
        
        UserAccount ua1 = userAccountDirectory.newUserAccount(facultyprofile1, "anna", "*123");
        ua1.setStatus("Active"); //set status active
        
        UserAccount ua3 = userAccountDirectory.newUserAccount(employeeprofile0, "admin", "****");
        ua3.setStatus("Active"); //set status active
        
        UserAccount ua4 = userAccountDirectory.newUserAccount(studentprofile0, "adam", "****");
        ua4.setStatus("Active"); //set status active
        //studentprofile0.setnUID("NUID123");
        //studentprofile1.setnUID("NUID456");
        
        UserAccount ua6 = userAccountDirectory.newUserAccount(studentprofile1, "jim", "1234");
        ua6.setStatus("Active"); //set status active
        
        UserAccount ua5 = userAccountDirectory.newUserAccount(facultyprofile0, "gina", "*123");
        ua5.setStatus("Active"); //set status active
        
        return university;

    }

}

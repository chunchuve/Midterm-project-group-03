/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

*/
package University;

import College.College;
import Department.Department;
import Persona.Person;
import Persona.PersonDirectory;
import Employee.EmployeeDirectory;
import Employee.EmployeeProfile;
import Faculty.FacultyDirectory;
import Faculty.FacultyProfile;
import Student.StudentDirectory;
import Student.StudentProfile;

import UserAccounts.UserAccount;
import UserAccounts.UserAccountDirectory;


/**
 *
 * @author kal bugrara
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
        University university = new University("Information Systems", college, personDirectory,
            employeeDirectory, userAccountDirectory, studentDirectory, facultyDirectory);
        
    //Create department
        Department department001 = college.newDepartment("Computer Science");
        department001.newCourse("INFO 5100", "Application Engineering and Development", 4); //create new course
        department001.newCourse("EECE 5641", "Introduction to Software Security", 4); //create new course
        
        
        Department department002 = college.newDepartment("Bioengineering");
        Department department003 = college.newDepartment("Civil & Environmental Engineering");
// Create Persons
        
        Person person001 = personDirectory.newPerson("John Smith"); //employee
        Person person002 = personDirectory.newPerson("Gina Montana"); //faculty
        Person person003 = personDirectory.newPerson("Adam Rollen"); //student
 
        Person person005 = personDirectory.newPerson("Jim Dellon"); //student
        Person person006 = personDirectory.newPerson("Anna Shnider");
        Person person007 = personDirectory.newPerson("Laura Brown");
        Person person008 = personDirectory.newPerson("Jack While");
        Person person009 = personDirectory.newPerson("Fidelity"); //we use this as customer

// Create Admins to manage the univ
        
        EmployeeProfile employeeprofile0 = employeeDirectory.newEmployeeProfile(person001); //John Smith as employee username admin
        
// create students       
        
        StudentProfile studentprofile0 = studentDirectory.newStudentProfile(person003); //Adam Rollen as student username adam
        StudentProfile studentprofile1 = studentDirectory.newStudentProfile(person005); //Jim Dellon as student username jim
        
// create faculty      
        FacultyProfile facultyprofile0 = facultyDirectory.newFacultyProfile(person002); //Gina Montana as faculty username gina
        facultyprofile0.setTitle("Professor");
        facultyprofile0.setResearchArea("Computer Engineering");
        facultyprofile0.setDepartment(department001); //set department to Computer Science
   
// Create User accounts that link to specific profiles
        
        UserAccount ua3 = userAccountDirectory.newUserAccount(employeeprofile0, "admin", "****");
        ua3.setStatus("Active"); //set status active
        
        UserAccount ua4 = userAccountDirectory.newUserAccount(studentprofile0, "adam", "****");
        ua4.setStatus("Active"); //set status active
        studentprofile0.setnUID("NUID123");
        studentprofile1.setnUID("NUID456");
        
        UserAccount ua6 = userAccountDirectory.newUserAccount(studentprofile1, "jim", "1234");
        ua6.setStatus("Active"); //set status active
        
        UserAccount ua5 = userAccountDirectory.newUserAccount(facultyprofile0, "gina", "*123");
        ua5.setStatus("Active"); //set status active
        
        return university;

    }

}

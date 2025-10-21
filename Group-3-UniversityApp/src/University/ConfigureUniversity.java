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
import Persona.Address;
import Student.StudentDirectory;
import Student.StudentProfile;

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
        Department department1 = university.getCollege().newDepartment("Computer Science Engg.");
        Department department2 = university.getCollege().newDepartment("Information Technology");
        
// Create Persons
        
        Person person001 = personDirectory.newPerson("ID1234", "John", "Smith", "10-16-1990"); //employee
        Person person002 = personDirectory.newPerson("ID3456", "Gina", "Montana", "11-15-1980"); //faculty
        Person person003 = personDirectory.newPerson("ID7890", "Adam", "Rollen", "09-10-2003"); //student
 
        Person person005 = personDirectory.newPerson("ID7845", "Jim", "Dellon", "01-01-2004"); //student
        //Person person006 = personDirectory.newPerson("Anna Shnider");
        //Person person007 = personDirectory.newPerson("Laura Brown");
        //Person person008 = personDirectory.newPerson("Jack While");
        //Person person009 = personDirectory.newPerson("Fidelity"); //we use this as customer

// Create Admins to manage the univ
        
        EmployeeProfile employeeprofile0 = employeeDirectory.newEmployeeProfile(person001); //John Smith as employee username admin
        

        
// create faculty      
        FacultyProfile facultyprofile0 = facultyDirectory.newFacultyProfile(person002); //Gina Montana as faculty username gina
        facultyprofile0.setDepartment(department1);
        facultyprofile0.setResearchArea("Artificial Intelligence");
        
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

   
// Create User accounts that link to specific profiles
        
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

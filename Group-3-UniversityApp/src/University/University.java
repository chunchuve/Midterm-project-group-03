/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package University;

import Persona.PersonDirectory;
import Employee.EmployeeDirectory;
import Student.StudentDirectory;
import Faculty.FacultyDirectory;
import UserAccounts.UserAccountDirectory;
import Department.Department;
import College.College;
import Employee.AdmissionsDirectorProfile;

/**
 *
 * @author vrmohanc
 */
public class University {

    String name;
    College college; //list of departments
    
    PersonDirectory persondirectory; //all people profiles regardless of the role
    
    EmployeeDirectory employeedirectory;
    UserAccountDirectory useraccountdirectory;
    StudentDirectory studentdirectory;
    FacultyDirectory facultydirectory;


    public University(String n) {
        name = n;
        //college = new College("Engineering College"); //~department directory //create outside the University
        
       
        //create a department
        //Department d = new Department("CS"); //create this instance outside the University
        
        persondirectory = new PersonDirectory(); 
        employeedirectory = new EmployeeDirectory();
        useraccountdirectory = new UserAccountDirectory();
        studentdirectory = new StudentDirectory();
        facultydirectory = new FacultyDirectory();
        
        //Department should have a link to directory
        //set the values of directories with the directory instances I created
        
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public PersonDirectory getPersondirectory() {
        return persondirectory;
    }

    public void setPersondirectory(PersonDirectory persondirectory) {
        this.persondirectory = persondirectory;
    }

    public EmployeeDirectory getEmployeedirectory() {
        return employeedirectory;
    }

    public void setEmployeedirectory(EmployeeDirectory employeedirectory) {
        this.employeedirectory = employeedirectory;
    }

    public UserAccountDirectory getUseraccountdirectory() {
        return useraccountdirectory;
    }

    public void setUseraccountdirectory(UserAccountDirectory useraccountdirectory) {
        this.useraccountdirectory = useraccountdirectory;
    }

    public StudentDirectory getStudentdirectory() {
        return studentdirectory;
    }

    public void setStudentdirectory(StudentDirectory studentdirectory) {
        this.studentdirectory = studentdirectory;
    }

    public PersonDirectory getPersonDirectory() {
        return persondirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return useraccountdirectory;
    }


    public EmployeeDirectory getEmployeeDirectory() {
        return employeedirectory;
    }

    public StudentDirectory getStudentDirectory(){
        return studentdirectory;
    }

    public FacultyDirectory getFacultydirectory() {
        return facultydirectory;
    }
    
}

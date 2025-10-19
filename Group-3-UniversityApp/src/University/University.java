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
//import Department.Department;
import College.College;
//import Employee.AdmissionsDirectorProfile;

/**
 *
 * @author vrmohanc
 */
public class University {

    String name;
    College college; //list of departments
    
    PersonDirectory personDirectory; //all people profiles regardless of the role
    
    EmployeeDirectory employeeDirectory;
    UserAccountDirectory userAccountDirectory;
    StudentDirectory studentDirectory;
    FacultyDirectory facultyDirectory;
    

    public University(String n, College college, PersonDirectory personDirectory, EmployeeDirectory employeeDirectory, 
            UserAccountDirectory userAccountDirectory,
                    StudentDirectory studentDirectory, FacultyDirectory facultyDirectory) {
        name = n;
        
        //college = new College("Engineering College"); //per UML it is a composition - create outside the University?
        
        this.college = college;
        this.personDirectory = personDirectory; 
        this.employeeDirectory = employeeDirectory;
        this.userAccountDirectory = userAccountDirectory;
        this.studentDirectory = studentDirectory;
        this.facultyDirectory = facultyDirectory;
        
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
        return personDirectory;
    }

    public void setPersondirectory(PersonDirectory personDirectory) {
        this.personDirectory = personDirectory;
    }

    public EmployeeDirectory getEmployeedirectory() {
        return employeeDirectory;
    }

    public void setEmployeedirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public UserAccountDirectory getUseraccountdirectory() {
        return userAccountDirectory;
    }

    public void setUseraccountdirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public StudentDirectory getStudentdirectory() {
        return studentDirectory;
    }

    public void setStudentdirectory(StudentDirectory studentDirectory) {
        this.studentDirectory = studentDirectory;
    }

    public PersonDirectory getPersonDirectory() {
        return personDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }


    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public StudentDirectory getStudentDirectory(){
        return studentDirectory;
    }

    public FacultyDirectory getFacultydirectory() {
        return facultyDirectory;
    }
    
}

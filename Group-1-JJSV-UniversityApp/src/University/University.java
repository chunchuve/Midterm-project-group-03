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
import Employee.AdmissionsDirector.AdmissionsDirectorProfile;

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
        
        persondirectory = new PersonDirectory();
        employeedirectory = new EmployeeDirectory(this);
        useraccountdirectory = new UserAccountDirectory(d);
        studentdirectory = new StudentDirectory(d);
        facultydirectory = new FacultyDirectory(this);
        AdmissionsDirectorProfile admissionsDirector = employeedirectory.;
        Department d = new Department("CS", studentdirectory, facultydirectory,  );


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

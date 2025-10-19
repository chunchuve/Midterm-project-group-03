/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

import Department.Department;
//import University.University;
import Persona.Person;

import java.util.ArrayList;

/**
 *
 * @author vrmohanc
 */
public class EmployeeDirectory {

    //Department department;
    ArrayList<EmployeeProfile> employeelist;

    public EmployeeDirectory() {

        //this.department = department;
        employeelist = new ArrayList();

    }

    public EmployeeProfile newEmployeeProfile(Person p) {

        EmployeeProfile sp = new EmployeeProfile(p);
        employeelist.add(sp);
        return sp;
    }
    
    //create new admissions director and add to employee list
    public EmployeeProfile newAdmissionsDirectorProfile(Person p) {

        EmployeeProfile sp = new AdmissionsDirectorProfile(p);
        employeelist.add(sp);
        return sp;
    }

    public EmployeeProfile findEmployee(String id) {

        for (EmployeeProfile sp : employeelist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
            return null; //not found after going through the whole list
         }

    
    public ArrayList<EmployeeProfile> getEmployeelist() {
        return employeelist;
    }

    public void setEmployeelist(ArrayList<EmployeeProfile> employeelist) {
        this.employeelist = employeelist;
    }
    
    
}

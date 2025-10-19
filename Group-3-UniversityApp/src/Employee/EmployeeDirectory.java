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

        EmployeeProfile ep = new EmployeeProfile(p);
        employeelist.add(ep);
        return ep;
    }
    
    //begin changes to add new method to create employee with department 
    public EmployeeProfile newEmployeeProfile(Person p, Department d) {

        EmployeeProfile ep = new EmployeeProfile(p,d);
        employeelist.add(ep);
        return ep;
    }
    
    //end of changes
    
    //create new admissions director and add to employee list
    public EmployeeProfile newAdmissionsDirectorProfile(Person p) {

        EmployeeProfile ep = new AdmissionsDirectorProfile(p);
        employeelist.add(ep);
        return ep;
    }

    public EmployeeProfile findEmployee(String id) {

        for (EmployeeProfile ep : employeelist) {

            if (ep.isMatch(id)) {
                return ep;
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

import University.University;
import Persona.Person;

import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class EmployeeDirectory {

    University university;
    ArrayList<EmployeeProfile> employeelist;

    public EmployeeDirectory(University u) {

        university = u;
        employeelist = new ArrayList();

    }

    public EmployeeProfile newEmployeeProfile(Person p) {

        EmployeeProfile sp = new EmployeeProfile(p);
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
    
    
}

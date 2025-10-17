/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package College;

import Department.Department;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class College {
    ArrayList<Department> departments;
    
    public College(String name){
        departments = new ArrayList();
    }
    
    //create a new department
    public Department newDepartment(String name) {
        Department d = new Department(name);
        departments.add(d);
        return d;
    }
    
    public ArrayList<Department> getDepartments() {
        return departments;
    }

    public void setDepartments(ArrayList<Department> departments) {
        this.departments = departments;
    }
    
}

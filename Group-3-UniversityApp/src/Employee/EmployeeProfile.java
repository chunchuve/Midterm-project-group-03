/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

import Department.Department;
import Persona.Address;
import Persona.Person;
import Profile.Profile;

/**
 *
 * @author kal bugrara
 */
public class EmployeeProfile extends Profile {


    // @author vrmohanc
    //begin of changes
    private Department department;
    private Address address;
    
    
    public EmployeeProfile(Person p, Department department) {
        
        super(p); 
        this.department = department;
    }
    // end of changes
    
    public EmployeeProfile(Person p) {
        
        super(p); 
        
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
    @Override
    public String getRole(){
        return  "Admin";
    }

}
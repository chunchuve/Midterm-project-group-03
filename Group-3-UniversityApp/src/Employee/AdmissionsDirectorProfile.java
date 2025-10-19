/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee;

//import Employee.AdmissionsDirector.*;

import Persona.Person;
//import Profile.Profile;

/**
 *
 * @author vrmohanc
 */
public class AdmissionsDirectorProfile extends EmployeeProfile {



    public AdmissionsDirectorProfile(Person e) {

        super(e); 

    }
    
    @Override
    public String getRole(){
        return  "AdmissionsDirector";
    }

}
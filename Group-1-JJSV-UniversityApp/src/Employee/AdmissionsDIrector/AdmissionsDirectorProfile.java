/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Employee.AdmissionsDirector;

import Employee.*;
import Persona.Person;
import Profile.Profile;

/**
 *
 * @author kal bugrara
 */
public class AdmissionsDirectorProfile extends Profile {



    public AdmissionsDirectorProfile(Person p) {

        super(p); 

    }
    
    @Override
    public String getRole(){
        return  "AdmissionsDirector";
    }

}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Profile;

import Persona.Person;

/**
 *
 * @author vrmohanc
 */
public abstract class Profile {
    Person person;
    
    public Profile(Person p){
        person = p;
        
    }
    
    public abstract String getRole();
    
    public Person getPerson(){
        return person;
    }
    
    public String getPersonFullName() {
        return person.getFirstName() + " " + person.getLastName();
    }

    public boolean isMatch(String id) {
        if (person.getPersonId().equals(id)) {
            return true;
        }
        return false;
    }
    @Override
    public String toString(){
        return this.getPerson().toString();
    }
}

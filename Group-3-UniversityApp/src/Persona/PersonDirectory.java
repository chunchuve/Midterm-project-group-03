/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

import Department.Department;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara - changes by vrmohanc
 */
public class PersonDirectory {
      
        
      ArrayList<Person> personlist ;
    
      public PersonDirectory (){
       
       personlist = new ArrayList();

    }

    public Person newPerson(String id) {

        Person p = new Person(id);
        personlist.add(p);
        return p;
    }
    
    
    //overloaded method for new person
    public Person newPerson(String id, String firstName, String lastName, String dateOfBirth) {

        Person p = new Person(id, firstName, lastName, dateOfBirth);
        personlist.add(p);
        return p;
    }
    
    //remove person
    public void removePerson(Person person) {
        personlist.remove(person);
    }
    
    public Person findPerson(String id) {

        for (Person p : personlist) {

            if (p.isMatch(id)) {
                return p;
            }
        }
            return null; //not found after going through the whole list
         }


    public ArrayList<Person> getPersonlist() {
        return personlist;
    }

    public void setPersonlist(ArrayList<Person> personlist) {
        this.personlist = personlist;
    }
    
}

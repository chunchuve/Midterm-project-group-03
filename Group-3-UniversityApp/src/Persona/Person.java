/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Persona;

/**
 *
 * @author kal bugrara 
 */
public class Person {
    
    //author @vrmohanc
    private String firstName;
    private String lastName;
    private String dateOfBirth; //date of birth
    private Address address;
    private String id;
    
    //constructors
    public Person (String id){
        
        this.id = id;
    }
    
    //overloaded constructor for person

    public Person (String id, String firstName, String lastName, String dateOfBirth){
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.address = new Address(); //address is created per person
        this.id = id;
    }
    
    public String getPersonId(){
        return id;
    }

    public boolean isMatch(String id){
        if(getPersonId().equals(id)) return true;
        return false;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }
    
    @Override
    public String toString() {
        return getPersonId();
    }    
}

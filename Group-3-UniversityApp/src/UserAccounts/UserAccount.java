/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserAccounts;

/**
 *
 * @author kal bugrara
 */

//import Persona.Person;
import Profile.Profile;
//import info5100.university.example.workareas.Workarea;
import java.time.LocalDateTime;

/**
 *
 * @author vrmohanc
 */
public class UserAccount {
    //Person person;
    //Workarea landingworkarea;
    
    //public UserAccount(Person p){
        //person = p;
    //}
    
    Profile profile;
    String username;
    String password;
    String status;
    LocalDateTime lastActivity; //last time viewed
    LocalDateTime lastUpdated;  // last time updated
    
    public UserAccount (Profile profile, String un, String pw){
        username = un;
         password = pw;
         this.profile = profile;
         this.lastActivity = LocalDateTime.now();
         this.lastUpdated = LocalDateTime.now();
    }
    
    public String getPersonId(){
        return profile.getPerson().getPersonId();
    }
    public String getUserLoginName(){
        return username;
    }

        public boolean isMatch(String id){
        if(getPersonId().equals(id)) return true;
        return false;
    }
        public boolean IsValidUser(String un, String pw){
        
            if (username.equalsIgnoreCase(un) && password.equals(pw)) return true;
            else return false;
        
        }
        public String getRole(){
            return profile.getRole();
        }
        
        public Profile getAssociatedPersonProfile(){
            return profile;
        }
        
    @Override
        public String toString(){
            
            return getUserLoginName();
        }

    public Profile getProfile() {
        return profile;
    }
    
    //search for profile - use case to search for student NUID
    public boolean isProfileMatch(Object id){
        if (getProfile().equals(id)) return true;
        return false;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getLastActivity() {
        return lastActivity;
    }

    public void setLastActivity(LocalDateTime lastActivity) {
        this.lastActivity = lastActivity;
    }

    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(LocalDateTime lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
    
}
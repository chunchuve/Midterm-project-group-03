/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserAccounts;

import Persona.*;
import Profile.Profile;
import Department.Department;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class UserAccountDirectory {

    //Department department;
    //ArrayList<UserAccount> studentlist;
    ArrayList<UserAccount> useraccountlist ;
    
      public UserAccountDirectory (){
       //department = d;   
       useraccountlist = new ArrayList();

    }

    public UserAccount newUserAccount(Profile p, String un, String pw) {

        UserAccount ua = new UserAccount (p,  un,  pw);
        useraccountlist.add(ua);
        return ua;
    }
    
    //remove user account
    public void removeUserAccount(UserAccount acc) {
        useraccountlist.remove(acc);
    }
    
    
    public UserAccount findUserAccount(String id) {

        for (UserAccount ua : useraccountlist) {

            if (ua.isMatch(id)) {
                return ua;
            }
        }
            return null; //not found after going through the whole list
         }
    public UserAccount AuthenticateUser(String un, String pw) {

        for (UserAccount ua : useraccountlist) {

            if (ua.IsValidUser(un, pw)) {
                return ua;
            }
        }
            return null; //not found after going through the whole list
    }   
     
    public ArrayList<UserAccount> getUserAccountList() {
         return useraccountlist;
     }
    
    /*
    public UserAccountDirectory(Department d) {

        department = d;
        studentlist = new ArrayList();

    }

    public UserAccount newUserAccount(Person p) {

        UserAccount sp = new UserAccount(p);
        studentlist.add(sp);
        return sp;
    }

    public UserAccount findStudent(String id) {

        for (UserAccount sp : studentlist) {

         //   if (sp.isMatch(id)) {
         //       return sp;
         //   }
        }
            return null; //not found after going through the whole list
    }
    */
}

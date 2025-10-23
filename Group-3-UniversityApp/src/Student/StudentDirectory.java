/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import Persona.Person;
import Department.Department;
import Employee.EmployeeProfile;
import Faculty.FacultyProfile;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class StudentDirectory {

    
    ArrayList<StudentProfile> studentlist;

    public StudentDirectory() {

        studentlist = new ArrayList();

    }

    public StudentProfile newStudentProfile(Person p) {

        StudentProfile sp = new StudentProfile(p);
        studentlist.add(sp);
        return sp;
    }

    //begin changes to add new methods to create student with nuid and/or department 
    public StudentProfile newStudentProfile(Person p, String nuid) {

        StudentProfile sp = new StudentProfile(p,nuid);
        studentlist.add(sp);
        return sp;
    }
    
    public StudentProfile newStudentProfile(Person p, Department d) {

        StudentProfile sp = new StudentProfile(p,d);
        studentlist.add(sp);
        return sp;
    }
    
    public StudentProfile newStudentProfile(Person p, String nuid, Department d) {

        StudentProfile sp = new StudentProfile(p,nuid, d);
        studentlist.add(sp);
        return sp;
    }
    
    //remove student
    public void removeStudentProfile(StudentProfile student) {
        studentlist.remove(student);
    }
    //end of changes
    
    public StudentProfile findStudent(String id) {

        for (StudentProfile sp : studentlist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
            return null; //not found after going through the whole list
         }

    //search for student by NUID
    public StudentProfile findStudentByNUID(String nuid) {

        for (StudentProfile sp : studentlist) {
            
            if (sp.isNUIDMatch(nuid)) {
                return sp;
            }
        }
            return null; //not found after going through the whole list
    }
    //search for student by Person
    public StudentProfile findStudentByPerson(Person p) {

        for (StudentProfile sp : studentlist) {
            
            if (sp.getPerson().equals(p)) {
                return sp;
            }
        }
            return null; //not found after going through the whole list
    }
    
    public ArrayList<StudentProfile> getStudentlist() {
        return studentlist;
    }

    public void setStudentlist(ArrayList<StudentProfile> studentlist) {
        this.studentlist = studentlist;
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import Persona.Person;
import Profile.Profile;
import CourseSchedule.CourseLoad;
import CourseSchedule.SeatAssignment;
import EmploymentHistory.EmploymentHistroy;
import java.util.ArrayList;

/**
 *
 * @author vrmohanc
 */
public class StudentProfile extends Profile {

    //Person person;
    Transcript transcript;
    EmploymentHistroy employmenthistory;
    
    private String nUID;
    

    public StudentProfile(Person p) {
        super(p);   
        transcript = new Transcript(this);
        employmenthistory = new EmploymentHistroy();
    }
    
    //new constructor
    public StudentProfile(Person p, String nUID) {
       super(p);
       this.nUID = nUID;
    }

    public String getnUID() {
        return nUID;
    }

    public void setnUID(String nUID) {
        this.nUID = nUID;
    }


    //public boolean isMatch(String id) {
       // return person.getPersonId().equals(id);
    //}
    
    public boolean isMatch(String id) {
        if (super.isMatch(id)) {
            return true;
        }
        return false;
    }

    public Transcript getTranscript() {
        return transcript;
    }

    public CourseLoad getCourseLoadBySemester(String semester) {

        return transcript.getCourseLoadBySemester(semester);
    }

    public CourseLoad getCurrentCourseLoad() {

        return transcript.getCurrentCourseLoad();
    }

    public CourseLoad newCourseLoad(String s) {

        return transcript.newCourseLoad(s);
    }

    public ArrayList<SeatAssignment> getCourseList() {

        return transcript.getCourseList();

    }
    
    @Override
    public String getRole() {
        return "Student";
    }
}

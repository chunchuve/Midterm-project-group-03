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
import Department.Department;
import EmploymentHistory.EmploymentHistroy;
import java.util.ArrayList;

/**
 *
 * @author vrmohanc
 */
public class StudentProfile extends Profile {

    
    Transcript transcript;
    EmploymentHistroy employmenthistory;
    //begin of changes to student
    private String nUID;
    private String termAdmittedFirst; // term admitted in
    private String instructionMode; // online or on-campus
    private String programEnrolled; //example MSIS
    private ArrayList<String> hobbies; 
    private ArrayList<String> interests; 
    private Department department;
    //end of changes

    public StudentProfile(Person p) {
        super(p);   
        transcript = new Transcript(this);
        employmenthistory = new EmploymentHistroy();
        hobbies = new ArrayList<>(); 
        interests = new ArrayList<>(); 
    }
    
    
    //new constructor
    public StudentProfile(Person p, String nUID) {
       super(p);
       this.nUID = nUID;
    }
    
    //begin of changes to link dept to student
    public StudentProfile(Person p, String nUID, Department department) {
        
        super(p); 
        this.nUID = nUID;
        this.department = department;
        this.setDepartment(department);
    }
    
    public StudentProfile(Person p, Department department) {
        
        super(p); 
        this.department = department;
        this.setDepartment(department);
    }
    //end

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
    
    public String getnUID() {
        return nUID;
    }

    public void setnUID(String nUID) {
        this.nUID = nUID;
    }

    public EmploymentHistroy getEmploymenthistory() {
        return employmenthistory;
    }

    public void setEmploymenthistory(EmploymentHistroy employmenthistory) {
        this.employmenthistory = employmenthistory;
    }

    public String getTermAdmittedFirst() {
        return termAdmittedFirst;
    }

    public void setTermAdmittedFirst(String termAdmittedFirst) {
        this.termAdmittedFirst = termAdmittedFirst;
    }

    public String getInstructionMode() {
        return instructionMode;
    }

    public void setInstructionMode(String instructionMode) {
        this.instructionMode = instructionMode;
    }

    public String getProgramEnrolled() {
        return programEnrolled;
    }

    public void setProgramEnrolled(String programEnrolled) {
        this.programEnrolled = programEnrolled;
    }

    public ArrayList<String> getHobbies() {
        return hobbies;
    }

    //create hobby array list if it is empty
    //add hobby if it is not included in the list
    public void addHobbies(String hobby) {
        if (hobbies == null) {
            hobbies = new ArrayList<>();
        }
        if (!hobbies.contains(hobby)) {
        hobbies.add(hobby);
        }
    }

    public ArrayList<String> getInterests() {
        return interests;
    }
    //create interest array list if it is empty
    //add interest if it is not included in the list
    public void addInterests(String interest) {
        if (interests == null) {
            interests = new ArrayList<>();
        }
        if (!interests.contains(interests)) {
        interests.add(interest);
        }
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

    //is NUID match?
    public boolean isNUIDMatch(String id) {
        return nUID.equals(id);
    }
    
    public Transcript getTranscript() {
        return transcript;
    }

    public CourseLoad getCourseLoadBySemester(String semester) {

        return transcript.getCourseLoadBySemester(semester.toUpperCase());
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
    
    @Override
    public String toString() {
        return super.getPerson().getPersonId();
    }  
    
}

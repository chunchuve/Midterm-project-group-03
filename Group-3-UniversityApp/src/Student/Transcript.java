/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Student;

import Student.StudentProfile;
import CourseSchedule.CourseLoad;
import CourseSchedule.CourseOffer;
import CourseSchedule.SeatAssignment;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author kal bugrara
 */
public class Transcript {

    StudentProfile student;
    HashMap<String, CourseLoad> courseloadlist;

    CourseLoad currentcourseload;

    public Transcript(StudentProfile sp) {
        student = sp;
        courseloadlist = new HashMap();

    }

    public int getStudentSatisfactionIndex() {
        //for each courseload 
        //get seatassigmnets; 
        //for each seatassignment add 1 if like =true;
        return 0;
    }

    public CourseLoad newCourseLoad(String sem) {

        currentcourseload = new CourseLoad(sem);
        courseloadlist.put(sem, currentcourseload);
        return currentcourseload;
    }

    public CourseLoad getCurrentCourseLoad() {

        return currentcourseload;

    }

    public CourseLoad getCourseLoadBySemester(String semester) {

        return courseloadlist.get(semester);

    }

    public float getStudentTotalScore() {

        float sum = 0;

        for (CourseLoad cl : courseloadlist.values()) {
            sum = sum + cl.getSemesterScore();

        }
        return sum;
    }
    
    public int getStudentTotalCreditHours() {
        int sum = 0;
        for (CourseLoad cl: courseloadlist.values()) {
            sum = sum + cl.getSemesterCreditHours();
        }
        return sum;
    }
    
    public float getCumulativeGPA() {
        float cumulativeScore = this.getStudentTotalScore();
        int cumulativeCreditHours = this.getStudentTotalCreditHours();
        
        return cumulativeScore/cumulativeCreditHours;
    }
    
    //sat index means student rated their courses with likes;
    public int getStudentSatifactionIndex() {
        ArrayList<SeatAssignment> courseregistrations = getCourseList();
        int sum = 0;
        for (SeatAssignment sa : courseregistrations) {

            if (sa.getLike()) {
                sum = sum + 1;
            }
        }
        return sum;
    }
    //generate a list of all courses taken so far (seetassignments) 
    //from multiple semesters (course loads)
    //from seat assignments we will be able to access the course offers

    public ArrayList<SeatAssignment> getCourseList() {
        ArrayList temp2;
        temp2 = new ArrayList();

        for (CourseLoad cl : courseloadlist.values()) { //extract cl list as objects --ignore label
            temp2.addAll(cl.getSeatAssignments()); //merge one array list to another
        }

        return temp2;

    }

    // get courseloadlist with semesters
    public HashMap<String, CourseLoad> getMasterCourseloadlist() {
        return courseloadlist;
    }
    
    
    public boolean isCourseEnrolled(CourseOffer co) {
        for (CourseLoad cl: courseloadlist.values()){
        // compare the course numbers
            for (SeatAssignment sa: cl.getSeatAssignments()) {
                if(sa.getCourseOffer().getCourseNumber() == co.getCourseNumber()) {
                    return true;
                }
            }
        }
        return false;
    }
    

}

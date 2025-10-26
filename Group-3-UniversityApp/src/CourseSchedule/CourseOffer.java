/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseSchedule;

import CourseCatalog.Course;
import Faculty.FacultyAssignment;
import Faculty.FacultyProfile;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class CourseOffer {

    Course course;
    ArrayList<Seat> seatlist;
    FacultyAssignment facultyassignment;
    String building;
    String room;

    public CourseOffer(Course c) {
        course = c;
        seatlist = new ArrayList();
    }
     
    public void AssignAsTeacher(FacultyProfile fp) {

        facultyassignment = new FacultyAssignment(fp, this);
    }

    public FacultyProfile getFacultyProfile() {
        if (facultyassignment == null) {
            return null;
        }
        return facultyassignment.getFacultyProfile();
    }

    public String getCourseNumber() {
        return course.getCourseNumber();
    }

    public void generatSeats(int n) {

        for (int i = 0; i < n; i++) {

            seatlist.add(new Seat(this, i));

        }

    }

    public Seat getEmptySeat() {

        for (Seat s : seatlist) {

            if (!s.isOccupied()) {
                return s;
            }
        }
        return null;
    }
    
    public int getSeatAvailability() {
        int index = 0;
        for (Seat s: seatlist) {
            // find the index for empty seat
            if(!s.isOccupied()) {
                break;
            }
            index++;
        }
        return seatlist.size() - index;
    }


    public SeatAssignment assignEmptySeat(CourseLoad cl) {

        Seat seat = getEmptySeat();
        if (seat == null) {
            return null;
        }
        SeatAssignment sa = seat.newSeatAssignment(cl); //seat is already linked to course offer
        cl.registerStudent(sa); //coures offer seat is now linked to student
        return sa;
    }
    
    public void unAssignSeat(SeatAssignment sa) {
        if (sa == null) {
            return;
        }
        
        for (Seat s: seatlist) {
            SeatAssignment currentSA = s.getSeatassignment();
            if(currentSA != null) {
                if (currentSA == sa) {
                s.setSeatassignment(null);
                s.setOccupied(false);
                
                //throw new RuntimeException("--- FIRST UNENROLLMENT SUCCESSFUL ---");
                return;
                }
            }
        }
    }

    public int getTotalCourseRevenues() {

        int sum = 0;

        for (Seat s : seatlist) {
            if (s.isOccupied() == true) {
                sum = sum + course.getCoursePrice();
            }

        }
        return sum;
    }
    
    public Course getSubjectCourse(){
        return course;
    }
    
    public int getCreditHours(){
        return course.getCredits();
    }

    public ArrayList<Seat> getSeatlist() {
        return seatlist;
    }
    
    @Override
    public String toString() {
        return course.getCourseName();
    }

}

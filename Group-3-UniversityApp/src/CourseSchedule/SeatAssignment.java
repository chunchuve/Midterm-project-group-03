/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseSchedule;

import CourseCatalog.Course;

/**
 *
 * @author kal bugrara
 */
public class SeatAssignment {
    float grade; //(Letter grade mappings: A=4.0, A-=3.7, B+=3.3, B=3.0, )
    Seat seat;
    boolean like; //true means like and false means not like
    CourseLoad courseload;
    public SeatAssignment(CourseLoad cl, Seat s){
        seat = s;
        courseload = cl;
    }
     
    public boolean getLike(){
        return like;
    }
    public void assignSeatToStudent(CourseLoad cl){
        courseload = cl;
    }
    
    public void unAssignSeatFromStudent() {
        courseload = null; // unlink from student courseload
        seat.getCourseOffer().unAssignSeat(this); // unassign seatassignment from course offer (change seat to not occupied, seat assignment to null)
    }
    
    public int getCreditHours(){
        return seat.getCourseCredits();
       
    }
    
    public Seat getSeat(){
        return seat;
    }
    
    public CourseOffer getCourseOffer(){
        
        return seat.getCourseOffer();
    }
    
    public Course getAssociatedCourse(){
        
        return getCourseOffer().getSubjectCourse();
    }
    
    public float GetCourseStudentScore(){
        return getCreditHours()*grade;
    }
    
    @Override
    public String toString() {
        //return course name
        return seat.getCourseOffer().toString();
    }
}

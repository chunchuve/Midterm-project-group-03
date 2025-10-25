/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CourseSchedule;

import java.util.ArrayList;


/**
 *
 * @author kal bugrara
 */
public class CourseLoad {
    String semester;
    ArrayList<SeatAssignment> seatassignments;
    
    public CourseLoad(String s){
        seatassignments = new ArrayList();
        semester = s;
    }
    public SeatAssignment newSeatAssignment(CourseOffer co){
        
        Seat seat = co.getEmptySeat(); // seat linked to courseoffer
        if (seat==null) return null;
        SeatAssignment sa = seat.newSeatAssignment(this);
        seatassignments.add(sa);  //add to students course 
        return sa;
    }
    
    public void registerStudent(SeatAssignment sa){
        
        
        sa.assignSeatToStudent(this);
        seatassignments.add(sa);
    }
    
    public float getSemesterScore(){ //total score for a full semeter
        float sum = 0;
        for (SeatAssignment sa: seatassignments){
            if(sa.isCompleted()){
                // only count if completed
                sum = sum + sa.GetCourseStudentScore();
            }
        }
        return sum;
    }
    
    public int getSemesterCreditHours() {
        // total credit hours for a semester
        int sum = 0;
        for (SeatAssignment sa: seatassignments) {
            // only count if completed
            if (sa.isCompleted()) {
                sum = sum + sa.getCreditHours();
            }
        }
        return sum;
    }
    
    public void unEnrollCourse(SeatAssignment sa) {
        sa.unAssignSeatFromStudent();
        seatassignments.remove(sa);     
    }
            
    public ArrayList<SeatAssignment> getSeatAssignments(){
        return seatassignments;
    }
    
 //Method to calculate student's GPA
    public float calculateGPA() {
        float totalGrade = 0; //start at zero
        float totalCredits = 0; //start at zero
        
        for (SeatAssignment sa: seatassignments) {
            float grade = sa.getGrade();
            int credits = sa.getCourseOffer().getSubjectCourse().getCredits();
            
            totalGrade = totalGrade + (grade * credits);
            totalCredits = totalCredits + credits;
        }
        
        if (totalCredits == 0) return 0;
        return totalGrade / totalCredits;
    }        

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
        
    
    
}

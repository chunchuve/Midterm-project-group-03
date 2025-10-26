/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Degree;

import CourseCatalog.Course;
import CourseSchedule.SeatAssignment;
import Student.StudentProfile;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class Degree {

    String title;
    ArrayList<Course> corelist;
    ArrayList<Course> electives;
    int requiredCredits = 32;

    public Degree(String name) {
        title = name;
        corelist = new ArrayList();
        electives = new ArrayList();
    }

    public void addCoreCourse(Course c) {
        corelist.add(c);

    }

    public void addElectiveCourse(Course c) {
        electives.add(c);

    }

    public boolean isStudentReadyToGraduate(StudentProfile sp) {

        //Extract transcript from studentprofile
        //Extract the list of courses taken so far from the student transcript
        //For each core course in the core list of the degree do the following:
        //Check if the core class at hand is in the transcrip
        //Repeat this check for the electives as well
        
        ArrayList<SeatAssignment> sas = sp.getCourseList(); //seatAssignments extracted from course loads

        if (validateCoreClasses(sas) == false) {
            return false;
        }//core classes satisfied

        //Check for the total number of credit hours that it is above 32
        int countedCredits = getTotalValidCredits(sas);
        if (countedCredits < 32) {
            return false;
        }


        else return true; //student has at least 32 credit hours per NEU requirements

    }

    public int getTotalValidCredits(ArrayList<SeatAssignment> sas) {
        int sum = 0;
        // count core credits
        for (Course c: corelist) {
            for (SeatAssignment sa: sas) {
                if (sa.getAssociatedCourse().equals(c)) {
                    // only count with class completed and passed
                    if (sa.isCompleted()  && this.isCoreGradePassed(sa, c)) {
                        sum = sum + c.getCredits();
                    }
                }
            }
        }
        
        // count elective credits
        for (Course c: electives) {
            for (SeatAssignment sa: sas) {
                if (sa.getAssociatedCourse().equals(c)) {
                    // only count with class completed and passed
                    if (sa.isCompleted()  && this.isElectiveGradePassed(sa, c)) {
                        sum = sum + c.getCredits();
                    }
                }
            }
        }
      
        return sum;
    }
    
    public int getTotalPendingCredits(ArrayList<SeatAssignment> sas) {
        int sum = 0;
        // count core credits that are in progress (no grades yet)
        for (Course c: corelist) {
            for (SeatAssignment sa: sas) {
                if (sa.getAssociatedCourse().equals(c)) {
                    // only count with class completed
                    if (!sa.isCompleted()) {
                        sum = sum + c.getCredits();
                    }
                }
            }
        }
        
        // count elective credits
        for (Course c: electives) {
            for (SeatAssignment sa: sas) {
                if (sa.getAssociatedCourse().equals(c)) {
                    // only count with class not completed
                    if (!sa.isCompleted()) {
                        sum = sum + c.getCredits();
                    }
                }
            }
        }
      
        return sum;
    }
    
    public boolean validateCoreClasses(ArrayList<SeatAssignment> sas) {

        //For each core course in the core list of the degree do the following:
        //Check if the core class at hand is in the transcrip
        //Repeat this check for the electives as well
        for (Course c : corelist) {
            if (!isCoreSatisfied(sas, c)) { //if selected core class not on the trascript return false
                return false;
            }
        }
        return true; //all core classes are on the transcript satifying core reqs

    }

    // check by seat assignment list
    public boolean isCoreSatisfied(ArrayList<SeatAssignment> sas, Course c) {
        for (SeatAssignment sa : sas) {
            // check if the student's seat assignment list has the core course
            if (sa.getAssociatedCourse().equals(c)) {
                // check if passed
                if(isCoreGradePassed(sa, c)){
                    return true;
                }
            }
        }
        return false;
    }
    
    // check if meet core course requirement (at least 3.0 or B)
    public boolean isCoreGradePassed(SeatAssignment sa, Course c) {
        // check if grade is at least 3.0 or B
        if(sa.getGrade() >= 3.0){
            return true;
        }
        return false;
    }
    
    // check if meet elective course requirement (at least 2.0 or C)
    public boolean isElectiveGradePassed(SeatAssignment sa, Course c) {
        // check if grade is at least 2.0 or C
        if(sa.getGrade() >= 2.0){
            return true;
        }
        return false;
    }

    public int getTotalElectiveCoursesTaken(ArrayList<SeatAssignment> sas) {
        int electivecount = 0;
        for (SeatAssignment sa : sas) {
            if (isElectiveSatisfied(sa)) {
                electivecount = electivecount + 1;
            }
        }
        return electivecount;

    }

    public boolean isElectiveSatisfied(SeatAssignment sa) {
        for (Course c : electives) {
            if (sa.getAssociatedCourse().equals(c)) {
                // the class is completed and passed
                if (sa.isCompleted() && isElectiveGradePassed(sa, c)) {
                    return true;
                }
            }
        }
        return false;

    }

    public ArrayList<Course> getCorelist() {
        return corelist;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<Course> getElectives() {
        return electives;
    }

}

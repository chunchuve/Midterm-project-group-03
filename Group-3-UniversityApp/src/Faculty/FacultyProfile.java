/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Faculty;

import Persona.*;
import Profile.Profile;
import CourseSchedule.CourseOffer;
import Department.Department;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara - changes by @vrmohanc
 */
public class FacultyProfile extends Profile {
    
    private String title; //professor, associate professor, lecturer etc
    private String researchArea;
    
    private Department department;
    ArrayList <FacultyAssignment> facultyassignments; 
    
    public FacultyProfile(Person p) {

        super(p);
        facultyassignments = new ArrayList();
    }
    
    //@author vrmohanc
    //begin of new constructor with dept
    public FacultyProfile(Person p, Department department) {

        super(p);
        this.department = department;
        facultyassignments = new ArrayList();
    }
    public FacultyProfile(Person p, Department department, String title, String researchArea) {

        super(p);
        this.department = department;
        this.title = title;
        this.researchArea = researchArea;
        facultyassignments = new ArrayList();
    }
    //end of changes
    
    public  double getProfAverageOverallRating(){
        
        double sum = 0.0;
        //for each facultyassignment extract class rating
        //add them up and divide by the number of teaching assignmnet;
        for(FacultyAssignment fa: facultyassignments){
            
            sum = sum + fa.getRating();
            
        }
        //divide by the total number of faculty assignments
        
        return sum/(facultyassignments.size()*1.0); //this ensure we have double/double
        
    }

    public FacultyAssignment AssignAsTeacher(CourseOffer co){
        
        FacultyAssignment fa = new FacultyAssignment(this, co);
        facultyassignments.add(fa);
        
        return fa;
    }
    
    public FacultyProfile getCourseOffer(String courseid){
        return null; //complete it later
    }

    public boolean isMatch(String id) {
        if (super.isMatch(id)) {
            return true;
        }
        return false;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public ArrayList<FacultyAssignment> getFacultyassignments() {
        return facultyassignments;
    }

    public void setFacultyassignments(ArrayList<FacultyAssignment> facultyassignments) {
        this.facultyassignments = facultyassignments;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getResearchArea() {
        return researchArea;
    }

    public void setResearchArea(String researchArea) {
        this.researchArea = researchArea;
    }
    
    
    @Override
    public String getRole() {
        return "Faculty";
    }
    
   @Override
    public String toString() {
        return super.getPerson().getPersonId();
    }    

}

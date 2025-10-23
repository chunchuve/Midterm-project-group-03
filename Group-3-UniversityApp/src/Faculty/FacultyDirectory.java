/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Faculty;

import Persona.*;
import Department.Department;
import java.util.ArrayList;

/**
 *
 * @author kal bugrara
 */
public class FacultyDirectory {

   
    ArrayList<FacultyProfile> teacherlist;

    public FacultyDirectory() {

        teacherlist = new ArrayList();

    }

    public FacultyProfile newFacultyProfile(Person p) {

        FacultyProfile fp = new FacultyProfile(p);
        teacherlist.add(fp);
        return fp;
    }
    
    //@author vrmohanc
    //begin of new method to create faculty with a department
    public FacultyProfile newFacultyProfile(Person p, Department d) {

        FacultyProfile fp = new FacultyProfile(p,d);
        teacherlist.add(fp);
        return fp;
    }
    
    // add existing faculty
    public void addFaculty(FacultyProfile faculty) {
        teacherlist.add(faculty);
    }
    
    //remove faculty
    public void removeFaculty(FacultyProfile faculty) {
        teacherlist.remove(faculty);
    }
    //end of changes
    
    public FacultyProfile getTopProfessor(){
        
        double bestratingsofar = 0.0;
        FacultyProfile BestProfSofar = null;
        for(FacultyProfile fp: teacherlist)
           if(fp.getProfAverageOverallRating()>bestratingsofar){
           bestratingsofar = fp.getProfAverageOverallRating();
           BestProfSofar = fp;
           }
        return BestProfSofar;
        
    }

    public FacultyProfile findTeachingFaculty(String id) {

        for (FacultyProfile sp : teacherlist) {

            if (sp.isMatch(id)) {
                return sp;
            }
        }
            return null; //not found after going through the whole list
         }

    

    public ArrayList<FacultyProfile> getTeacherlist() {
        return teacherlist;
    }

    public void setTeacherlist(ArrayList<FacultyProfile> teacherlist) {
        this.teacherlist = teacherlist;
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CourseSchedule;

import java.time.LocalDate;

/**
 *
 * @author csong
 */
public class AssignmentSubmission {

    String assignmentName;
    String comment;
    String filePath;
    LocalDate submissionDate;
    public AssignmentSubmission(String name, String comment, String filePath) {
        assignmentName = name;
        this.comment = comment;
        this.filePath = filePath;
        submissionDate = LocalDate.now();
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public String getComment() {
        return comment;
    }

    public String getFilePath() {
        return filePath;
    }

    public LocalDate getSubmissionDate() {
        return submissionDate;
    }
        
}

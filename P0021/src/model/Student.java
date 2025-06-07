/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import constants.Course;
import constants.Semester;

/**
 *
 * @author nguye
 */
public class Student {

    private String studentID;
    private String studentName;
    private Semester studentSemester;
    private Course studentCourse;

    public Student() {
    }

    public Student(String studentID, String studentName, Semester studentSemester, Course studentCourse) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentSemester = studentSemester;
        this.studentCourse = studentCourse;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Semester getStudentSemester() {
        return studentSemester;
    }

    public void setStudentSemester(Semester studentSemester) {
        this.studentSemester = studentSemester;
    }

    public Course getStudentCourse() {
        return studentCourse;
    }

    public void setStudentCourse(Course studentCourse) {
        this.studentCourse = studentCourse;
    }

    @Override
    public String toString() {
   return String.format("%-6s %-20s %-10s %-10s", studentID,studentName,studentSemester,studentCourse.toString());
    }
    
    
}

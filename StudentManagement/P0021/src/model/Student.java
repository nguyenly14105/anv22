/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import constants.Course;
import constants.Semester;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nguye
 */
public class Student {

    private String studentID;
    private String studentName;
    private Semester studentSemester;
    private List<Course> studentCourse;

    public Student() {
    }

    public Student(String studentID, String studentName, Semester studentSemester, Course studentCourse) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentSemester = studentSemester;
        this.studentCourse = new ArrayList<>();
        this.studentCourse.add(studentCourse);
    }

    public List<Course> getStudentCourse() {
        return studentCourse;
    }

    public void addStudentCourse(Course course) {
        studentCourse.add(course);
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

    @Override
    public String toString() {
        return String.format("%-6s %-20s %-10s ", studentID, studentName, studentSemester);
    }

}

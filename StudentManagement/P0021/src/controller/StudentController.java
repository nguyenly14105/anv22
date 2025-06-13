/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import constants.Course;
import constants.Semester;
import dto.StudentDTO;
import java.util.ArrayList;
import model.Student;
import service.StudentService;
import view.StudentView;

/**
 *
 * @author nguye
 */
public class StudentController {

    private ArrayList<Student> studentList = new ArrayList<>();
    private StudentDTO inputData = new StudentDTO();
    private StudentView view = new StudentView();
    private StudentService service = new StudentService();

    //set data
    public void setData(StudentDTO inputForm) {
        this.inputData = inputForm;
    }

    //add student
    public void addStudent() {
        studentList.add(new Student(inputData.getStudentID(), inputData.getStudentName(), inputData.getStudentSemester(), inputData.getStudentCourse()));

    }

    //add course
    public void addCourse(String code, Course course) {
        findByID(code).addStudentCourse(course);
    }

    //check name
    public boolean checkName(String name) {
        for (Student student : studentList) {
            if (student.getStudentName().contains(name)) {
                return true;
            }
        }
        return false;
    }

    //tim kiem theo ten
    public void findByName(String name) {
        StringBuilder result = new StringBuilder();
        for (Student student : studentList) {
            if (student.getStudentName().contains(name)) {
                result.append(student.toString()).append("\n");
            }
        }
        view.setData(result.toString());
        view.diplayData();
    }

    //tim kiem theo code
    public Student findByID(String code) {
        for (Student student : studentList) {
            if (student.getStudentID().equalsIgnoreCase(code)) {
                return student;
            }
        }
        return null;
    }

    //update thong tin sinh vien
    public void updateStudent(String code, String name,Semester semester) {
        findByID(code).setStudentName(name);
        findByID(code).setStudentSemester(semester);
    }

    //sort by name
    public void sortByName() {
        for (int i = 0; i < studentList.size() - 1; i++) {
            for (int j = i + 1; j < studentList.size(); j++) {
                if (studentList.get(i).getStudentName().compareToIgnoreCase(studentList.get(j).getStudentName()) > 0) {
                    Student tmp = studentList.get(i);
                    studentList.set(i, studentList.get(j));
                    studentList.set(j, tmp);
                }
            }
        }
    }

    //delete by code
    public void deleteByID(String id) {
        studentList.remove(findByID(id));
    }

    //display report
    public void displayReport() {
        service.setData(studentList);
        view.setData(service.report());
        view.diplayData();

    }

}

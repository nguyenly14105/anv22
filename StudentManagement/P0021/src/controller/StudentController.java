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
import view.StudentView;

/**
 *
 * @author nguye
 */
public class StudentController {

    private ArrayList<Student> studentList = new ArrayList<>();
    private StudentDTO inputData = new StudentDTO();
    private StudentView view = new StudentView();

    //set data
    public void setData(StudentDTO inputForm) {
        this.inputData = inputForm;
    }

    //add student
    public void addStudent() {
        studentList.add(new Student(inputData.getStudentID(), inputData.getStudentName(), inputData.getStudentSemester(), inputData.getStudentCourse()));

    }

    //check code
    public boolean checkID(String code) {
        for (Student student : studentList) {
            if (student.getStudentID().equalsIgnoreCase(code)) {
                return true;
            }
        }
        return false;
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
        if (!checkName(name)) {
            view.displayMessage("Not found !!!");
        } else {
            view.displayStudentInformation();
            for (Student student : studentList) {
                if (student.getStudentName().contains(name)) {
                    view.setData(student.toString());
                    view.diplayData();
                }
            }

        }

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
    public void updateStudent(String code, String name, Semester semester, Course course) {
        findByID(code).setStudentName(name);
        findByID(code).setStudentSemester(semester);
        findByID(code).addStudentCourse(course);
        view.displayMessage("UPDATE SUCCESSFULL !!!");
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
        for (Student student : studentList) {
            if (student.getStudentID().equals(id)) {
                studentList.remove(student);
                view.displayMessage("DELETE SUCCESSFULL !!!");
            }
        }
    }

    //display report
    public void displayReport() {
        view.displayReport();
        for(Student student : studentList){
            view.setData(student.toString()+student.getStudentCourse().size());
            view.diplayData();
        }
    }

    //display student
    public void displayStudent(String code) {
        view.displayStudentInformation();
        view.setData(findByID(code).toString());
        view.diplayData();
    }

    //diplay menu
    public void displayMenu() {
        view.diplayMenu();
    }

    public void displaySemester() {
        view.displaySemester();
    }

    public void displayCourse() {
        view.displayCourse();
    }
}

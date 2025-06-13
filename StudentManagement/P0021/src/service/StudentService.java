/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import com.sun.org.apache.bcel.internal.generic.AALOAD;
import java.util.ArrayList;
import java.util.List;
import model.Student;

/**
 *
 * @author Dell
 */
public class StudentService {

    private List<Student> data = new ArrayList<>();

    public StudentService() {
    }

    public List<Student> getData() {
        return data;
    }

    public void setData(List<Student> data) {
        this.data = data;
    }

    //tinh toan total course
    public String report() {
        StringBuilder result = new StringBuilder();
        for (Student student : data) {
            result.append(student.toString()).append(" ").append(student.getStudentCourse().size()).append("\n");
        }
        return result.toString();
    }

}

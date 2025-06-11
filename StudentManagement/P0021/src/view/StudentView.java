/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

/**
 *
 * @author nguye
 */
public class StudentView {

    private String data;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public void displayStudentInformation() {
        System.out.println("======= Student Information ======");
        System.out.printf("%-6s %-20s %-10s\n", "Code", "Name", "Semester");
    }

    public void diplayData() {
        System.out.println(data);
    }

    public void diplayMenu() {
        System.out.println("WELCOME TO STUDENT MANAGEMENT");
        System.out.println("1.Create");
        System.out.println("2.Find/Sort");
        System.out.println("3.Update/Delete");
        System.out.println("4.Report");
        System.out.println("5.Exit");

    }

    public void displayReport() {
        System.out.println("STUDENT REPORT");
        System.out.printf("%-6s %-20s %-10s %-6s\n", "Code", "Name", "Semsester", "Total Course");
    }

    public void displaySemester() {
        System.out.println("    Semester    ");
        System.out.println("1.Spring");
        System.out.println("2.Summer");
        System.out.println("3.Fall");
    }

    public void displayCourse() {
        System.out.println("    Course    ");
        System.out.println("1. Java");
        System.out.println("2. .Net");
        System.out.println("3. C/C++");
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }
}

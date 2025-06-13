/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p0021;

import constants.Course;
import constants.Semester;
import controller.StudentController;
import dto.StudentDTO;
import utils.Validation;

/**
 *
 * @author nguye
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        StudentController controller = new StudentController();
        StudentDTO inputForm = new StudentDTO();
        int choose;
        String name, code;
        while (true) {
            System.out.println("WELCOME TO STUDENT MANAGEMENT");
            System.out.println("1.Create");
            System.out.println("2.Find/Sort");
            System.out.println("3.Update/Delete");
            System.out.println("4.Enroll course");
            System.out.println("5.Report");
            System.out.println("6.Exit");
            choose = Validation.checkInt("your choose", 1, 5);
            switch (choose) {
                case 1: {
                    int count = 3;
                    while (count > 0) {
                        while (true) {
                            code = Validation.checkString("code");
                            if (controller.findByID(code) != null) {
                                System.err.println("Code is exist !");
                            } else {
                                break;
                            }
                        }
                        inputForm.setStudentID(code);
                        name = Validation.checkString("student name");
                        inputForm.setStudentName(Validation.formatName(name));
                        System.out.println("Semester");
                        System.out.println("1.Spring");
                        System.out.println("2.Summer");
                        System.out.println("3.Fall");
                        int semester = Validation.checkInt("semester", 1, 3);
                        switch (semester) {
                            case 1:
                                inputForm.setStudentSemester(Semester.SPRING);
                                break;
                            case 2:
                                inputForm.setStudentSemester(Semester.SUMMER);
                                break;
                            default:
                                inputForm.setStudentSemester(Semester.FALL);
                                break;
                        }
                        System.out.println("Course");
                        System.out.println("1. Java");
                        System.out.println("2. .Net");
                        System.out.println("3. C/C++");
                        int course = Validation.checkInt("course", 1, 3);
                        switch (course) {
                            case 1:
                                inputForm.setStudentCourse(Course.JAVA);
                                break;
                            case 2:
                                inputForm.setStudentCourse(Course.DOT_NET);
                                break;
                            default:
                                inputForm.setStudentCourse(Course.C_CPP);
                                break;
                        }
                        controller.setData(inputForm);
                        controller.addStudent();
                        count--;
                        if (count == 0) {
                            if (Validation.checkYN()) {
                                count = 1;
                            } else {
                                break;
                            }
                        }
                    }
                }
                break;
                case 2:
                    name = Validation.checkString("name");
                    if (controller.checkName(Validation.formatName(name))) {
                        System.out.println("======= Student Information ======");
                        System.out.printf("%-6s %-20s %-10s\n", "Code", "Name", "Semester");
                        controller.sortByName();
                        controller.findByName(Validation.formatName(name));

                    } else {
                        System.out.println("Not found !");
                    }
                    break;
                case 3:
                    while (true) {
                        code = Validation.checkString("code");
                        if (controller.findByID(code) == null) {
                            System.out.println("Code is not exist!");
                        } else {
                            break;
                        }
                    }

                    System.out.println("======= Student Information ======");
                    System.out.printf("%-6s %-20s %-10s\n", "Code", "Name", "Semester");
                    System.out.println(controller.findByID(code).toString());
                    if (Validation.checkUD()) {
                        String newName = Validation.checkString("new name");
                        System.out.println("Semester");
                        System.out.println("1.Spring");
                        System.out.println("2.Summer");
                        System.out.println("3.Fall");
                        int semester = Validation.checkInt("semester", 1, 3);
                        switch (semester) {
                            case 1:
                                inputForm.setStudentSemester(Semester.SPRING);
                                break;
                            case 2:
                                inputForm.setStudentSemester(Semester.SUMMER);
                                break;
                            default:
                                inputForm.setStudentSemester(Semester.FALL);
                                break;
                        }
                        controller.updateStudent(code, Validation.formatName(newName), inputForm.getStudentSemester());
                        System.out.println("Update successfull !");
                    } else {
                        controller.deleteByID(code);
                        System.out.println("Delete sucessfull !");
                    }

                    break;
                case 4:
                    while (true) {
                        code = Validation.checkString("code");

                        if (controller.findByID(code) == null) {
                            System.out.println("Code is not exist!");
                        } else {
                            System.out.println("======= Student Information ======");
                            System.out.printf("%-6s %-20s %-10s\n", "Code", "Name", "Semester");
                            System.out.println(controller.findByID(code).toString());
                            System.out.println("Course");
                            System.out.println("1. Java");
                            System.out.println("2. .Net");
                            System.out.println("3. C/C++");
                            int course = Validation.checkInt("course", 1, 3);
                            switch (course) {
                                case 1:
                                    inputForm.setStudentCourse(Course.JAVA);
                                    break;
                                case 2:
                                    inputForm.setStudentCourse(Course.DOT_NET);
                                    break;
                                default:
                                    inputForm.setStudentCourse(Course.C_CPP);
                                    break;
                            }

                            break;
                        }
                    }
                    controller.addCourse(code, inputForm.getStudentCourse());
                    System.out.println("Add course successfull !");
                    break;
                case 5:
                    System.out.println("STUDENT REPORT");
                    System.out.printf("%-6s %-20s %-10s %-6s\n", "Code", "Name", "Semsester", "Total");
                    controller.displayReport();
                    break;
            }
            if (choose == 6) {
                break;
            }
        }
    }

}

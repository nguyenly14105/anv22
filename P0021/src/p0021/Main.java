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
            controller.displayMenu();
            choose = Validation.checkInt("your choose", 1, 5);
            switch (choose) {
                case 1: {
                    int count = 3;
                    while (count > 0) {
                        while (true) {
                            code = Validation.checkString("code");
                            if (controller.checkID(code)) {
                                System.err.println("Code is exist !");
                            } else {
                                break;
                            }
                        }
                        inputForm.setStudentID(code);
                        name = Validation.checkString("student name");
                        inputForm.setStudentName(Validation.formatName(name));
                        controller.displaySemester();
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
                        controller.displayCourse();
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
                    }
                }
                break;
                case 2:
                    name = Validation.checkString("name");
                    controller.sortByName();
                    controller.findByName(Validation.formatName(name));
                    break;
                case 3:
                    code = Validation.checkString("code");
                    if (!controller.checkID(code)) {
                        System.out.println("Code is not exist!");
                    } else {
                        controller.displayStudent(code);
                        if (Validation.checkUD()) {
                            String newName = Validation.checkString("new name");
                            controller.displaySemester();
                            int semester = Validation.checkInt("new semester", 1, 3);
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
                            controller.displayCourse();
                            int course = Validation.checkInt("new course", 1, 3);
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
                            controller.updateStudent(code, newName, inputForm.getStudentSemester(), inputForm.getStudentCourse());
                        } else {
                            controller.deleteByID(code);
                        }
                    }

                case 4:

            }
            if (choose == 5) {
                break;
            }
        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p0056;

import controller.WorkerController;
import dto.WorkerDTO;
import ulti.Validation;

/**
 *
 * @author nguye
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        WorkerController controller = new WorkerController();
        WorkerDTO inputForm = new WorkerDTO();
        while (true) {
            controller.displayMenu();
            int choose = Validation.checkInt("your choose", 1, 5);
            switch (choose) {
                case 1:
                    System.out.println("---------- Add Worker ----------");
                    String code;
                    while (true) {
                        code = Validation.checkString("Code");
                        if (controller.checkID(code)) {
                            System.out.println("Code is exist!");
                        } else {
                            break;
                        }
                    }
                    inputForm.setId(code);
                    String name = Validation.checkString("Name");
                    inputForm.setName(name);
                    int age = Validation.checkInt("Age", 18, 50);
                    inputForm.setAge(age);
                    double salary = Validation.checkDouble("Salary");
                    inputForm.setSalary(salary);
                    String workLocation = Validation.checkString("work location");
                    inputForm.setWorkLocation(workLocation);
                    controller.setInputData(inputForm);
                    controller.addWorker();
                    System.out.println("Add worker successfully!");
                    break;
                case 2:
                    System.out.println("------- Up Salary ------");
                    String codeUp;
                    while (true) {
                        codeUp = Validation.checkString("Code");
                        if (controller.checkID(codeUp)) {
                            break;
                        } else {
                            System.out.println("Code is not exist!");
                        }
                    }
                    double amountUp = Validation.checkDouble("amount");
                    controller.upSalary(codeUp, amountUp);
                    System.out.println("Up salary successfully!");
                    break;
                case 3:
                    System.out.println("------- Down Salary ------");
                    String codeDown;
                    while (true) {
                        codeDown = Validation.checkString("Code");
                        if (!controller.checkID(codeDown)) {
                            System.out.println("Code is not exist!");
                        } else {
                            break;
                        }
                    }
                    double amountDown = Validation.checkDouble("amount");
                    controller.downSalary(codeDown, amountDown);
                    System.out.println("Down salary successfully!");
                    break;
                case 4:
                    controller.displaySalaryHistory();
                    break;
                case 5:
                    break;

            }
            if (choose == 5) {
                break;
            }
        }

    }

}

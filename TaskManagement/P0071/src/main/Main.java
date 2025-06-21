/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import controller.TaskController;
import dto.TaskDTO;
import ulti.Validation;
import constant.Message;
import exception.StringEmptyException;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TaskController controller = new TaskController();
        TaskDTO dto = new TaskDTO();

        while (true) {
            int choice = -1;
            System.out.print(Message.MENU);
            try {
                choice = Validation.checkInt(sc.nextLine(), 1, 4);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            if (choice == 4) {
                break;
            }
            switch (choice) {
                case 1:
                    System.out.println(Message.ADD_TASK_HEADER);
                    String name = null,
                     asignee = null,
                     reviewer = null;
                    double from = 0,
                     to = 0;
                    Date date = null;
                    //add name
                    do {
                        try {

                            System.out.print(Message.ENTER_REQUIREMENT_NAME);
                            name = Validation.checkString(sc.nextLine());
                        } catch (StringEmptyException ex) {
                            System.out.println(ex.getMessage());
                        }
                    } while (name == null);
                    dto.setName(Validation.formatName(name));
                    //add task type
                    do {
                        try {

                            System.out.print(Message.ENTER_TASK_TYPE);
                            int type = Validation.checkInt(sc.nextLine(), 1, 4);
                            switch (type) {
                                case 1:
                                    dto.setType("Code");
                                    break;
                                case 2:
                                    dto.setType("Test");
                                    break;
                                case 3:
                                    dto.setType("Design");
                                    break;
                                case 4:
                                    dto.setType("Reviewer");
                                    break;
                            }
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    } while (dto.getType() == null);
                    //add date
                    do {
                        try {

                            System.out.print(Message.ENTER_DATE);
                            date = Validation.checkDateformat(sc.nextLine());
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                    } while (date == null);
                    dto.setDate(date);
                    //add from and to
                    do {
                        try {

                            System.out.print(Message.ENTER_FROM);
                            from = Validation.checkTaskTime(sc.nextLine());
                            System.out.print(Message.ENTER_TO);
                            to = Validation.checkTaskTime(sc.nextLine());
                            if(!Validation.checkTaskTimeLogic(from, to)){
                                throw new Exception("Plan from must less then Phan to. Repeat!!");
                            }
                        } catch (Exception ex) {
                            System.out.println(ex.getMessage());
                        }
                    } while (!Validation.checkTaskTimeLogic(from, to));
                    dto.setStart(from);
                    dto.setEnd(to);
                    //add asignee
                    do {
                        try {

                            System.out.print(Message.ENTER_ASSIGNEE);
                            asignee = Validation.checkString(sc.nextLine());

                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    } while (asignee == null);
                    dto.setAsignee(Validation.formatName(asignee));
                    //add reviewer
                    do {
                        try {

                            System.out.print(Message.ENTER_REVIEWER);
                            reviewer = Validation.checkString(sc.nextLine());

                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                        }
                    } while (reviewer == null);
                    dto.setReviewer(Validation.formatName(reviewer));
                    //set dto
                    controller.setDTO(dto);
                    controller.addTask();
                    System.out.println(Message.TASK_ADDED_SUCCESS);

                    break;
                case 2:
                    System.out.println(Message.DELETE_TASK_HEADER);
                    System.out.print(Message.ENTER_TASK_ID_TO_DELETE);
                    int id = Integer.parseInt(sc.nextLine());
                    if (controller.findByID(id) != null) {
                        controller.deleteTask(id);
                        System.out.println(Message.TASK_DELETED_SUCCESS);
                    } else {
                        System.out.println(Message.TASK_ID_NOT_FOUND);
                    }
                    break;
                case 3:
                    System.out.println(Message.TASK_LIST_HEADER);
                    controller.display();
                    break;
            }
        }
    }

}

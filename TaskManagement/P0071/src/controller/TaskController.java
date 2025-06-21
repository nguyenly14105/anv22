/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dto.TaskDTO;
import java.util.ArrayList;
import model.Task;
import view.TaskView;

/**
 *
 * @author Dell
 */
public class TaskController {

    private final ArrayList<Task> taskList = new ArrayList<>();
    private TaskDTO dto = new TaskDTO();
    private final TaskView view = new TaskView();
    private int ID = 0;

    //set dto
    public void setDTO(TaskDTO dto) {
        this.dto = dto;
    }

    //add task
    public void addTask() {
        this.taskList.add(
                new Task(++ID,
                        dto.getName(),
                        dto.getType(),
                        dto.getDate(),
                        dto.getStart(),
                        dto.getEnd(),
                        dto.getAsignee(),
                        dto.getReviewer()));
    }

    //tim task theo id
    public Task findByID(int id) {
        for (Task task : taskList) {
            if (task.getId() == id) {
                return task;
            }
        }
        return null;
    }

    //xoa task
    public void deleteTask(int id) {
        taskList.remove(findByID(id));
    }

    //hien thi
    public void display() {
        StringBuilder result = new StringBuilder();
        for (Task task : taskList) {
            result.append(task.toString()).append("\n");
        }
        view.setData(result.toString());
        view.display();
    }

}

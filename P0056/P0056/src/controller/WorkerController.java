/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import constants.SalaryStatus;
import dto.WorkerDTO;
import java.util.ArrayList;
import model.Worker;
import view.WorkerView;

/**
 *
 * @author nguye
 */
public class WorkerController {

    private WorkerDTO inputData = new WorkerDTO();
    private ArrayList<Worker> workerList = new ArrayList<>();
    private WorkerView view = new WorkerView();
    
    //set input data
    public void setInputData(WorkerDTO inputForm) {
        this.inputData = inputForm;
    }

    //add a worker
    public void addWorker() {
        workerList.add(new Worker(inputData.getId(), inputData.getName(), inputData.getAge(), inputData.getSalary(), inputData.getWorkLocation()));
    }

    //up salary
    public void upSalary(String code, double amount) {

        for (Worker worker : workerList) {
            if (this.checkID(code)) {
                worker.setSalary(worker.getSalary() + amount);
                worker.setStatus(SalaryStatus.UP);
                break;
            }
        }
    }
    //down salary

    public void downSalary(String code, double amount) {

        for (Worker worker : workerList) {
            if (this.checkID(code)) {
                worker.setSalary(worker.getSalary() - amount);
                worker.setStatus(SalaryStatus.DOWN);
                break;
            }
        }
    }

    //check work ID
    public boolean checkID(String code) {
        for (Worker worker : workerList) {
            return worker.getId().equalsIgnoreCase(code);
        }
        return false;
    }

    //hien thi menu
    public void displayMenu() {
        view.mainMenu();
    }

}

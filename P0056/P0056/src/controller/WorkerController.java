/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import constants.SalaryStatus;
import dto.WorkerDTO;
import java.time.LocalDate;
import java.util.ArrayList;
import model.SalaryHistory;
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
                SalaryHistory history = new SalaryHistory(worker.getSalary(), SalaryStatus.UP, LocalDate.now());
                worker.setSalary(worker.getSalary() + amount);
                worker.addSalaryHistory(history);

                break;
            }
        }
    }
    //down salary

    public void downSalary(String code, double amount) {

        for (Worker worker : workerList) {
            if (this.checkID(code)) {
                SalaryHistory history = new SalaryHistory(worker.getSalary(), SalaryStatus.DOWN, LocalDate.now());
                worker.setSalary(worker.getSalary() - amount);
                worker.addSalaryHistory(history);
                break;
            }
        }
    }

    //check work ID
    public boolean checkID(String code) {
        for (Worker worker : workerList) {
            if (worker.getId().equalsIgnoreCase(code)) {
                return true;
            }
        }
        return false;
    }

    public void displayWorker() {
        view.setData(workerList);
        view.displayWorker();
    }

    //hien thi salary history
    public void displaySalaryHistory() {
        for (Worker worker : workerList) {
            view.setData(worker.getSalaryHistorys());
            view.salaryHistoryView();
        }
    }

    //hien thi menu
    public void displayMenu() {
        view.mainMenu();
    }

}

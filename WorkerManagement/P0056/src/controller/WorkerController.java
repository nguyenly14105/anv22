/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dto.WorkerDTO;
import java.util.ArrayList;
import model.SalaryHistory;
import model.Worker;
import service.WorkerService;
import view.WorkerView;

/**
 *
 * @author nguye
 */
public class WorkerController {

    private WorkerDTO inputData = new WorkerDTO();
    private ArrayList<Worker> workerList = new ArrayList<>();
    private WorkerView view = new WorkerView();
    private WorkerService service = new WorkerService();

    //set input data
    public void setInputData(WorkerDTO inputForm) {
        this.inputData = inputForm;
    }

    //add a worker
    public void addWorker() {
        workerList.add(new Worker(inputData.getId(), inputData.getName(), inputData.getAge(), inputData.getSalary(), inputData.getWorkLocation()));

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

    //tang luong
    public void upSalary(String code, double amount) {
        service.setData(workerList);
        service.upSalary(code, amount);
    }

    //giam luong
    public void downSalary(String code, double amount) {
        service.setData(workerList);
        service.downSalary(code, amount);
    }

    public void displayWorker() {
        view.displayWorker();
    }

    //hien thi salary history
    public void displaySalaryHistory() {
        view.displayHeader();
        for (Worker worker : workerList) {
            for (SalaryHistory record : worker.getSalaryHistorys()) {
                view.setData(worker.toString() + record.toString());
                view.salaryHistoryView();
            }
        }
    }

    //hien thi menu
    public void displayMenu() {
        view.mainMenu();
    }

}

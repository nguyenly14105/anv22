/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

import constants.SalaryStatus;
import java.time.LocalDate;
import java.util.ArrayList;
import model.SalaryHistory;
import model.Worker;

/**
 *
 * @author nguye
 */
public class WorkerService {

    private ArrayList<Worker> data = new ArrayList<>();

    public ArrayList<Worker> getData() {
        return data;
    }

    public void setData(ArrayList<Worker> data) {
        this.data = data;
    }

    //up salary
    public void upSalary(String code, double amount) {
        for (Worker worker : data) {
            if (worker.getId().equalsIgnoreCase(code)) {
                worker.setSalary(worker.getSalary() + amount);
                SalaryHistory history = new SalaryHistory(worker.getSalary(), SalaryStatus.UP, LocalDate.now());
                worker.addSalaryHistory(history);

                break;
            }
        }
    }
    //down salary

    public void downSalary(String code, double amount) {

        for (Worker worker : data) {
            if (worker.getId().equalsIgnoreCase(code)) {
                worker.setSalary(worker.getSalary() - amount);
                SalaryHistory history = new SalaryHistory(worker.getSalary(), SalaryStatus.DOWN, LocalDate.now());
                worker.addSalaryHistory(history);
                break;
            }
        }
    }

}

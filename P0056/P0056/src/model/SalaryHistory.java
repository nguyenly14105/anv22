/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import constants.SalaryStatus;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author nguye
 */
public class SalaryHistory {

    private Worker worker;
    private double salary;
    private SalaryStatus status;
    private LocalDate date;

    public SalaryHistory() {
    }

    public SalaryHistory(double salary, SalaryStatus status, LocalDate date) {
        this.salary = salary;
        this.status = status;
        this.date = date;
    }

    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format("%-6s %-8s %-5d %-8.2f %-8s %-12s",
                worker.getId(), worker.getName(), worker.getAge(), salary, status, date.format(fmt));
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public SalaryStatus getStatus() {
        return status;
    }

    public void setStatus(SalaryStatus status) {
        this.status = status;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

}

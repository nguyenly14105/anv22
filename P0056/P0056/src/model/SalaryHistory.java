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

    private double salaryChange;
    private SalaryStatus status;
    private LocalDate date;

    public SalaryHistory() {
    }

    public SalaryHistory(double salary, SalaryStatus status, LocalDate date) {
        this.salaryChange = salary;
        this.status = status;
        this.date = date;
    }

    @Override
    public String toString() {
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        return String.format(" %-10.2f %-10s %-12s",
                salaryChange, status, date.format(fmt));
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
        return salaryChange;
    }

    public void setSalary(double salary) {
        this.salaryChange = salary;
    }

}

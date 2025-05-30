/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import constants.SalaryStatus;
import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author nguye
 */
public class Worker {

    private String id;
    private String name;
    private int age;
    private double salary;
    private String workLocation;
    private ArrayList<SalaryHistory> salaryHistorys = new ArrayList<>();

    public Worker() {
    }

    public Worker(String id, String name, int age, double salary, String workLocation) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.workLocation = workLocation;
        salaryHistorys.add(new SalaryHistory(salary, SalaryStatus.NO_CHANGE, LocalDate.now()));
    }

    public void addSalaryHistory(SalaryHistory history) {
        salaryHistorys.add(history);
    }

    public ArrayList<SalaryHistory> getSalaryHistorys() {
        return salaryHistorys;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getWorkLocation() {
        return workLocation;
    }

    public void setWorkLocation(String workLocation) {
        this.workLocation = workLocation;
    }

    @Override
    public String toString() {
        return String.format("%-6s %-10s %-5d", id, name, age);
    }
}

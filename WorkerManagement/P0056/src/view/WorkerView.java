/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;
import model.Worker;



/**
 *
 * @author nguye
 */
public class WorkerView {

    private String data ;
    

    public void mainMenu() {
        System.out.println("======== Worker Management ========");
        System.out.println("1. Add Worker");
        System.out.println("2. Up salary");
        System.out.println("3. Down salary");
        System.out.println("4. Display Information salary");
        System.out.println("5. Exit");
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
    
    public void displayWorker(){
       
    }
    public void displayHeader(){
        System.out.println("--------------------Display Information Salary-----------------------");
        System.out.printf("%-6s %-10s %-5s %-10s %-10s %-12s\n", "Code", "Name", "Age", "Salary", "Status", "Date");
     
    }
    public void salaryHistoryView() {
        System.out.println(data);   
    }

}

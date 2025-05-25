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

    private ArrayList<Worker> dataList = new ArrayList<>();

    public void setData(ArrayList inputData) {
        this.dataList = inputData;
    }

    public void mainMenu() {
        System.out.println("======== Worker Management ========");
        System.out.println("1. Add Worker");
        System.out.println("2. Up salary");
        System.out.println("3. Down salary");
        System.out.println("4. Display Information salary");
        System.out.println("5. Exit");
    }
    
    public void displayWorker(){
        System.out.println("----------Worker Information--------------");
        System.out.printf("%-6s %-8s %-5s %-8s %-8s\n","Code","Name","Age","Salary","Work Location");
        for (Worker worker : dataList) {
            System.out.println(worker.toString());
        }
    }
    public void salaryHistoryView() {
        System.out.println("--------------------Display Information Salary-----------------------");
        System.out.printf("%-6s %-10s %-5s %-10s %-8s %-12s\n", "Code", "Name", "Age", "Salary", "Status", "Date");
      

    }

}

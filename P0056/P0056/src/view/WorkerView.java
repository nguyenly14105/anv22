/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import java.util.ArrayList;

/**
 *
 * @author nguye
 */
public class WorkerView {
    private ArrayList data = new ArrayList<>();
    
    public void setData(ArrayList inputData){
        this.data=inputData;
    }
    
    
    public void mainMenu(){
        System.out.println("======== Worker Management ========");
        System.out.println("1. Add Worker");
        System.out.println("2. Up salary");
        System.out.println("3. Down salary");
        System.out.println("4. Display Information salary");
        System.out.println("5. Exit");
    }
    
    
    
}

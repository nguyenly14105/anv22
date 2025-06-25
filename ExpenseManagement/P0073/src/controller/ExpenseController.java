/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dto.ExpenseDTO;
import java.util.*;
import model.Expense;
import service.ExpenseService;
import view.ExpenseView;

/**
 *
 * @author Dell
 */
public class ExpenseController {

    private ArrayList<Expense> expenseList = new ArrayList<>();
    private ExpenseDTO dto = new ExpenseDTO();
    private final ExpenseService service = new ExpenseService();
    private final ExpenseView view = new ExpenseView();
    private int ID = 1;

    //set dto
    public void setDTO(ExpenseDTO dto) {
        this.dto = dto;
    }

    //add an expense
    public void addExpense() {
        expenseList.add(new Expense(ID++, dto.getDate(), dto.getAmount(), dto.getContent()));
    }

    
    //tu tao ra id khong trung lap
    public int generateID() {
        while (true) {
            if (expenseList.stream().noneMatch(e -> e.getId() == ID)) {
                return ID;
            } else {
                ID++;
            }
        }
    }

    //tim kiem theo id
    public Expense finByID(int id) {
        for (Expense expense : expenseList) {
            if (expense.getId() == id) {
                return expense;
            }
        }
        return null;
    }

    //delete theo id
    public void delete(int id) {
        expenseList.remove(id - 1);
    }

    //tinh total amount
    public double totalAmount() {
        if (!expenseList.isEmpty()) {
            service.setExpenses(expenseList);
        }
        return service.totalAmount();
    }

    //display all expenses
    public void displayExpenses() {
        StringBuilder result = new StringBuilder();
        for (Expense expense : expenseList) {
            result.append(expense.toString()).append("\n");
        }
        view.setData(result.toString());
        view.display();
    }

}

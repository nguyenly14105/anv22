/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constants;

/**
 *
 * @author Dell
 */
public class Messages {

    public Messages() {
    }

    //menu
    public static final String EXPENSE_MENU
            = "======== Handy Expense Program ========\n"
            + "1. Add an expense\n"
            + "2. Display all expenses\n"
            + "3. Delete an expense\n"
            + "4. Read expenses from file\n"
            + "5.Quit\n"
            + "Enter your choice:";
    //add an expense
    public static final String ADD_ID = "Enter ID: ";
    public static final String ADD_DATE = "Enter Date: ";
    public static final String ADD_AMOUNT = "Enter Amount: ";
    public static final String ADD_CONTENT = "Enter Content: ";
    //display all enpense
    public static final String DISPLAY_ALL_EXPENSE = "========== Display All Expense =========\n"
            + String.format("%-3s %-15s %-10s %-15s", "ID", "Date", "Amount", "Content");
    //total amount
    public static final String TOTAL_AMOUNT = "Total Amount: ";
    //exception
    public static final String INVALID_NUMBER = "Invalid number !!!";
    public static final String INVALID_DATE = "Invalid date format! Must be dd-MM-yyyy";
    public static final String OUT_OF_RANGE = "Number must be in range[1-4]!";
    public static final String STRING_EMPTY = "Empty !!! Enter again !";
    public static final String READ_FILE_SUCCESSFULL = "Read file successfull !";
    public static final String READ_FILE_FAIL = "Read file fail !";
    public static final String NOT_FOUND = "Not found expense!";
    public static final String DELETE_SUCCESSFULL = "Delete successfull!";
}

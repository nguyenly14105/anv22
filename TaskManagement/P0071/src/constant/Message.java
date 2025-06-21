/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constant;

/**
 *
 * @author Dell
 */
public class Message {

    private Message() {
    }

    public static final String MENU
            = "======== Task Program ========\n" + "1. Add Task\n" + "2. Delete Task\n" + "3. Display Task\n" + "4. Exit\n" + "Please choose an option (1-4):\n";

    // Add Task
    public static final String ADD_TASK_HEADER = "------------ Add Task ---------------";
    public static final String ENTER_REQUIREMENT_NAME = "Requirement Name: ";
    public static final String ENTER_TASK_TYPE = "1.Code\n" + "2.Test\n" + "3.Design\n" + "4.Review\n" + "Task Type (1-4): ";
    public static final String ENTER_DATE = "Date (dd-MM-yyyy): ";
    public static final String ENTER_FROM = "From (8.0 - 17.0): ";
    public static final String ENTER_TO = "To (after From): ";
    public static final String ENTER_ASSIGNEE = "Assignee: ";
    public static final String ENTER_REVIEWER = "Reviewer: ";

    // Delete Task
    public static final String DELETE_TASK_HEADER = "------------ Delete Task ---------------";
    public static final String ENTER_TASK_ID_TO_DELETE = "Enter Task ID to delete: ";

    // Display
    public static final String TASK_LIST_HEADER = "----------------------------------------- Task ---------------------------------------\n" + String.format("%-3s %-15s %-10s %-15s %-5s %-15s %-15s", "ID", "Name", "Task type", "Date", "Time", "Assignee", "Reviewer");

    // Errors
    public static final String INVALID_OPTION = "Invalid option. Please choose 1-4.";
    public static final String INVALID_DATE = "Invalid date format. Must be dd-MM-yyyy.";
    public static final String INVALID_TASK_TYPE = "Task type must be from 1 to 4.";
    public static final String INVALID_PLAN_TIME = "Plan time must be in range (8.0 to 17.5) and From < To.";
    public static final String TASK_ID_NOT_FOUND = "Task ID not found!";
    public static final String INPUT_CANNOT_BE_EMPTY = "Input cannot be empty.";

    // Success
    public static final String TASK_ADDED_SUCCESS = "Task added successfully!";
    public static final String TASK_DELETED_SUCCESS = "Task deleted successfully!";
}

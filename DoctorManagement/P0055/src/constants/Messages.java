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

    private Messages() {
    }
    //menu
    public static final String MENU = "======== Doctor Management ========\n"
            + "1. Add doctor\n"
            + "2. Update doctor\n"
            + "3. Delete doctor\n"
            + "4. Display doctor\n"
            + "5. Exit\n"
            + "Enter your choice: ";
    //doctor information header
    public static final String DOCTOR_INFORMATION = "=============== Doctor Information ================\n"
            + String.format("%-7s %-15s %-20s %-10s", "Code", "Name", "Specialization", "Availability");
    //add doctor
    public static final String ADD_CODE = "Enter code: ";
    public static final String ADD_NAME = "Enter name: ";
    public static final String ADD_SPECIALIZATION = "Enter specialization: ";
    public static final String ADD_AVAILABILITY = "Enter availability: ";
    //exception
    public static final String INVALID_NUMBER = "Invalid number!";
    public static final String INVALID_AVAILABILITY = "Invalid availability!";
    public static final String INVALID_OPTION = "Invalid option. Please choose 1-5.";
    public static final String NOT_FOUND = "Not found!";
    public static final String INPUT_CANNOT_BE_EMPTY = "Input cannot be empty.";
    //message
    public static final String DOCTOR_ADDED_SUCCESS = "Doctor added successfully!";
    public static final String DOCTOR_DELETED_SUCCESS = "Doctor deleted successfully!";
    public static final String UPDATE_SUCCESS = "Doctor updated successfully!";
}

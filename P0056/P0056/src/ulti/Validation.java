/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ulti;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 *
 * @author nguye
 */
public class Validation {

    private static Scanner sc = new Scanner(System.in);

    public Validation() {
    }

    //check int
    public static int checkInt(String input, int min, int max) {
        int number;
        while (true) {
            try {
                //in ra yeu cau nhap vao input
                System.out.println("Enter " + input + ":");
                number = Integer.parseInt(sc.nextLine());
                //check xem input co nam trong khoang min,max
                if (number >= min && number <= max) {
                    return number;
                } else {
                    System.out.println("Number more than " + min + " and less than " + max);
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter integer number, please!");
            }

        }

    }

    //check double
    public static double checkDouble(String input) {
        double number;
        while (true) {
            try {
                //yeu cau nhap vao input
                System.out.println("Enter " + input + ":");
                number = Double.parseDouble(sc.nextLine());
                //check number co > 0
                if (number > 0) {
                    return number;
                } else {
                    System.out.println(input + " more than zero!");
                }
            } catch (NumberFormatException e) {
                System.out.println("Enter double number, please!");

            }
        }
    }

    //check worker code theo format 1 chu cai + 2 so
    public static void checkCode(String code){
       String reString = "^[A-Za-z]\\d{2}$";
        if (code.matches(reString)) {
            System.out.println("Input is correct format!");
        } else {
            System.out.println("Input is not correct format!");
            System.out.println("Format: W00, W01, ...");
        }
        
    }
    //check string
    public static String checkString(String input) {

        while (true) {
            System.out.println("Enter " + input + ":");
            String string = sc.nextLine();
            if (!string.isEmpty()) {
                return string;
            } else {
                System.out.println(input + " do not empty!");
            }

        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utils;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class Validation {

    private static  final Scanner sc = new Scanner(System.in);

    private Validation() {
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

    //check yes or no
    public static boolean checkYN() {
        while (true) {
            System.out.println("Do you want to continue(Y/N)?");
            String input = sc.nextLine();
            if (input.isEmpty()) {
                System.out.println("Input do not empty!");
            } else {
                if (input.equalsIgnoreCase("Y")) {
                    return true;
                } else if (input.equalsIgnoreCase("N")) {
                    return false;
                } else {
                    System.out.println("Enter Y or N, please");
                    checkYN();
                }
            }
        }
    }

    //check update or delete
    public static boolean checkUD() {
        while (true) {
            System.out.println("Do you want to Update or Delete(U/D)?");
            String input = sc.nextLine();
            if (input.isEmpty()) {
                System.out.println("Input do not empty!");
            } else {
                if (input.equalsIgnoreCase("U")) {
                    return true;
                } else if (input.equalsIgnoreCase("D")) {
                    return false;
                } else {
                    System.out.println("Enter U or D, please");
                    checkUD();
                }
            }
        }
    }

    //format ten nhap vao
    public static String formatName(String name) {
        name = name.trim().toLowerCase();
        String[] words = name.split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String word : words) {
            result.append(Character.toUpperCase(word.charAt(0)));
            if (word.length() > 1) {
                result.append(word.substring(1));
            }
            result.append(" ");
        }
        return result.toString().trim();
    }

}

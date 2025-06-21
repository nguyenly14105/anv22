/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ulti;

import constant.Message;
import exception.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Dell
 */
public class Validation {

    private Validation() {
    }

    //check int
    public static int checkInt(String input, int min, int max) throws OutOfRangeException {

        try {
            int number = Integer.parseInt(input);

            if (number >= min && number <= max) {
                return number;
            } else {
                throw new OutOfRangeException(Message.INVALID_OPTION);
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid number !!!");
        }

    }

    //check  double
    public static double checkTaskTime(String input) throws OutOfRangeException {
        try {
            double number = Double.parseDouble(input);
            if (number >= 8.0 && number <= 17.5) {
                if (number * 10 % 5 == 0) {
                    return number;
                } else {
                    throw new NumberFormatException("Invalid format[8.0-8.5-...-17.5]");
                }

            } else {
                throw new OutOfRangeException(Message.INVALID_PLAN_TIME);
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException("Invalid number !!!");
        }
    }

    //check string
    public static String checkString(String input) throws StringEmptyException {
        if (!input.isEmpty()) {
            return input;
        } else {
            throw new StringEmptyException(Message.INPUT_CANNOT_BE_EMPTY);
        }
    }

    //check date format
    public static Date checkDateformat(String input) throws DateFormatException {
        SimpleDateFormat dateFormater = new SimpleDateFormat("dd-MM-yyyy");
        dateFormater.setLenient(false);
        try {
            return dateFormater.parse(input);
        } catch (ParseException e) {
            throw new DateFormatException(Message.INVALID_DATE);
        }
    }

    //name format 
    public static String formatName(String input) {
        String name[] = input.trim().toLowerCase().split("\\s+");
        StringBuilder result = new StringBuilder();
        for (String string : name) {
            result.append(Character.toUpperCase(string.charAt(0)));
            if (string.length() > 1) {
                result.append(string.substring(1));
            }
            result.append(" ");
        }
        return result.toString().trim();
    }

    //check plan from< plan to
    public static boolean checkTaskTimeLogic(double start, double end) {
        return start < end;
    }

}

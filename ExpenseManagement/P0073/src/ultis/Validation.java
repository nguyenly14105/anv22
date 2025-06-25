/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultis;

import constants.Messages;
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

    public static int checkInt(String input, int min, int max) throws ExpenseException {

        try {
            int number = Integer.parseInt(input);

            if (number >= min && number <= max) {
                return number;
            } else {
                throw new ExpenseException(Messages.OUT_OF_RANGE);
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException(Messages.INVALID_NUMBER);
        }

    }

    //check  double
    public static double checkAmount(String input) throws ExpenseException {
        try {
            double number = Double.parseDouble(input);
            if (number > 0) {
                return number;
            } else {
                throw new ExpenseException(Messages.INVALID_NUMBER);
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException(Messages.INVALID_NUMBER);
        }

    }

    //check string
    public static String checkString(String input) throws ExpenseException {
        if (!input.isEmpty()) {
            return input;
        } else {
            throw new ExpenseException(Messages.STRING_EMPTY);
        }
    }

    //check date format
    public static Date checkDateformat(String input) throws ExpenseException {
        SimpleDateFormat dateFormater = new SimpleDateFormat("dd-MM-yyyy");
        dateFormater.setLenient(false);
        try {
            return dateFormater.parse(input);
        } catch (ParseException e) {
            System.err.println(Messages.INVALID_DATE);           
        }
        return null;
    }

}

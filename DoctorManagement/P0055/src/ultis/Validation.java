/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultis;

import constants.Messages;

/**
 *
 * @author Dell
 */
public class Validation {

    private Validation() {
    }

    //check int
    public static int checkInt(String input, int min, int max) throws DoctorException {

        try {
            int number = Integer.parseInt(input);

            if (number >= min && number <= max) {
                return number;
            } else {
                throw new DoctorException(Messages.INVALID_OPTION);
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException(Messages.INVALID_NUMBER);
        }

    }

    //check availability
    public static int checkAvailability(String input) throws DoctorException {
        try {
            int number = Integer.parseInt(input);

            if (number > 0) {
                return number;
            } else {
                throw new DoctorException(Messages.INVALID_AVAILABILITY);
            }
        } catch (NumberFormatException e) {
            throw new NumberFormatException(Messages.INVALID_NUMBER);
        }
    }

    //check string
    public static String checkString(String input) throws DoctorException {
        if (!input.isEmpty()) {
            return input;
        } else {
            throw new DoctorException(Messages.INPUT_CANNOT_BE_EMPTY);
        }
    }

}

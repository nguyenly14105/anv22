
import controller.DoctorController;
import java.util.Scanner;
import constants.Messages;
import dto.DoctorDTO;
import java.util.logging.Level;
import java.util.logging.Logger;
import ultis.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author Dell
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DoctorDTO dto = new DoctorDTO();
        DoctorController controller = new DoctorController();

        while (true) {
            System.out.println(Messages.MENU);
            int choice = -1;
            while (choice < 0) {
                try {
                    choice = Validation.checkInt(sc.nextLine(), 1, 5);
                } catch (DoctorException ex) {
                    System.err.println(ex.getMessage());
                }
            }
            String code = "", name = "", specialization = "";
            int availability = -1;
            switch (choice) {
                case 1:
                    //add name
                    do {
                        System.out.print(Messages.ADD_NAME);
                        try {
                            name = Validation.checkString(sc.nextLine());
                        } catch (DoctorException ex) {
                            System.err.println(ex.getMessage());
                        }
                    } while (name.isEmpty());
                    dto.setName(name);
                    //add specialization
                    do {
                        System.out.print(Messages.ADD_SPECIALIZATION);
                        try {
                            specialization = Validation.checkString(sc.nextLine());
                        } catch (DoctorException ex) {
                            System.err.println(ex.getMessage());
                        }
                    } while (specialization.isEmpty());
                    dto.setSpecialization(specialization);
                    //add availability
                    do {
                        System.out.print(Messages.ADD_AVAILABILITY);
                        try {
                            availability = Validation.checkAvailability(sc.nextLine());
                        } catch (DoctorException ex) {
                            System.err.println(ex.getMessage());
                        }
                    } while (availability < 0);
                    dto.setAvailability(availability);
                    //
                    controller.setDTO(dto);
                    controller.addDoctor();
                    System.out.println(Messages.DOCTOR_ADDED_SUCCESS);
                    break;
                case 2:
                    //add code
                    do {
                        System.out.print(Messages.ADD_CODE);
                        try {
                            code = Validation.checkString(sc.nextLine());
                        } catch (DoctorException ex) {
                            System.err.println(ex.getMessage());
                        }

                    } while (code.isEmpty());
                    if (controller.findById(code) == null) {
                        System.out.println(Messages.NOT_FOUND);
                    } else {
                        //add name
                        do {
                            System.out.print(Messages.ADD_NAME);
                            try {
                                name = Validation.checkString(sc.nextLine());
                            } catch (DoctorException ex) {
                                System.err.println(ex.getMessage());
                            }
                        } while (name.isEmpty());
                        dto.setName(name);
                        //add specialization
                        do {
                            System.out.print(Messages.ADD_SPECIALIZATION);
                            try {
                                specialization = Validation.checkString(sc.nextLine());
                            } catch (DoctorException ex) {
                                System.err.println(ex.getMessage());
                            }
                        } while (specialization.isEmpty());
                        dto.setSpecialization(specialization);
                        //add availability
                        do {
                            System.out.print(Messages.ADD_AVAILABILITY);
                            try {
                                availability = Validation.checkAvailability(sc.nextLine());
                            } catch (DoctorException ex) {
                                System.err.println(ex.getMessage());
                            }
                        } while (availability < 0);
                        dto.setAvailability(availability);
                        controller.update(code, name, specialization, availability);
                        System.out.println(Messages.UPDATE_SUCCESS);
                    }
                    break;
                case 3:
                    //add code
                    do {
                        System.out.print(Messages.ADD_CODE);
                        try {
                            code = Validation.checkString(sc.nextLine());
                        } catch (DoctorException ex) {
                            System.err.println(ex.getMessage());
                        }

                    } while (code.isEmpty());
                    if (controller.findById(code) == null) {
                        System.out.println(Messages.NOT_FOUND);
                    } else {
                        controller.delete(code);
                        System.out.println(Messages.DOCTOR_DELETED_SUCCESS);
                    }
                    break;
                case 4:
                    System.out.println(Messages.DOCTOR_INFORMATION);
                    controller.displayDoctor();
                    break;

            }
            if (choice == 5) {
                break;
            }

        }
    }

}


import constants.Messages;
import controller.ExpenseController;
import dto.ExpenseDTO;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
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
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        ExpenseController controller = new ExpenseController();
        ExpenseDTO dto = new ExpenseDTO();
        int choice = 0;
        while (true) {
            System.out.println(Messages.EXPENSE_MENU);
            try {
                choice = Validation.checkInt(sc.nextLine(), 1, 4);
            } catch (ExpenseException ex) {
                System.err.println(ex.getMessage());
            }
            switch (choice) {
                case 1:
                    Date date = null;
                    double amount = -1;
                    String content = null;
                    //add date
                    do {
                        System.out.print(Messages.ADD_DATE);
                        try {
                            date = Validation.checkDateformat(sc.nextLine());
                        } catch (ExpenseException ex) {
                            System.err.println(ex.getMessage());
                        }
                    } while (date == null);
                    dto.setDate(date);
                    //add amount
                    do {
                        System.out.print(Messages.ADD_AMOUNT);
                        try {
                            amount = Validation.checkAmount(sc.nextLine());
                        } catch (ExpenseException ex) {
                            System.err.println(ex.getMessage());
                        }

                    } while (amount < 0);
                    dto.setAmount(amount);
                    //add content
                    do {
                        System.out.print(Messages.ADD_CONTENT);
                        try {
                            content = Validation.checkString(sc.nextLine());
                        } catch (ExpenseException ex) {
                            System.err.println(ex.getMessage());
                        }
                    } while (content == null);
                    dto.setContent(content);
                    //set dto
                    controller.setDTO(dto);
                    controller.addExpense();
                    break;
                case 2:
                    System.out.println(Messages.DISPLAY_ALL_EXPENSE);
                    controller.displayExpenses();
                    System.out.println(Messages.TOTAL_AMOUNT + controller.totalAmount());
                    break;

                case 3:
                    try {
                    System.out.println(Messages.ADD_ID);
                    int id = Integer.parseInt(sc.nextLine());
                    if (controller.finByID(id) != null) {
                        controller.delete(id);
                        System.out.println(Messages.DELETE_SUCCESSFULL);
                    } else {
                        System.out.println(Messages.NOT_FOUND);
                    }
                } catch (NumberFormatException ex) {
                    System.out.println(Messages.INVALID_NUMBER);
                }

                break;
                case 4: 
                    try {
                    List<String> expenses = ReadFile.readFile("Expenses.txt");
                    if (!expenses.isEmpty()) {
                        System.out.println(Messages.READ_FILE_SUCCESSFULL);
                    }
                    for (String line : expenses) {
                        String words[] = line.split(";");
                        try {
                            dto.setDate(Validation.checkDateformat(words[0]));
                            dto.setAmount(Validation.checkAmount(words[1]));
                            dto.setContent(Validation.checkString(words[2]));
                            controller.setDTO(dto);
                            controller.addExpense();
                        } catch (ExpenseException ex) {
                            System.err.println(ex.getMessage());
                        }
                    }
                } catch (IOException ex) {
                    System.out.println(Messages.READ_FILE_FAIL);
                }

                break;

            }
            if (choice == 5) {
                break;
            }

        }

    }

}

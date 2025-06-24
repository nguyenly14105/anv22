/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p0025;

import controller.TextController;
import java.io.IOException;
import ultis.*;
import constans.Messages;

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
        TextController controller = new TextController();
        String input = null;
        String result;
        try {
            input = ReadFile.readFile("input.txt");
            if (!input.isEmpty()) {
                System.out.println(Messages.READ_FILE_SUCCESSFULL);
            }
        } catch (IOException e) {
            System.err.println(e);
        }
        //set input vao controller
        controller.setText(input);
        //normalize text
        controller.normalizeText();
        result = controller.getText();
        try {
            WriteFile.writeFile("output.txt", result);
            System.out.println(Messages.WRITE_FILE_SUCCESSFULL);
        } catch (IOException e) {
            System.out.println(Messages.WRITE_FILE_FAIL);
        }

    }

}

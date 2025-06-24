/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ultis;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 *
 * @author Dell
 */
public class ReadFile {
    private ReadFile(){       
    }
    public static String readFile(String fileName) throws IOException{
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }
}

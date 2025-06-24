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
public class WriteFile {

    private WriteFile() {
    }
    public static void writeFile(String fileName,String content) throws IOException{
        Files.write(Paths.get(fileName), content.getBytes());
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author Dell
 */
public class DateFormatException extends Exception{

    public DateFormatException() {
    }

    public DateFormatException(String string) {
        super(string);
    }

    public DateFormatException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public DateFormatException(Throwable thrwbl) {
        super(thrwbl);
    }

    public DateFormatException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }

    
    
}

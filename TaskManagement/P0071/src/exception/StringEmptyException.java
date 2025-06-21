/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author Dell
 */
public class StringEmptyException extends Exception {

    public StringEmptyException() {
    }

    public StringEmptyException(String string) {
        super(string);
    }

    public StringEmptyException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public StringEmptyException(Throwable thrwbl) {
        super(thrwbl);
    }

    public StringEmptyException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }
    
}

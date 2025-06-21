/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

/**
 *
 * @author Dell
 */
public class OutOfRangeException extends Exception {

    public OutOfRangeException() {
    }

    public OutOfRangeException(String string) {
        super(string);
    }

    public OutOfRangeException(String string, Throwable thrwbl) {
        super(string, thrwbl);
    }

    public OutOfRangeException(Throwable thrwbl) {
        super(thrwbl);
    }

    public OutOfRangeException(String string, Throwable thrwbl, boolean bln, boolean bln1) {
        super(string, thrwbl, bln, bln1);
    }

  

}

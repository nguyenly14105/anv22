/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package constants;

/**
 *
 * @author nguye
 */
public enum Course {
    JAVA("Java"), DOT_NET(".Net"),C_CPP("C/C++");
    private final String label;

    private Course(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    @Override
    public String toString() {
        return label;
    }
    
    
    
    
    
}

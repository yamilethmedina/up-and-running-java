/*
 * This program demonstrates implicit and explicit data conversion
 */
package dataconversion;

/**
 *
 * @author Peggy Fisher
 */
public class DataConversion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // int (without decimal)
        System.out.println((3 + 5 + 8)/ 3);
        // double (includes decimal portion)
        System.out.println((3 + 5 + 8) / 3.0);
        
        // not the correct result
        double volume = 4/3 * Math.PI * 10 * 10 * 10;
        // correct
        double real_volume = 4/3.0 * Math.PI * 10 * 10 * 10;
        System.out.println("The incorrect volume of a sphere with radius 10 is: " + volume);
        System.out.println("The correct volume of a sphere with radius 10 is: " + 
                real_volume);
        double fahrenheit = 500;
        double celcius = (fahrenheit - 32) * (5/9.0);
        System.out.println("Celcius is " + celcius);
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methods;
import java.util.Scanner;

/**
 *
 * @author Peggy Fisher
 */
public class Methods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double x, y, z;
        // not the same avg as the variable defined in the average method 
        // due to scope
        
        double avg;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 3 numbers: ");
        x = in.nextDouble();
        y = in.nextDouble();
        z = in.nextDouble();
        
        avg = average(x, y, z);
        System.out.println("the average is " + avg);
    }
    
//     visibility, static (because it's in the same file), data type, values,
//     values calling program needs to send (with data types)
    public static double average(double num1, double num2, double num3) {
        double avg = (num1 + num2 + num3) / 3;
        return avg;
    }
    
}

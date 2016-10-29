/*
 * This program is designed to calculate the exterior surface area of a house
 */
package simplecalculation;
import java.util.Scanner;
/**
 *
 * @author Peggy Fisher
 */
public class SimpleCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // declare variables
        double surfaceArea, length, width, height, windowWidth, windowHeight, doorWidth, doorHeight;
        double windows, doors;
        Scanner in = new Scanner(System.in);
        // ask for length, width, height
        System.out.println("What is the width, length, and height of the house to be painted?");
        width = in.nextDouble();
        length = in.nextDouble();
        height = in.nextDouble();
        System.out.println("Enter the # of windows, width, and height");
        windows = in.nextInt();
        windowWidth = in.nextDouble();
        windowHeight = in.nextDouble();
        System.out.println("Enter the # of doors, width, and height?");
        doors = in.nextInt();
        doorWidth = in.nextDouble();
        doorHeight = in.nextDouble();
        // ask for number and size of windows
        // ask for number and size of doors
        // calculate surface area
        surfaceArea = (width * height * 2 + length * height * 2) - (doorWidth * doorHeight * doors) - (windowWidth * windowHeight * windows);
//        surfaceArea = (width * height * 2 + length * height * 2) - (windows * windowWidth 
//                * windowHeight + doors * doorWidth * doorHeight);
        System.out.printf("The paintable surface area of your house is %5.2f", surfaceArea);
                
        
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package travelcost;
import java.util.Scanner;
/**
 *
 * @author Peggy Fisher
 */
public class TravelCost {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double distance;
        double mpg;
        double pricePerGallon; 
        double totalCost;
//        double distance, mpg, pricePerGallon, totalCost;
        String vehicleType;
        // read what user types on keyboard
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the total distance in miles");
        distance = in.nextDouble();
        System.out.println("Enter the mpg for the vehicle:");
        mpg = in.nextDouble();
        System.out.println("Enter the price of one gallon of gas");
        pricePerGallon = in.nextDouble();
        System.out.println("Enter vehicle type: ");
        vehicleType = in.next();
        
        totalCost = (distance/mpg) * pricePerGallon;
        System.out.printf("The trip is going to cost $%5.2f since you are driving a " + vehicleType, totalCost);
        // print blank line
        System.out.println();
    }
    
}

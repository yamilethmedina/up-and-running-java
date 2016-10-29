/*
 * This challenge computes and displays the total charges for a hospital stay
 * The patient might be admitted overnight.  For an overnight stay, we need: 
 *   The number of days spent in the hospital
 *   The daily rate
 *   Medication charges
 *   Lab service charges
 * If it is not overnight, we only need: 
 *   Medication charges
 *   Lab service charges
Allow for multiple patients
 */
package hospitalstay;
import java.util.Scanner;
/**
 *
 * @author Peggy Fisher
 */
public class HospitalStay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int days = 0;
    double stayCost, medCharges, labCharges, totalCost;
//    int patients = 0;
    boolean overnight;
    
    Scanner in = new Scanner(System.in);
    System.out.println("Did you stay in the hospital overnight? Answer true or false");
    overnight = in.nextBoolean();
   
    
    // make overnight check into a separate method
    // refactor
    if (overnight == true) {
        System.out.println("What was the cost of your hospital stay?");
        stayCost = in.nextDouble();
        System.out.println("What are the medication charges and lab service charges?");
    medCharges = in.nextDouble();
    labCharges = in.nextDouble();
        totalCost = stayCost + medCharges + labCharges;
        System.out.println("The cost of your hospital stay was " + totalCost);
        }
    else {
        System.out.println("What are the medication charges and lab service charges?");
    medCharges = in.nextDouble();
    labCharges = in.nextDouble();
        totalCost = medCharges + labCharges;
        System.out.println("The cost of your hospital stay was " + totalCost);
        }
    }
}

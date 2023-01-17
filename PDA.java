import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * Permissible Dating Age program
 *
 * @author Mr. Jaffe
 * @version 2021-06-22 Version 1.0.0
 */
public class PDA
{
    double age; 
    int HIGHER_BOUND = 14;
    int LOWER_BOUND = 13;
    Scanner scanner = new Scanner(System.in);
    boolean shouldContinue  = true;
    /**
     * Constructor for objects of class PDA
     */
    public PDA()
    {
        // We don't need to do anything in the constructor for
        // our program.
    }

    /**
     * This is the main event loop for our PDA program
     */
    public void runEventLoop() {
        while (shouldContinue) {
            System.out.println("How old are you?");
            System.out.println("if you want to quit, type 0");
            try {
                age = scanner.nextInt();
                if( age == 0) { 
                shouldContinue = false; 
                }
                
                else if(age <= HIGHER_BOUND){
                    System.out.println(age+" is too young!!");
                }
                else {
                    getYoungerAge(age); 
                    getOlderAge(age);
                }
            } catch (InputMismatchException error) {
                System.out.println("Please enter an integer");
                scanner.next();
            }
        }
    } 

    public void getYoungerAge(double age) { 
        System.out.println("The minimum age is " + Math.ceil((age/2) + 7));
    }

    public void getOlderAge(double age){
        System.out.println("The maximum age is " + Math.floor((age-7)*2));
    } 
    
    

    /**
     * The main method instantiates and runs the program
     */
    public static void main (String[] args) {
        PDA pda = new PDA();
        pda.runEventLoop();
    }
}


import java.util.Scanner;

/**
 * Created by pas8 on 4/13/2017.
 */
public class Exercise6 {
    public static void main(String[] args) {
        String choice;
        do {
            //Output
            System.out.println("Hello, World!");

            //Input
            System.out.println("Would you like to continue (y/n): ");
            Scanner scan = new Scanner(System.in);
            choice = scan.nextLine();
        }while(choice.equalsIgnoreCase("y"));

        //End statement
        System.out.println("Goodbye!");
    }
}

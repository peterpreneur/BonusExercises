import java.util.Scanner;

/**
 * Created by pas8 on 4/13/2017.
 */
public class Exercise10 {
    public static void main(String[] args) {
        String choice;
        Scanner scan = new Scanner(System.in);

        do {
            //Input
            System.out.println("Enter your height in inches: ");
            float height = scan.nextFloat();

            if(height <= 1.7){
                System.out.println("Sorry, you can't ride the Raptor. You need 1.7 more inches");
            }else {
                System.out.println("Great, you can ride the Raptor!");
            }

            //Input
            System.out.println("Would you like to continue (y/n): ");
            choice = scan.nextLine();

        } while (choice.equalsIgnoreCase("y"));

        //End statement
        System.out.println("Goodbye!");
    }
}

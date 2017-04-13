import java.util.Scanner;

/**
 * Created by pas8 on 4/13/2017.
 */
public class Exercise7 {
    public static void main(String[] args) {
        String choice;
        Scanner scan = new Scanner(System.in);

        do {
            //Input
            System.out.println("Enter some text: ");
            String text = scan.nextLine();
            scan.nextLine();

            //Output
            System.out.println(text);

            //Input
            System.out.println("Would you like to continue (y/n): ");
            choice = scan.nextLine();

        }while(choice.equalsIgnoreCase("y"));

        //End statement
        System.out.println("Goodbye!");
    }
}

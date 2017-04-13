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
            System.out.println("Enter a language: ");
            String lang = scan.nextLine();

            switch (lang.toLowerCase()) {
                case "english":
                    System.out.println("Hello, World!");
                    break;
                case "spanish":
                    System.out.println("Hola Mundo!");
                    break;
                case "dutch":
                    System.out.println("Hallo wereld");
            }

            //Input
            System.out.println("Would you like to continue (y/n): ");
            choice = scan.nextLine();

        } while (choice.equalsIgnoreCase("y"));

        //End statement
        System.out.println("Goodbye!");
    }
}

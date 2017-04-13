import java.util.Scanner;

/**
 * Created by pas8 on 4/13/2017.
 */
public class Exercise8 {
    public static void main(String[] args) {
        String choice;
        Scanner scan = new Scanner(System.in);

        do {
            //Input
            System.out.println("Enter a Int number: ");
            int num  = scan.nextInt();
            scan.nextLine();

            System.out.println("Enter some text: ");
            String text = scan.nextLine();

            System.out.println("Enter the 1st number: ");
            float num1 = scan.nextFloat();

            System.out.println("Enter the 2nd number: ");
            float num2 = scan.nextFloat();

            System.out.println("Enter a Floating number: ");
            float numFlt = scan.nextFloat();
            scan.nextLine();

            //Output
            System.out.println(num);
            System.out.println(text);
            System.out.println(num1);
            System.out.println(num2);
            System.out.println(numFlt);

            //Input
            System.out.println("Would you like to continue (y/n): ");
            choice = scan.nextLine();

        }while(choice.equalsIgnoreCase("y"));

        //End statement
        System.out.println("Goodbye!");
    }
}

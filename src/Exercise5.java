import java.util.Scanner;

/**
 * Created by pas8 on 4/13/2017.
 */
public class Exercise5 {
    public static void main(String[] args) {
        //Input
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        float num1 = scan.nextFloat();

        System.out.println("Enter another number: ");
        float num2 = scan.nextFloat();
        scan.nextLine();

        //Output
        System.out.println("The product is " + (num1 + num2));
    }
}

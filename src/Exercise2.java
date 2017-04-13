import java.util.Scanner;

/**
 * Created by pas8 on 4/13/2017.
 */
public class Exercise2 {
    public static void main(String[] args) {
        //Input
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int num  = scan.nextInt();
        scan.nextLine();

        //Output
        System.out.println(num);
    }
}

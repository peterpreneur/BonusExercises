import java.util.Scanner;

/**
 * Created by pas8 on 4/13/2017.
 */
public class Exercise1 {
    public static void main(String[] args) {
        //Input
        System.out.println("Enter some text: ");
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();
        scan.nextLine();

        //Output
        System.out.println(text);
    }
}

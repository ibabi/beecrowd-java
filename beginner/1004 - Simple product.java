import java.io.IOException;
import java.util.Scanner;

/**
 * 1004 - Simple product:
 *      Read two integer values. After this, calculate the product between them and store
 *      the result in a variable named PROD. Print the result like the example below.
 *      Do not forget to print the end of line after the result, otherwise you will
 *      receive “Presentation Error”.
 */

public class Main {

    public static void main(String[] args) throws IOException {

        int A, B, PROD;

        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        PROD = A * B;

        System.out.println("PROD = " + PROD);
    }

}
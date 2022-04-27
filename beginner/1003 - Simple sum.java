import java.io.IOException;
import java.util.Scanner;

/**
 * 1003 - Simple sum:
 *      Read two integer values, in this case, the variables A and B. After this,
 * calculate the sum between them and assign it to the variable SOMA. Write the
 * value of this variable.
 */

public class Main {

    public static void main(String[] args) throws IOException {

        int A, B, SOMA;

        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();

        SOMA = A + B;
        System.out.println("SOMA = " + SOMA);
    }

}
import java.io.IOException;
import java.util.Scanner;

/**
 * 1001 - Read and Sum Variables:
 *      Read 2 variables, named A and B and make the sum of these
 * two variables, assigning its result to the variable X. Print X
 * as shown below. Print endline after the result otherwise you will
 * get “Presentation Error”.
 */
public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();

        int X = A + B;

        System.out.println("X = " + X);

    }

}
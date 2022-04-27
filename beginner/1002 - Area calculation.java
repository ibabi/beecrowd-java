import java.io.IOException;
import java.util.Scanner;
/**
 * 1002 - Area of a circle:
 *     The formula to calculate the area of a circumference is defined
 * as A = π . R2. Considering to this problem that π = 3.14159: Calculate the area using the
 * formula given in the problem description.
 */

public class Main {

    public static void main(String[] args) throws IOException {
        double R, A, n;
        Scanner sc = new Scanner(System.in);
        R = sc.nextDouble();
        n = 3.14159;
        A = n * (R * R);
        System.out.printf("A=%.4f\n", A);
    }
}
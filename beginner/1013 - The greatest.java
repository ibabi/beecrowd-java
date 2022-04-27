import java.io.IOException;
import java.util.Scanner;
import java.lang.Math.abs;

/**
 * 1013 - The greatest:
 *     Make a program that reads 3 integer values and present the greatest one followed by
 *     the message "eh o maior". Use the following formula: MaiorAB = (A + B + abs(A - B)) / 2
 */

public class Main {

    public static void main(String[] args) throws IOException {

        int A, B, C, maiorAB, maiorBC, maiorABC;

        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        maiorAB = (A + B + Math.abs(A - B)) / 2;
        maiorBC = (B + C + Math.abs(B - C)) / 2;
        maiorABC = (maiorAB + maiorBC + Math.abs(maiorAB - maiorBC)) / 2;

        System.out.println(maiorABC + " eh o maior");
    }

}
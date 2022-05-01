import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

/**
 * 1005 - Average 1:
 *      Read two floating points' values of double precision A and B, corresponding to two student's grades.
 *      After this, calculate the student's average, considering that grade A has weight 3.5 and B has
 *      weight 7.5. Each grade can be from zero to ten, always with one digit after the decimal point.
 *      Don’t forget to print the end of line after the result, otherwise you will receive
 *      “Presentation Error”. Don’t forget the space before and after the equal sign.
 */

public class Main {

    public static void main(String[] args) throws IOException {

        double A, B, MEDIA;

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        A = sc.nextDouble();
        B = sc.nextDouble();
        MEDIA = ((A * 3.5) + (B * 7.5)) / (3.5 + 7.5);

        System.out.printf("MEDIA = %.5f%n", MEDIA);
    }

}
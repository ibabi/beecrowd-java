import java.io.IOException;
import java.util.Scanner;

/**
 * 1009 - Salary with bonus:
 *      Make a program that reads a seller's name, his/her fixed salary and the sale's total
 * made by himself/herself in the month (in money). Considering that this seller receives 15%
 * over all products sold, write the final salary (total) of this seller at the end of the
 * month, with two decimal places.
 */

public class Main {

    public static void main(String[] args) throws IOException {

        String sellersName;
        double fixedSalary, salesTotal, finalSalary, bonus;

        Scanner sc = new Scanner(System.in);
        sellersName = sc.nextLine();
        fixedSalary = sc.nextDouble();
        salesTotal = sc.nextDouble();

        bonus = salesTotal * 0.15;
        finalSalary = fixedSalary + bonus;

        System.out.printf("TOTAL = R$ %.2f\n", finalSalary);
    }

}
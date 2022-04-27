import java.io.IOException;
import java.util.Scanner;

/**
 * 1018 - Banknotes:
 *      In this problem you have to read an integer value and calculate the smallest possible number of banknotes
 * in which the value may be decomposed. The possible banknotes are 100, 50, 20, 10, 5, 2 e 1. Print the read
 * value and the list of banknotes.
 *
 */

public class Main {

    public static void main(String[] args) throws IOException {

        int valorTotal, valorParcial;

        Scanner sc = new Scanner(System.in);
        valorTotal = sc.nextInt();
        valorParcial = valorTotal;

        int notas100 = valorParcial / 100;
        valorParcial -= notas100 * 100;

        int notas50 = valorParcial / 50;
        valorParcial -= notas50 * 50;

        int notas20 = valorParcial / 20;
        valorParcial -= notas20 * 20;

        int notas10 = valorParcial / 10;
        valorParcial -= notas10 * 10;

        int notas5 = valorParcial / 5;
        valorParcial -= notas5 * 5;

        int notas2 = valorParcial / 2;
        valorParcial -= notas2 * 2;

        int notas1 = valorParcial;

        System.out.println(valorTotal);
        System.out.println(notas100 + " nota(s) de R$ 100,00");
        System.out.println(notas50 + " nota(s) de R$ 50,00");
        System.out.println(notas20 + " nota(s) de R$ 20,00");
        System.out.println(notas10 + " nota(s) de R$ 10,00");
        System.out.println(notas5 + " nota(s) de R$ 5,00");
        System.out.println(notas2 + " nota(s) de R$ 2,00");
        System.out.println(notas1 + " nota(s) de R$ 1,00");
    }

}
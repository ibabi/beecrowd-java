import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) throws IOException {

        long A, B, SUM;

        Scanner sc = new Scanner(System.in);
        DecimalFormat formata = new DecimalFormat("0.000");

        while (sc.hasNext()){
            A = sc.nextLong();
            B = sc.nextLong();
            SUM = A ^ B; //xor
            System.out.println(SUM);
        }
    }
}
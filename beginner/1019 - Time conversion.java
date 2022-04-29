import java.io.IOException;
import java.util.Scanner;

/**
 * 1019 - Time conversion:
 *      Read an integer value, which is the duration in seconds of a certain event in a factory,
 * and inform it expressed in hours:minutes:seconds.
 */

public class Main {

    public static void main(String[] args) throws IOException {

        int seconds, hours, minutes;

        Scanner sc = new Scanner(System.in);
        seconds = sc.nextInt();

        hours = seconds / 3600;
        seconds -= hours * 3600;
        minutes = seconds / 60;
        seconds -= minutes * 60;

        System.out.printf("%d:%d:%d\n", hours, minutes, seconds);

    }

}
import java.util.Scanner;

public class HomeWork2_Task5 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter abcd:");
        int abcd = scanner.nextInt();

        int ab = abcd/100;

        int cd = abcd%100;

        System.out.println("Sum: " + (ab + cd));

        scanner.close();
    }

}

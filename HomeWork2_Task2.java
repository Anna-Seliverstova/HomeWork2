import java.util.Scanner;

public class HomeWork2_Task2 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter q:");
        int q = scanner.nextInt();

        System.out.println("Enter w:");
        int w = scanner.nextInt();

        int a = q/w;

        int b = q%w;

        System.out.println("Quotient: " + a);
        System.out.println("Remainder: " + b);

        scanner.close();
    }

}
import java.util.Scanner;

public class HomeWork2_Task1 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = scanner.nextInt();

        int a = n/10;

        int b =n%10;

        System.out.println("Sum: " + (a + b));

        scanner.close();
    }

}
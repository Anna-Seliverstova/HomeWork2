import java.util.Scanner;

public class HomeWork2_Task3 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = scanner.nextInt();

        int a = n/100;

        int b =n%100/10;

        int с =n%10;

        System.out.println("Sum: " + (a + b + с));

        scanner.close();
    }

}
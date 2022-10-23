import java.util.Scanner;

public class HomeWork2_Task4 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter n:");
        int n = scanner.nextInt();

        System.out.println("last digit: " + n%10);

        scanner.close();
    }

}

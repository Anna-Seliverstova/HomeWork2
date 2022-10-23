import java.util.Scanner;

public class HomeWork2_Task6 {

    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter five-digit number n:");
        int n = scanner.nextInt();

        System.out.println("third digit: " + n%1000/100);

        scanner.close();
    }

}

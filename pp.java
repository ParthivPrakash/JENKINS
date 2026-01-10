import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = scanner.nextInt();

        if (a <= 1) {
            System.out.println("Not a prime number");
        } else {
            boolean isPrime = true;
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Number is prime");
            } else {
                System.out.println("Number is not a prime");
            }
        }

        if (a % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

        scanner.close();
    }
}
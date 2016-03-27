import java.util.Scanner;

public class CalculateN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        long factorial = calculateFactorial(n);

        System.out.println(factorial);
    }

    private static long calculateFactorial(int n) {
        if (n == 0) {
            return 1;
        }

        long facto = n * calculateFactorial(n - 1);

        return facto;
    }

}


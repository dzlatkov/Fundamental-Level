import java.util.Scanner;

public class CalculateExpression {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();

        double areaOneBase = (Math.pow(a, 2) + Math.pow(b, 2)) / (Math.pow(a, 2) - Math.pow(b, 2));
        double areaOnePow = (a + b + c) / Math.sqrt(c);
        double areaOne = Math.pow(areaOneBase, areaOnePow);

        double areaTwoBase = Math.pow(a, 2) + Math.pow(b, 2) - Math.pow(c, 3);
        double areaTwoPow = (a - b);
        double areaTwo = Math.pow(areaTwoBase, areaTwoPow);

        double averageNums = (a + b + c) / 3;
        double averageExpressions = (areaOne + areaTwo) / 2;
        double diff = Math.abs(averageNums - averageExpressions);

        System.out.printf("F1 result: %.2f; F2 result: %.2f; F3 diff: %.2f", areaOne, areaTwo, diff);
    }
}

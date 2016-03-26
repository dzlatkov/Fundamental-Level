import java.util.Scanner;

public class Problem08_GetAverage {
    public static double sum = 0;
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        double average = 0;
        for (int i = 0; i < 3; i++) {
            double number = Double.parseDouble(input.nextLine());
            average = Average(number);
        }
        System.out.printf("%.2f",average);


    }
    public static double Average(double number){

        sum += number;
        double result = sum /3;
        return result;
    }
}

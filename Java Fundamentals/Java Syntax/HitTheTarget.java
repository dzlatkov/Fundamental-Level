import java.util.Scanner;

public class HitTheTarget {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int targetNumber = Integer.parseInt(input.nextLine());
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == targetNumber){
                    System.out.printf("%d + %d = %d\n", numbers[i], numbers[j], targetNumber);
                }
                else if(numbers[i] - numbers[j] == targetNumber){
                    System.out.printf("%d - %d = %d\n", numbers[i], numbers[j], targetNumber);
                }
            }
        }
    }
}

import java.util.Scanner;

public class OddAndEvenPairs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] numbers = input.nextLine().split(" ");
        int numLength = numbers.length;
        if (numLength % 2 != 0){
            System.out.println("Invalid length");
        }
        else{
            for (int i = 0; i < numbers.length -1; i+=2) {
                if((Integer.parseInt(numbers[i]) % 2) == 0 && (Integer.parseInt(numbers[i + 1]) % 2) == 0){
                    System.out.printf("%s, %s -> both are even\n",numbers[i],numbers[i+1]);
                }
                else if((Integer.parseInt(numbers[i]) % 2) != 0 && (Integer.parseInt(numbers[i + 1]) % 2) != 0){
                    System.out.printf("%s, %s -> both are odd\n",numbers[i],numbers[i+1]);
                }
                else{
                    System.out.printf("%s, %s -> different\n",numbers[i],numbers[i+1]);
                }
            }
        }
    }
}

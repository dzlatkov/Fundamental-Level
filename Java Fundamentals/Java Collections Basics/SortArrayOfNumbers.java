import java.util.Arrays;
import java.util.Scanner;

public class SortArrayOfNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = Integer.parseInt(scan.nextLine());
        int[] array = new int[num];

        for (int i = 0; i < num; i++) {
            array[i] = scan.nextInt();
        }

        Arrays.sort(array);

        for (int number : array) {
            System.out.print(number + " ");
        }
    }
}

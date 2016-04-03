import java.util.Arrays;
import java.util.Scanner;

public class SortArrayWithStreamAPI {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        String[] numbers = console.nextLine().split(" ");
        String sortingOrder = console.nextLine();

        if (sortingOrder.equals("Ascending")) {
            Arrays.stream(numbers).map(d -> Integer.parseInt(d))
                    .sorted()
                    .forEach(d -> System.out.printf("%d ", d));
        } else {
            Arrays.stream(numbers)
                    .map(d -> Integer.parseInt(d))
                    .sorted((d1, d2) -> d2.compareTo(d1))
                    .forEach(d -> System.out.printf("%d ", d));
        }
    }
}


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilterArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] line = scan.nextLine().split(" ");

        List<String> parts = new ArrayList<>();

        for (int i = 0; i < line.length; i++) {
            parts.add(line[i]);
        }

        parts.stream().filter(n -> n.length() > 3).forEach(p -> System.out.print(p + " "));
    }
}

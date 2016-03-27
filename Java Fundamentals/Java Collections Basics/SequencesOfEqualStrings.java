import java.util.Scanner;

public class SequencesOfEqualStrings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String line = scan.nextLine();
        String[] parts = line.split(" ");
        System.out.print(parts[0]);

        for (int i = 1; i < parts.length; i++) {
            if (parts[i].equals(parts[i - 1])){
                System.out.print(" " + parts[i]);
            } else {
                System.out.println();
                System.out.print(parts[i]);
            }
        }
    }
}

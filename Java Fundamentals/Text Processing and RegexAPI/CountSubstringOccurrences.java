import java.util.Scanner;

public class CountSubstringOccurrences {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine().toLowerCase();
        String wantedWord = scan.nextLine();
        int count = 0;

        int index = 0;
        while ((index = text.indexOf(wantedWord, index)) != -1) {
            index++;
            count++;
        }
        System.out.println(count);
    }
}


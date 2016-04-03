import java.util.Scanner;

public class CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] text = scan.nextLine().split("[\\W\\d]+");
        String wantedWord = scan.nextLine();
        int count = 0;

        for (int i = 0; i < text.length; i++) {
            if (wantedWord.equalsIgnoreCase(text[i])){
                count++;
            }
        }
        System.out.println(count);
    }
}


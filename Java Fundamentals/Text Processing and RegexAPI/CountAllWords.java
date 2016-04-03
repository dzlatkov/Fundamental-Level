import java.util.Scanner;

public class CountAllWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] text = scan.nextLine().split("\\w+");
        System.out.println(text.length - 1);
    }
}

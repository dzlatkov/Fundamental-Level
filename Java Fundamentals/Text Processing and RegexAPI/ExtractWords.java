import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractWords {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
        //Scanner scan = new Scanner(System.in);
        //String[] text = scan.nextLine().split("[ :,.')-_(!@#&$]+");   // I've tried and this way, but it takes
        // for (int i = 0; i < text.length; i++) {                      // all upper letters... I don't know why o_O
        //     System.out.print(text[i] + " ");
        // }
    }
}

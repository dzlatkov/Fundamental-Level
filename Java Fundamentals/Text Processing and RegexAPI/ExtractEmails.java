import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExtractEmails {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = scan.nextLine();

        Pattern p = Pattern.compile("\\b[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,4}\\b",
                Pattern.CASE_INSENSITIVE); // \b- for word boundary, [A-Z0-9._%+-] this catches the email name
        Matcher matcher = p.matcher(text); // +@[A-Z0-9.-] - catches that after "@", \.[A-Z]{2,4}\b - catches 2-4 characters after the dot
        while(matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

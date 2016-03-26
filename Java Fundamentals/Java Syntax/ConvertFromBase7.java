import java.util.Scanner;

public class ConvertFromBase7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String num = scan.next();

        Integer decimalRepresentation = Integer.valueOf(num, 7);
        System.out.println(decimalRepresentation);
    }
}

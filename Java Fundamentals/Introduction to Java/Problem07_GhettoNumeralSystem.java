import java.util.Scanner;

public class Problem07_GhettoNumeralSystem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text = "";
        int number = scan.nextInt();

        String num = String.valueOf(number);
        for(int i = 0; i < num.length(); i++) {
        int j = Character.digit(num.charAt(i), 10);
            switch (j){
                case 0: text = "Gee"; break;
                case 1: text = "Bro"; break;
                case 2: text = "Zuz"; break;
                case 3: text = "Ma"; break;
                case 4: text = "Duh"; break;
                case 5: text = "Yo"; break;
                case 6: text = "Dis"; break;
                case 7: text = "Hood"; break;
                case 8: text = "Jam"; break;
                case 9: text = "Mack"; break;
            }
        System.out.print(text);
        }
    }
}

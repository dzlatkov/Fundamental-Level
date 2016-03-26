import java.util.Scanner;

public class Problem05_PrintACharacterTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int num = Integer.parseInt(scan.nextLine());

        for (int i = 0; i <= num; i++) {
            for (char j = 'a'; j < 'a' + i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }

        for (int i = num - 1; i >= 0; i--) {
            for (char j = 'a'; j < 'a' + i; j++) {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
    }
}

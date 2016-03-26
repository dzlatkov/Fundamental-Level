import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int AX = scan.nextInt();
        int AY = scan.nextInt();
        int BX = scan.nextInt();
        int BY = scan.nextInt();
        int CX = scan.nextInt();
        int CY = scan.nextInt();

        int area;

        area = Math.abs((AX * (BY - CY) + BX * (CY - AY) + CX * (AY - BY))/2);

        if (area == 0){
            System.out.println("Not a triangle");
        }
        System.out.println(area);

    }
}

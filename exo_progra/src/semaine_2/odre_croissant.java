package semaine_2;

import java.util.Scanner;

public class odre_croissant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez 3 entiers.");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a > b) {
            if (b > c) {
                System.out.println(c + " " + b + " " + a);
            } else {
                System.out.println(b + " " + c + " " + a);
            }
        }
        if (b > a) {
            if (a > c) {
                System.out.println(c + " " + a + " " + b);
            } else {
                System.out.println(a + " " + c + " " + b);
            }
        }
        if (c > a) {
            if (a > b) {
                System.out.println(b + " " + a + " " + c);
            } else {
                System.out.println(a + " " + b + " " + c);
            }
        }
    }
}

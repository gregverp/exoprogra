package semaine_1;

import java.util.Scanner;

public class inversion_valeurs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez 3 entiers.");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int tmp = a;
        a = c;
        c = tmp;
        System.out.println(a + " " + b + " " + c);
    }
}

package semaine_1;

import java.util.Scanner;

public class inversion4Valeurs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez 4 entiers.");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int tmp = d;
        d = a;
        a = tmp;
        tmp = c;
        c = b;
        b = tmp;
        System.out.println(a+" "+b+" "+c+" "+d);
    }
}

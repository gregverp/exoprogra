package semaine_1;

import java.util.Scanner;

public class permCyclInv {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez 4 entiers.");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        int tmp = a;
        a = b;
        b = c;
        c = d;
        d = tmp;
        System.out.println(a+" "+b+" "+c+" "+d);

    }
}

package semaine_2;

import java.util.Scanner;

public class odre_croissant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez 3 nombres.");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        if (a > b)
            if (b > c)
                System.out.println(c + " " + b + " " + a);
            else
                System.out.println(b + " " + c + " " + a);
        if (b > a)
            if (a > c)
                System.out.println(c + " " + a + " " + b);
            else
                System.out.println(a + " " + c + " " + b);
        if (c > a)
            if (a > b)
                System.out.println(b + " " + a + " " + c);
            else
                System.out.println(a + " " + b + " " + c);
    }
}

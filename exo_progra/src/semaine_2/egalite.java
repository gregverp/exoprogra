package semaine_2;

import java.util.Scanner;

public class egalite {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez 3 nombres.");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        if (a == b || a == c)
            System.out.println(a);
        if (b == c)
            System.out.println(b);
    }

}

package semaine_2;

import java.util.Scanner;

public class maximum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez 3 nombres.");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        double max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        System.out.println("Le nombre maximum est " + max + ".");
    }
}

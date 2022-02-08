package semaine_2;

import java.util.Scanner;

public class maximum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez 3 nombres.");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        if (a > b && a > c)
            System.out.println(a + " est le plus grand.");
        if (b > a && b > c)
            System.out.println(b + " est le plus grand.");
        else
            System.out.println(c + " est le plus grand.");
    }
}

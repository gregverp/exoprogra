package semaine_2;

import java.util.Scanner;

public class deux_plus_grands {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez 3 nombres.");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        if (a > b) {
            if (b > c)
                System.out.println(a + " et " + b);
            else
                System.out.println(a + " et " + c);
        } else
            System.out.println(b + " et " + c);
    }
}

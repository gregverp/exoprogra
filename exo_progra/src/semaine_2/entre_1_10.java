package semaine_2;

import java.util.Scanner;

public class entre_1_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez un entier.");
        double a = scan.nextDouble();
        if (a >= 1 && a <= 10)
            System.out.println("Votre nombre est dans la bonne range.");
        else
            System.out.println("Votre nombre n'est pas dans la bonne range.");
    }
}

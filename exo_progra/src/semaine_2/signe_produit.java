package semaine_2;

import java.util.Scanner;

public class signe_produit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez les deux opérandes.");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        if (a < 0 || b < 0)
            System.out.println("La réponse sera négative.");
        else
            System.out.println("La réponse sera positive.");
    }
}

package semaine_4;

import java.util.Scanner;

public class moyennePositive {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nombre de données à analyser.");
        int quantite = scanner.nextInt();
        double total = 0;
        for (int i = 0; i < quantite; i++) {
            System.out.println("Entrez le nombre suivant.");
            double nombreSuivant = scanner.nextDouble();
            if (nombreSuivant > 0) total += nombreSuivant;
        }
        System.out.println("La moyenne des nombres positifs vaut :" + total / quantite + ".");
    }
}

package semaine_3;

import java.util.Scanner;

public class moyenneNNombresV2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), i = 0;
        double total = 0;
        System.out.println("Entrez d'abord la quantité de nombres.");
        while (n < 0) {
            System.out.println("Veuillez entrer un nombre strictement positif.");
            n = scan.nextInt();
        }
        while (i < n) {
            System.out.println("Entrez un nombre à ajouter dans la moyenne.");
            total += scan.nextDouble();
            i++;
        }
        System.out.println("la moyenne de vos nombres vaut " + total / n + ".");
    }
}

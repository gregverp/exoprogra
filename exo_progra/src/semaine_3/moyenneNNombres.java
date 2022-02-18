package semaine_3;

import java.util.Scanner;

public class moyenneNNombres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez d'abord la quantité de nombres.");
        int n = scan.nextInt();
        int i = 0;
        double total = 0;
        while (i < n) {
            System.out.println("Entrez un nombre à ajouter dans la moyenne.");
            total += scan.nextDouble();
            i++;
        }
        System.out.println("la moyenne de vos nombres vaut " + total / n + ".");
    }
}

package semaine_5;

import java.util.Scanner;

public class moyenneNNombresV3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0, i = 0;
        do {
            System.out.println("Entrez la quantité de nombres.");
            if(n < 0) System.out.println("Celle ci doit être positive!");
            n = scan.nextInt();
        } while (n < 0);
        double total = 0;
        do {
            System.out.println("Entrez un nombre à ajouter dans la moyenne.");
            total += scan.nextDouble();
            i++;
        } while (i < n);
        System.out.println("la moyenne de vos nombres vaut " + total / n + ".");
    }

}

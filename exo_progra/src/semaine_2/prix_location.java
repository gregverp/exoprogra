package semaine_2;

import java.util.Scanner;

public class prix_location {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int forfaitJournalier = 250;
        double prixKm = 1.25;
        System.out.println("Entrez d'abord le nombre de jours de locations, puis la quantité de km.");
        double jours = scanner.nextDouble();
        double km = scanner.nextDouble();
        double prixFinal = forfaitJournalier;
        if(jours < 1) System.out.println("Entrez un nombre valide de jours.");
        if(km < 50){
            prixFinal = forfaitJournalier*jours;
        } else if(km < 450){
            prixFinal = (forfaitJournalier*jours)+(km*prixKm);
        } else {
            prixFinal = (forfaitJournalier*jours)+(km*prixKm)+(((km-450)*prixKm)*1.1);
        }
        System.out.println("Votre location coûtera: " + prixFinal + "€.");
    }
}

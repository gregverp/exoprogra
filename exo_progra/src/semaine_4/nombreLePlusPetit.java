package semaine_4;

import java.util.Scanner;

public class nombreLePlusPetit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer le nombre total de cotes à analyser.");
        int a = scanner.nextInt();
        double plusPetit = 0;
        double nombre;
        for (int i = 0; i < a; i++) {
            if (i == 0) {
                System.out.println("Veuillez entrer une cote.");
                plusPetit = scanner.nextDouble();
                nombre = plusPetit;
            } else {
                System.out.println("Entrez la cote suivante.");
                nombre = scanner.nextDouble();
            }
            if (plusPetit > nombre) plusPetit = nombre;
        }
        System.out.println("le nombre le plus petit est " + plusPetit + ".");
    }
}
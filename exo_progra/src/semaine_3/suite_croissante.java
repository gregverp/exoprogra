package semaine_3;

import java.util.Scanner;

public class suite_croissante {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int nombre = 0;
        boolean estCroissante = true;
        int test = 0;
        while (i != -1) {
            System.out.println("Veuillez entrer un nombre.");
            nombre = i;
            i = scanner.nextInt();
            if (i != 1 && i < nombre && test != 0) {
                estCroissante = false;
                test = 1;
            }
        }
        if(estCroissante) System.out.println("la suite est croissante.");
        else System.out.println("La suite n'est pas toujours croissante.");
    }
}

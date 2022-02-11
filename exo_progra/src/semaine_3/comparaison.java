package semaine_3;

import java.util.Scanner;

public class comparaison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int cpt = 0;
        int premierNombre = 0;
        int dernierNombre = 0;
        while (i != -1) {
            System.out.println("Entrez un entier.");
            i = scanner.nextInt();
            if (cpt == 0) premierNombre = i;
            if (i != -1) dernierNombre = i;
            cpt++;
        }
        if (premierNombre == -1) {
            System.out.println("La suite est vide.");
        } else if (premierNombre < dernierNombre) {
            System.out.println("Le premier est inférieur au dernier.");
        } else if (premierNombre == dernierNombre) {
            System.out.println("Le premier est égal au dernier.");
        } else {
            System.out.println("le premier est supérieur au dernier.");
        }
    }
}


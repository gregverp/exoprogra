package semaine_3;

import java.util.Scanner;

public class comparaison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int premierNombre = 0;
        int dernierNombre = 0;
        while (i != -1) {
            System.out.println("Entrez un entier différent de 0 (-1 pour arrêter).");
            if(i == 0){
                i = scanner.nextInt();
                premierNombre = i;
            } else if(i == -1) {
                premierNombre = i;
            } else {
                i = scanner.nextInt();
                dernierNombre = i;
            }
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


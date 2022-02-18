package semaine_3;

import java.util.Scanner;

public class valeurN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nombre maximum.");
        int max = scanner.nextInt(), i = 1, dernierNombre = 0, somme = 0;
        while (somme < max) {
            somme += i;
            if (somme < max) {
                dernierNombre = i;
            }
            i++;
        }
        System.out.println("le nombre max vaut " + dernierNombre + ".");
    }
}

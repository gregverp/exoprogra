package semaine_3;

import java.util.Scanner;

public class valeur_de_n {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nombre maximum.");
        int max = scanner.nextInt();
        int i = 1;
        int dernierNombre = 0;
        int somme = 0;
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

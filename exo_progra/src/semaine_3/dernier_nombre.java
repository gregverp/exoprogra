package semaine_3;

import java.util.Scanner;

public class dernier_nombre {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dernierNombre = 0;
        int i = 0;
        while (i != -1) {
            System.out.println("Entrez un entier positif.");
            i = scanner.nextInt();
            if (i == -1) {
                System.out.println("veuillez entrer un nombre.");
            }
            if (i != -1) {
                dernierNombre = i;
            }
        }
        if(i == -1) System.out.println("Casse pas la tête zebi");
        else System.out.println("Le dernier nombre est " + dernierNombre + ".");
    }
}

package semaine_5;

import java.util.Scanner;

public class dernierNombreV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = 0, plusPetit = 0;
        do {
            System.out.println("Entrez un nombre.");
            a = scanner.nextInt();
            if(a != -1 && plusPetit > a) plusPetit = a;
        } while(a != -1);
        System.out.println("le nombre le plus petit est "+plusPetit+".");
    }
}

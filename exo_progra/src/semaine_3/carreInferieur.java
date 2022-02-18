package semaine_3;

import java.util.Scanner;

public class carreInferieur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un entier.");
        int nbFinal = scanner.nextInt();
        int cpt = 1;
        while (cpt * cpt < nbFinal) {
            System.out.println(cpt);
            cpt++;
        }
    }
}

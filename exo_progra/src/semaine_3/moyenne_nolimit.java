package semaine_3;

import java.util.Scanner;

public class moyenne_nolimit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int total = 0;
        int cpt = 0;
        while (i != -1) {
            System.out.println("Entrez un entier positif.");
                total += i;
                cpt++;
                i = scanner.nextInt();
        }
        System.out.println("La moyenne vaut " + total / cpt + ".");
    }
}

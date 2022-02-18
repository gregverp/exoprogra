package semaine_5;

import java.util.Scanner;

public class moyenneNolimitV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cpt = -1, n;
        double total = 0;
        do {
            System.out.println("Veuillez entrer le nombre suivant.");
            n = scanner.nextInt();
            total += n;
            cpt++;
        } while (n != -1);
        System.out.println("La moyenne vaut " + total / cpt + ".");
    }
}

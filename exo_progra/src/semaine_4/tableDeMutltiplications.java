package semaine_4;

import java.util.Scanner;

public class tableDeMutltiplications {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez un nombre positif.");
        int a = scanner.nextInt();
        System.out.println("Voici la table de multiplication de "+a+".");
        for (int i = 1; i <= 10; i++) {
            System.out.println(a * i);
        }
    }
}

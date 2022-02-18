package semaine_3;

import java.util.Scanner;

public class dernierNombre {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer une suite de nombres positifs (terminer par -1):");
        int x = scan.nextInt();
        if (x == -1) {
            System.out.println("Pas de nombre, pas de dernier!");
        } else {
            int dernier = x;
            x = scan.nextInt();
            while (x != -1) {
                dernier = x;
                x = scan.nextInt();
            }
            System.out.println("Le dernier était: " + dernier);
        }
    }
}

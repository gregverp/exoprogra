package semaine_3;

import java.util.Scanner;

public class suiteCroissante {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrer minimum 2 nombres positifs (terminer par -1):");
        int a = scan.nextInt(), b = scan.nextInt();
        while (a < b) {
            a = b;
            b = scan.nextInt();
        }
        if (b == -1) {
            System.out.println("La suite est croissante");
        } else {
            System.out.println("La suite n'est pas croissante");
        }
    }
}

package semaine_1;

import java.util.Scanner;

public class moyenne_deux_valeurs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez deux entiers.");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int resultat = (a+b)/2;
        System.out.println("Votre resultat est " + resultat + ".");
    }
}

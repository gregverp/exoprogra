package semaine_2;

import java.util.Scanner;

public class between_1_10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez un entier.");
        int a = scan.nextInt();
        if(a > 0 && a < 11) {
            System.out.println("Votre nombre est dans la bonne range.");
            return;
        }
        System.out.println("Votre nombre n'est pas dans la bonne range.");
    }
}

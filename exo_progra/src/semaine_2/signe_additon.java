package semaine_2;

import java.util.Scanner;

public class signe_additon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez les deux opérandes.");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        if((b < 0 && -b > a) || (a < 0 && b < 0 && a < b))
            System.out.println("la somme sera négative.");
        else
            System.out.println("La somme sera positive.");
    }
}

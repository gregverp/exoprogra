package semaine_7;

import java.util.Scanner;

public class exercice2 {
    public static double moyenne(double a, double b) {
        return (a + b) / 2;
    }

    public static double max(double a, double b) {
        double max = a;
        if (b > a) max = b;
        return max;
    }

    public static boolean estNegatif(double a) {
        return a < 0;
    }

    public static boolean estPair(double a) throws RuntimeException {
        if (a < 0) throw new RuntimeException("Le nombre doit être positif.");
        return a % 2 == 0;
    }

    public static double multiplication(int a, int b) {
        int valeur = a;
        boolean estNegatif = false;
        if (b == 0) return 0;
        if (b < 0) {
            b = -b;
            estNegatif = true;
        }
        for (int i = 1; i < b; i++) {
            valeur += a;
        }
        if (estNegatif) valeur = -valeur;
        return valeur;
    }


    public static double exponentielle(double a, double b) {
        if (b < 0) throw new ArithmeticException("Pas de division par un négatif.");
        double returnable = a;
        if (b == 0) returnable = 0;
        for (int i = 1; i < b; i++) {
            returnable *= a;
        }
        return returnable;
    }

    public static double exponentielle2(int a, int b) {
        if (b < 0) throw new ArithmeticException("Pas de division par un négatif.");
        int returnable = 0;
        for (int i = 0; i < b; i++) {
            returnable += multiplication(a, b);
        }
        return returnable;
    }

    public static double factorielle(double a) {
        double resultat = a;
        for (int i = 0; i < a; i++) {
            resultat *= (a - i);
        }
        return resultat;
    }

    public static boolean estDivisible(double a, double b) {
        return (a % b) == 0;
    }

    public static boolean estEntier(double a) {
        if (a < 2) return false;
        for (int i = 2; i < a; i++) {
            if (a % i == 0) return false;
        }
        return true;
    }

    public static int qtePremiersInferieurs(double a) {
        int counter = 0;
        if (a == 1) return 0;
        for (int i = 1; i <= a; i++) {
            if (estEntier(i)) counter++;
        }
        return counter;
    }

    public static void xDessin(double a) {
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < a; j++) {
                System.out.print("x");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        System.out.println(multiplication(2, -5));
    }
}

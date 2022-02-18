package semaine_4;

import java.util.Scanner;

public class puissance2Entiers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez les deux nombres que vous voulez factoriser.");
        double a = scanner.nextInt();
        int b = scanner.nextInt();
        int bNegatif = 1;
        if (a == 0 && b == 0) throw new ArithmeticException("On ne peut factoriser 0 par lui-même.");
        if(b < 0) {
            bNegatif = b;
            b = -b;
        }
        double base = a;
        for (int i = 1; i < b; i++) {
            a *= base;
        }
        if (bNegatif < 0) a = 1 / a;
        System.out.println("le résultat de la factorielle vaut : " + a + ".");
    }
}

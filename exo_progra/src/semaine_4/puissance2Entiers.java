package semaine_4;

import java.util.Scanner;

public class puissance2Entiers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez les deux nombres que vous voulez factoriser.");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if (a == 0 && b == 0) throw new ArithmeticException("On ne peut factoriser 0 par lui-même.");
        for (int i = 0; i < b - 1; i++) {
            a *= a;
        }
        if (b < 0) a = 1 / a;
        System.out.println("le résultat de la factorielle vaut :" + a + ".");
    }
}

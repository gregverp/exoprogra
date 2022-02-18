package semaine_4;

import java.util.Scanner;

public class factorielle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez le nombre dont vous voulez calculer la factorielle.");
        int factorielle = scanner.nextInt();
        if (factorielle <= 0) throw new ArithmeticException("On ne peut factorialiser un nombre negatif, ni 0.");
        double calcul = 1;
        for (int i = factorielle; i > 0; i--) calcul *= i;
        System.out.println("la factorielle de " + factorielle + " vaut " + calcul + ".");
    }
}

package semaine_2;

import java.util.Scanner;

public class annee_bissextile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entrez une année.");
        int annee = scanner.nextInt();
        if (annee % 400 == 0 || (annee % 4 == 0 && annee % 100 != 0))
            System.out.println("L'année est bissextile.");
        else
            System.out.println("L'année n'est pas bissextile.");
    }
}

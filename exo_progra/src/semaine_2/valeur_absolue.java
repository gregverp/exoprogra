package semaine_2;

import java.util.Scanner;

public class valeur_absolue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("entrez un entier.");
        int a = scan.nextInt();
        if (a < 0) a = -a;
        System.out.println("sa valeur absolue vaut "+ a + ".");
    }
}

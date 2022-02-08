package semaine_2;

import java.util.Scanner;

public class valeur_a {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez un nombre.");
        double a = scan.nextDouble();
        if(a > 0) {
            if (a == 1)
                System.out.println("a vaut 1");
        } else{
            System.out.println("a est inférieur ou égal à 0.");
        }
    }
}

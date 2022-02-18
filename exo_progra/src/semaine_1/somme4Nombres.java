package semaine_1;

import java.util.Scanner;

public class somme4Nombres {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez 4 entiers.");
        int value = scan.nextInt();
        value += scan.nextInt();
        value+= scan.nextInt();
        value+= scan.nextInt();
        System.out.println("La somme des 4 entiers vaut: "+value);
    }
}

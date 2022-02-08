package semaine_2;

import java.util.Scanner;

public class ordre_relatif {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez deux nombres.");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        if(a > b)
            System.out.println("Le premier est plus grand que le deuxième.");
        else if(a == b)
            System.out.println("Les deux nombres sont égaux.");
        else
        System.out.println("Le premier est plus petit que le deuxième.");
    }
}

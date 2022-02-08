package semaine_2;

import java.util.Scanner;

public class soustraction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez deux nombres.");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double result;
        if(a < b)
            result = b - a;
        else
            result = a - b;
        System.out.println(result);
    }
}

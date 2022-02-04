package semaine_2;

import java.util.Scanner;

public class vocal_minus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez deux entiers.");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int result;
        if(a > b) {
            System.out.println("Le premier est plus grand que le deuxieme.");
            return;
        } else {
            if(a == b) {
                System.out.println("Les deux nombres sont egaux.");
                return;
            }
        }
        System.out.println("Le premier est plus petit que le deuxieme.");
    }
}

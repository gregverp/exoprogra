package semaine_2;

import java.util.Scanner;

public class minus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez deux entiers.");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int result;
        if(a <= b) {
            result = b - a;
            System.out.println(result);
            return;
        }
        result = a -b;
        System.out.println(result);
    }
}

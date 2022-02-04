package semaine_2;

import java.util.Scanner;

public class maximum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez 3 entiers.");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if(a > b && a > c){
            System.out.println(a+" est le plus grand.");
            return;
        }
        if(b > a && b > c){
            System.out.println(b+" est le plus grand.");
            return;
        }
        System.out.println(c+" est le plus grand.");
    }

}

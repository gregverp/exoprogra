package semaine_2;

import java.util.Scanner;

public class odre_croissant {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez 3 nombres.");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        if (a > b){
            double tmp = a;
            a =b;
            b =tmp;
        }
        if(b > c){
            double tmp = b;
            b = c;
            c = tmp;
        }
        if(a>b){
            double tmp = a;
            a =b;
            b=tmp;
        }
        System.out.println(a + " " + b + " " + "c");
    }
}

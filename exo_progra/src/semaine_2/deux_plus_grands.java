package semaine_2;

import java.util.Scanner;

public class deux_plus_grands {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Entrez 3 entiers.");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a == b && b == c) {
            System.out.println("Les 3 nombres sont égaux.");
        } else if (a == b || a == c || b == c) {
            System.out.println("Il n'y a que deux valeurs différentes.");
        } else if (a < b && a < c) {
                System.out.println(b + " " + c);
            } else  if (){
                System.out.println(b + " " + a);
            }
        } else if (b < a && b < c) {
            System.out.println(a + " " + c);
        }
    }
}

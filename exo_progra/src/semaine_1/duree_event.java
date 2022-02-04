package semaine_1;

import java.util.Scanner;

public class duree_event {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Quelle heure etait-il au lancement de l'evenement? Entre d'abord l'heure puis les minutes.");
        int h = scan.nextInt();
        int m = scan.nextInt();
        System.out.println("Quelle heure etait-il à la fin de l'evenement? Entre d'abord l'heure puis les minuteS.");
        int h2 = scan.nextInt();
        int m2 = scan.nextInt();
        int temps1 = h*60+m;
        int temps2 = h2*60+m2;
        int tempsTotal = temps2-temps1;
        int mTotal = tempsTotal%60;
        int hTotal = tempsTotal/60;
        System.out.println("L'evenement a dure "+hTotal+"h"+mTotal);
    }
}

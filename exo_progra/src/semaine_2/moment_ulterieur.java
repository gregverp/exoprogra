package semaine_2;

import java.util.Scanner;

public class moment_ulterieur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrez les heures puis les minutes.");
        int heure = scanner.nextInt();
        int minutes = scanner.nextInt();
        if (minutes == 59) {
            heure += 1;
            minutes = 0;
        } else {
            minutes += 1;
        }
        System.out.println("Le moment suivant est " + heure + ":" + minutes);
    }
}

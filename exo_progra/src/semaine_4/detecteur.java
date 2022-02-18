package semaine_4;

import java.util.Scanner;

public class detecteur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer le nombre de chiffres que vous voulez analyser.");
        int a = scanner.nextInt(),compteurNegatif = 0,compteurPositif = 0,compteurNul = 0;
        for (int i = 0; i < a; i++) {
            int b = scanner.nextInt();
            if (b < 0) compteurNegatif++;
            else if (b > 0) compteurPositif++;
            else compteurNul++;
            System.out.println("positifs : "+compteurPositif);
            System.out.println("negatifs : "+compteurNegatif);
            System.out.println("nul : "+compteurNul);
        }
    }
}

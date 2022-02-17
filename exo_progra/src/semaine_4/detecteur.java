package semaine_4;

import java.util.Scanner;

public class detecteur {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer le nombre de chiffres que vous voulez analyser.");
        int a = scanner.nextInt();
        int compteurNegatif = 0;
        int compteurPositif = 0;
        int compteurNul = 0;
        for (int i = 0; i < a; i++) {
            int b = scanner.nextInt();
            if (b < 0) compteurNegatif++;
            if (b > 0) compteurPositif++;
            if(b == 0) compteurNul++;
            System.out.println("positifs : "+compteurPositif);
            System.out.println("negatifs : "+compteurNegatif);
            System.out.println("nul : "+compteurNul);
        }
    }
}

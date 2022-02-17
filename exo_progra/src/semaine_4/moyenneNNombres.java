package semaine_4;

import java.util.Scanner;

public class moyenneNNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Veuillez entrer le nombre total de cotes à ananlyser.");
        int a = scanner.nextInt();
        double total = 0;
        for (int i = 0; i < a; i++) {
            if (i == 0) {
                System.out.println("Veuillez entrer une cote.");
            } else {
                System.out.println("Entrez la cote suivante.");
            }
            total += scanner.nextDouble();
        }
        System.out.println("La moyenne est de " + total / a + ".");
    }
}

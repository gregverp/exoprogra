package semaine_6;

import java.util.Scanner;

public class maxEtMin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sentinelle = 0, max = 0, min = 0;
        System.out.println("Entrez un nombre.");
        sentinelle = scanner.nextInt();
        while(sentinelle == 0){
            System.out.println("Entrez une valeur différente de 0.");
            sentinelle = scanner.nextInt();
        }
        max = sentinelle;
        min = sentinelle;
        while(sentinelle != 0){
            System.out.println("Entrez un nombre.");
            sentinelle = scanner.nextInt();
            if(sentinelle != 0){
                if(sentinelle > max) max = sentinelle;
                if(sentinelle < min) min = sentinelle;
            }
        };
        System.out.println("Le max vaut "+max+" et le minimum vaut "+min+".");
    }
}

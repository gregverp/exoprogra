package semaine_13;

import java.util.Scanner;

public class Date {
    public int jour, mois, annee;

    public Date(){
    }

    public Date(int jour, int mois, int annee){
        this.jour = jour;
        this.mois = mois;
        this.annee = annee;
    }

    public void saisie(){
        Scanner s = new Scanner(System.in);
        System.out.println("Entrez le jour.");
        this.jour = s.nextInt();
        System.out.println("Entrez le mois.");
        this.mois = s.nextInt();
        System.out.println("Entrez l'année.");
        this.annee = s.nextInt();
    }

    public void affiche(){
        System.out.println(this.toString());
    }

    public int versEntier() {
        return this.jour + this.mois * 100 + this.annee * 10000;
    }

    public int compareTo(Date other){
        return this.versEntier() - other.versEntier();
    }

    public String toString(){
        return this.jour + "/" + this.mois + "/" + this.annee;
    }

}

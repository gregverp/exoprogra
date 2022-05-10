package semaine_13;

import java.time.LocalDate;
import java.util.Scanner;

public class Personne {
    public String nom, prenom;
    public Date ddn;

    public Personne(){
    }

    public Personne(String nom, String prenom, int jour, int mois, int annee){
        this.nom = nom;
        this.prenom = prenom;
        this.ddn = new Date(jour, mois, annee);
    }

    public void saisie(){
        Scanner s = new Scanner(System.in);
        System.out.println("Donnez d'abord le nom, puis le prénom.");
        this.nom = s.next();
        this.prenom = s.next();
        System.out.println("Entrez ensuite la date.");
        this.ddn = new Date();
        this.ddn.saisie();
    }

    public void affiche(){
        System.out.println(this.toString());
    }

    public int compareToAge(Personne other){
        return this.ddn.compareTo(other.ddn);
    }

    public String versString() {
        return this.nom + "" + this.prenom;
    }

    public int compareToNomPrenom(Personne other){
        return this.versString().compareTo(other.versString());
    }

    public int getAge(){
        LocalDate now = LocalDate.now();
        int jour = now.getDayOfMonth();
        int mois = now.getMonthValue();
        int annee = now.getYear();
        Date today = new Date(jour, mois, annee);
        if(today.mois > this.ddn.mois) {
            return today.annee - this.ddn.annee;
        } else if (today.mois < this.ddn.mois){
            return  today.annee - this.ddn.annee-1;
        } else if(today.jour > this.ddn.jour) {
            return today.annee - this.ddn.annee;
        } else if(today.jour < this.ddn.jour){
            return  today.annee - this.ddn.annee-1;
        } else {
            return today.annee - this.ddn.annee;
        }
    }

    public String toString() {
        return this.nom + " " + this.prenom + ", né.e le " + this.ddn;
    }
}

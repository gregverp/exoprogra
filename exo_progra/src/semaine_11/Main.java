package semaine_11;

import eu.epfc.prm2.Array;

import java.util.Scanner;

public class Main {
    public static Scanner scan = new Scanner(System.in);

    public static void saisie(Date d) {
        System.out.println("Entrez d'abord le jour.");
        d.jour = scan.nextInt();
        System.out.println("Entre ensuite le mois.");
        d.mois = scan.nextInt();
        System.out.println("Entrez ensuite l'année.");
        d.annee = scan.nextInt();
    }

    public static void saisie(Personne p) {
        System.out.println("Entrez d'abord le prénom.");
        p.prenom = scan.next();
        System.out.println("Entrez ensuite le nom de famille.");
        p.nom = scan.next();
        System.out.println("Choississez une date.");
        p.ddn = new Date();
        saisie(p.ddn);
    }

    public static void affiche(Date d) {
        System.out.println(d.jour + "/" + d.mois + "/" + d.annee);
    }

    public static void affiche(Personne p) {
        System.out.println(p.prenom + " " + p.nom + ", né le " + p.ddn.jour + "/" + p.ddn.mois + "/" + p.ddn.annee);
    }

    public static int versEntier(Date d) {
        return d.jour + d.mois * 100 + d.annee * 1000;
    }

    public static int compare(Date d1, Date d2) {
        return versEntier(d1) - versEntier(d2);
    }

    public static int compareAge(Personne p1, Personne p2) {
        return compare(p2.ddn, p1.ddn);
    }

    public static String versString(Personne p) {
        return p.nom + "" + p.prenom;
    }

    public static int compareNomPrenom(Personne p1, Personne p2) {
        return (versString(p1)).compareTo(versString(p2));
    }

    public static void personnes() {
        System.out.println("Combien de personnes voulez-vous entrer?");
        int n = scan.nextInt();
        Array<Personne> personnes = new Array<>();
        for (int i = 0; i < n; i++) {
            Personne p = new Personne();
            saisie(p);
            personnes.add(p);
        }
        for (int i = 0; i < personnes.size(); i++) {
            affiche(personnes.get(i));
        }
        Personne plusJeune = personnes.get(0);
        for (int i = 0; i < personnes.size(); i++) {
            if (compareAge(plusJeune, personnes.get(i)) > 0) plusJeune = personnes.get(i);
        }
        affiche(plusJeune);
    }

    public static void triAlphabetique(Array<Personne> personnes) {
        for (int i = personnes.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if ((compareNomPrenom(personnes.get(j), personnes.get(j + 1)) > 0)) {
                    Personne tmp = personnes.get(j);
                    personnes.set(j, personnes.get(j + 1));
                    personnes.set(j + 1, tmp);
                }
            }
        }
    }

    public static void triAge(Array<Personne> personnes) {
        for (int i = personnes.size() - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if ((compareAge(personnes.get(j), personnes.get(j + 1))) > 0) {
                    Personne tmp = personnes.get(j);
                    personnes.set(j, personnes.get(j + 1));
                    personnes.set(j + 1, tmp);
                }
            }
        }
    }

    public static void remplissageTrie(Array<Personne> personnes, Personne personne) {
        personnes.add(null);
            int j = personnes.size()-1;
            while (j > 0 && (compareNomPrenom(personne, personnes.get(j - 1))) < 0) {
                personnes.set(j, personnes.get(j - 1));
                --j;
            }
            personnes.set(j, personne);
    }

    public static void saisieTriee(Array<Personne> personnes){
        System.out.println("combien de gens voulez vous introduire?");
        // A completer..
    }

    public static void main(String[] args) {
    }
}

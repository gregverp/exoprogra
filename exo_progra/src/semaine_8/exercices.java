package semaine_8;

import seqint.SeqInt;
import seqint.SeqIntIterator;

public class exercices {

    public static boolean estVide(SeqInt s) {
        SeqIntIterator it = s.iterator();
        return !it.hasNext();
    }

    public static int taille(SeqInt s) {
        SeqIntIterator it = s.iterator();
        int counter = 0;
        while (it.hasNext()) {
            it.next();
            counter++;
        }
        return counter;
    }

    public static int somme(SeqInt s) {
        SeqIntIterator it = s.iterator();
        int somme = 0;
        while (it.hasNext()) somme += it.next();
        return somme;
    }

    public static int quantiteNombre(SeqInt s, int n) {
        SeqIntIterator it = s.iterator();
        int counter = 0;
        while (it.hasNext()) {
            if (it.next() == n) counter++;
        }
        return counter;
    }

    public static double moyenne(SeqInt s) {
        if(estVide(s)) return 0;
        return (double)somme(s) / (double)taille(s);
    }

    public static int maximum(SeqInt s) {
        SeqIntIterator it = s.iterator();
        int maximum = 0;
        while (it.hasNext()) {
            int valeurActuelle = it.next();
            if (valeurActuelle > maximum) maximum = valeurActuelle;
        }
        return maximum;
    }

    public static int position(SeqInt s, int n) {
        SeqIntIterator it = s.iterator();
        int position = -1, counter = 0;
        while (it.hasNext()) {
            counter++;
            if (n == it.next())
                position = counter;
        }
        return position;
    }

    public static int premierePosition(SeqInt s, int n) {
        SeqIntIterator it = s.iterator();
        int position = -1, counter = 0;
        while (it.hasNext()) {
            counter++;
            if (position == -1 && n == it.next()) position = counter;
        }
        return position;
    }

    public static boolean estCroissante(SeqInt s) {
        SeqIntIterator it = s.iterator();
        boolean returnable = true;
        int current = 0, previous  = 0;
        while (it.hasNext()) {
           current = it.next();
           if(previous > current) returnable = false;
           previous = current;
        }
        return returnable;
    }

    public static boolean possedeDoublon(SeqInt s){
        SeqIntIterator it = s.iterator();
        boolean returnable = false;
        int current = 0, previous = 0;
        while(it.hasNext()){
            current = it.next();
            if (previous == current) returnable = true;
            previous = current;
        }
        return returnable;
    }

    public static int positionMax(SeqInt s){
        SeqIntIterator it = s.iterator();
        int max = maximum(s), counter = 0, position = -1;
        while(it.hasNext()){
            counter++;
            if(it.next() == max){
                position = counter;
            }
        }
        return position;
    }

    public static int premierePositionMax(SeqInt s){
        SeqIntIterator it = s.iterator();
        int max = maximum(s), counter = 0, position = -1;
        while(it.hasNext()){
            counter++;
            if(position == -1 && it.next() == max){
                position = counter;
            }
        }
        return position;
    }

    public static void main(String[] args) {
        SeqInt s = new SeqInt(7, 45, -7);
        System.out.println(moyenne(s));
    }
}

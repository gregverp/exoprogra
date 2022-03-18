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
        if(estVide(s)) throw new IllegalArgumentException("Pas de moyenne sur une séquence vide.");
        SeqIntIterator it = s.iterator();
        int somme = 0, counter = 0;
        while(it.hasNext()){
            somme += it.next();
            counter++;
        }
        return somme/(double)counter;
    }

    public static int maximum(SeqInt s) {
        SeqIntIterator it = s.iterator();
        int maximum = Integer.MIN_VALUE;
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
        int current, previous  = 0;
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
        int current, previous = 0;
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

    public static int quantiteDeMax(SeqInt s){
        SeqIntIterator it = s.iterator();
        int max = maximum(s), counter = 0;
        while(it.hasNext()){
            if(it.next() == max) counter++;
        }

        return counter;
    }

    public static int plusGrandNegatif(SeqInt s){
        SeqIntIterator it = s.iterator();
        int smallest = Integer.MAX_VALUE, current;
        while(it.hasNext()){
            current = it.next();
            if(current < 0 && current < smallest) smallest = current;
        }

        return smallest;
    }

    public static SeqInt boundaries(SeqInt s){
        SeqIntIterator it = s.iterator();
        int smallest = Integer.MAX_VALUE, highest = Integer.MIN_VALUE;
        while(it.hasNext()){
            int current = it.next();
            if(current < smallest) smallest = current;
            if(current > highest) highest = current;
        }
        return new SeqInt(smallest, highest);
    }

    public static SeqInt twoHighest(SeqInt s){
        SeqIntIterator it = s.iterator();
        int second = Integer.MIN_VALUE, first = Integer.MIN_VALUE;
        if(taille(s) < 2) return null;
        while(it.hasNext()){
            int current = it.next();
            if(current > first) first = current;
            if(current != first && current > second) second = current;
        }
        return new SeqInt(first, second);
    }

    public static void main(String[] args) {
        SeqInt s = new SeqInt(7, 45, -7);
        System.out.println(somme(s));
        System.out.println(quantiteNombre(s, 14));
        System.out.println(position(s, 7));
        System.out.println(premierePosition(s, 7));
        System.out.println(estCroissante(s));
        System.out.println(possedeDoublon(s));
        System.out.println(positionMax(s));
        System.out.println(premierePositionMax(s));
        System.out.println(quantiteDeMax(s));
        System.out.println(plusGrandNegatif(s));
        System.out.println(boundaries(s));
        System.out.println(twoHighest(s));
        System.out.println(moyenne(s));
    }
}

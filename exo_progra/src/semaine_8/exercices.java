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
        if (estVide(s)) throw new IllegalArgumentException("Pas de moyenne sur une séquence vide.");
        SeqIntIterator it = s.iterator();
        int somme = 0, counter = 0;
        while (it.hasNext()) {
            somme += it.next();
            counter++;
        }
        return somme / (double) counter;
    }

    public static int maximum(SeqInt s) {
        SeqIntIterator it = s.iterator();
        if (estVide(s)) throw new IllegalArgumentException("Pas de max dans une séquence vide.");
        int maximum = it.next();
        while (it.hasNext()) {
            int current = it.next();
            if (current > maximum) maximum = current;
        }
        return maximum;
    }

    public static int position(SeqInt s, int n) {
        if (estVide(s)) throw new IllegalArgumentException("Séquence vide.");
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
        if (estVide(s)) throw new IllegalArgumentException("Séquence vide.");
        SeqIntIterator it = s.iterator();
        int position = -1, counter = 0;
        while (it.hasNext() && position == -1) {
            counter++;
            if (n == it.next()) position = counter;

        }
        return position;
    }

    public static boolean estCroissante(SeqInt s) {
        if (estVide(s)) throw new IllegalArgumentException("Séquence vide.");
        SeqIntIterator it = s.iterator();
        boolean returnable = true;
        if (it.hasNext()) {
            int previous = it.next();
            while (it.hasNext() && returnable == true) {
                int current = it.next();
                if (previous > current) returnable = false;
            }
        }
        return returnable;
    }

    public static boolean possedeDoublon(SeqInt s) {
        if (estVide(s)) throw new IllegalArgumentException("Séquence vide.");
        SeqIntIterator it = s.iterator();
        boolean returnable = false;
        if (it.hasNext()) {
            int current = it.next();
            while (it.hasNext() && !returnable) {
                int previous = it.next();
                if (previous == current) returnable = true;
            }
        }
        return returnable;
    }

    public static int positionMax(SeqInt s) {
        if (estVide(s)) throw new IllegalArgumentException("Séquence vide.");
        SeqIntIterator it = s.iterator();
        if(it.hasNext()) {
            int max = it.next(), counter = 1, position = 1;
            while (it.hasNext()) {
                int current = it.next();
                if (current >= max) {
                    max = current;
                    position = counter;
                }
                counter++;
            }
        }
        return position;
    }

    public static int premierePositionMax(SeqInt s) {
        if (estVide(s)) throw new IllegalArgumentException("Séquence vide.");
        SeqIntIterator it = s.iterator();
        if(it.hasNext()) {
            int max = it.next(), counter = 1, position = -1;
            while (it.hasNext()) {
                int current = it.next();
                if (current > max) {
                    max = current;
                    position = counter;
                }
                counter++;
            }
        }
        return position;
    }

    public static int quantiteDeMax(SeqInt s) {
        if (estVide(s)) throw new IllegalArgumentException("Séquence vide.");
        SeqIntIterator it = s.iterator();
        if(it.hasNext()) {
            int max = it.next(), counter = 1;
            while (it.hasNext()) {
                int current = it.next();
                if (current > max) {
                    max = current;
                    counter = 1;
                }
                if (current == max) counter++;
            }
        }
        return counter;
    }

    public static int plusGrandNegatif(SeqInt s) {
        if (estVide(s)) throw new IllegalArgumentException("Séquence vide.");
        SeqIntIterator it = s.iterator();
        int smallest = it.next(), current;
        while (it.hasNext()) {
            current = it.next();
            if (current < 0 && current < smallest) smallest = current;
        }

        return smallest;
    }

    public static SeqInt boundaries(SeqInt s) {
        if (estVide(s)) throw new IllegalArgumentException("Séquence vide.");
        SeqIntIterator it = s.iterator();
        int current = it.next();
        int smallest = current, highest = current;
        while (it.hasNext()) {
            current = it.next();
            if (current < smallest) smallest = current;
            if (current > highest) highest = current;
        }
        return new SeqInt(smallest, highest);
    }

    public static SeqInt twoHighest(SeqInt s) {
        if (taille(s) < 2) throw new IllegalArgumentException("Séquence avec moins de 2 nombres.");
        SeqIntIterator it = s.iterator();
        int current = it.next(), first = current, second = 0;
        if(taille(s) == 2){
            if(current == it.next()) throw new IllegalArgumentException("La séquence possède deux nombres identiques seulement.");
        }
        while (it.hasNext()) {
            current = it.next();
            if (current > first)  first = current;
            if (current != first && current > second) second = current;
        }
        return new SeqInt(first, second);
    }

    public static void main(String[] args) {
        SeqInt s = new SeqInt(7, 7);
        System.out.println(twoHighest(s));
    }
}

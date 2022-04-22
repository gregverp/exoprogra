package semaine_10;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class exo_strings {

    public static boolean estMinuscule(char c) {
        return (c >= (int) 'a' && c <= (int) 'z');
    }

    public static char passeMajuscule(char c) {
        if (!estMinuscule(c)) throw new IllegalArgumentException("Veuillez entrer une minuscule.");
        return (char) ((int) c + ((int) 'A') - (int) 'a');
    }

    public static boolean chaineMinuscule(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (!estMinuscule(s.charAt(i))) return false;
        }
        return true;
    }

    public static String passeChaineMajuscule(String s) {
        String returnable = "";
        for (int i = 0; i < s.length(); i++) {
            returnable += passeMajuscule(s.charAt(i));
        }
        return returnable;
    }

    public static int nbOccurences(String s, char c) {
        int compteur = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) compteur++;
        }
        return compteur;
    }

    public static String inversion(String s) {
        String returnable = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            returnable += s.charAt(i);
        }
        return returnable;
    }

    public static boolean palindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        }
        return true;
    }

    public static boolean sontEgaux(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }

        return true;
    }

    public static int compare(String s1, String s2) {
        int taille = s1.length();
        if (s2.length() < s1.length()) taille = s2.length();
        for (int i = 0; i < taille; i++) {
            if (s1.charAt(i) > s2.charAt(i)) return 1;
            if (s2.charAt(i) > s1.charAt(i)) return -1;
        }
        if (s1.length() > s2.length()) {
            return 1;
        } else if (s2.length() > s1.length()) {
            return -1;
        }
        return 0;
    }

    public static String intPositifToString(int i) {
        if (i < 0) throw new IllegalArgumentException("Veuillez entrer un entier positif.");
        String str = "";
        while (i != 0) {
            str += i % 10;
            i = i / 10;
        }
        return inversion(str);
    }

    public static int[] occurencesLettres(String s) {
        int[] occurences =[i];
        String[] occurencesEcrites = new String[];
        for (int i = 0; i < s.length(); i++) {
            occurences[s.charAt(i) - (int)'a']++;
        }
        for (int i = 0; i < occurences.length; i++) {
            if(occurencesEcrites.length
        }
        return occurences;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(intPositifToString(123));

    }
}

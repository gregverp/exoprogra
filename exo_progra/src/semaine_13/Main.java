package semaine_13;

import eu.epfc.prm2.Array;

import java.util.Scanner;

public class Main {
    private static Scanner s = new Scanner(System.in);

    public static void saisie(Array<Personne> tab){
        System.out.println("Combien de personnes voulez vous ajouter?");
        int q = s.nextInt();
        for (int i = 0; i < q; i++) {
            Personne p = new Personne();
            p.saisie();
            tab.add(p);
        }
    }

    public static void affiche(Array<Personne> tab){
        for (int i = 0; i < tab.size(); i++) {
          tab.get(i).affiche();
        }
    }

    public static Personne trouveLaPlusJeune(Array<Personne> tab){
        Personne min = tab.get(0);
        for (int i = 1; i < tab.size(); i++) {
            Personne current = tab.get(i);
            if(min.compareToAge(current) > 0){
                min = current;
            }
        }
        return min;
    }

    public static void exercice1(){
        Date d = new Date();
        d.saisie();
        Date d2 = new Date();
        d2.saisie();
        int comparaison = d.compareTo(d2);
        if(comparaison > 0){
            System.out.println("La première date est après la seconde.");
        } else if(comparaison < 0){
            System.out.println("La seconde date est après la première.");
        } else {
            System.out.println("Les dates sont égales.");
        }
    }
    public static void exercice2(){
        Array<Personne> tab = new Array<>();
        saisie(tab);
        affiche(tab);
    }

    public static void exercice3(){
        Array<Personne> tab = new Array<>();
        saisie(tab);

        System.out.println("La personne la plus jeune est : ");
        Personne p = trouveLaPlusJeune(tab);
        p.affiche();
    }
    public static void exercice4(){
        Array<Personne> tab = new Array<>();
        Date d1 = new Date(11, 7, 1998);
        Date d2 = new Date(15, 8, 2002);
        Personne p1 =  new Personne("Fontaine", "Claude", 11, 7 ,1998);
        Personne p2 = new Personne("Vedette", "Michel", 4, 5, 2002);
        tab.add(p1);
        tab.add(p2);
        affiche(tab);
        System.out.println(p1.getAge());
        System.out.println(p2.getAge());
    }

    public static void exercice5(){
        Personne p1 =  new Personne("Fontaine", "Claude", 11, 7 ,1998);
        System.out.println(p1.getAge());
    }
    public static void main(String[] args) {
        exercice5();
    }
}

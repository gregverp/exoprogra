package revisions;

import eu.epfc.prm2.Array;

public class Programme {

    public static boolean contientJoueur(Array<Joueur> tab, String nom, int score) {
        for (int i = 0; i < tab.size(); i++) {
            if (tab.get(i).idJoueur == nom) {
                if (tab.get(i).score < score) {
                    for (int j = i; j < tab.size() - 1; j++) {
                        tab.set(j, tab.get(j + 1));
                    }
                } else {
                    Joueur j1 = tab.get(i);
                    j1.score = score;
                    tab.set(i, j1);
                }
                return true;
            }
        }
        return false;
    }

    public static void insertion(Array<Joueur> tab, String nom, int score) {
        Joueur j1 = new Joueur(nom, score);
        for (int i = 0; i < tab.size(); i++) {
            tab.add(j1);
            for (int j = tab.size(); j > i; j++) {
                tab.set(j, tab.get(j - 1));
            }
            tab.set(i, j1);
        }
    }

    public static void affiche(Array<Joueur> tab) {
        for (int i = 0; i < tab.size(); i++) {
            System.out.println(tab.get(i).toString());
        }
    }

    public static void gestion(Array<Joueur> tab, String nom, int score) {
        if (!contientJoueur(tab, nom, score)) {
            insertion(tab, nom, score);
        }
    }

    public static void main(String[] args) {
        Array<Joueur> e = new Array<>();
        gestion(e, "Anne", 90);
        gestion(e, "Daniel", 20);
        gestion(e, "Emile", 60);
        gestion(e, "Jules", 18);
        gestion(e, "Julie", 30);
        gestion(e, "Raoul", 11);

        affiche(e);

        gestion(e, "Julie", 20);

        affiche(e);

        gestion(e, "Daniel", 40);

        affiche(e);

        gestion(e, "Carine", 25);

        affiche(e);
        System.out.println("======================================");
    }

}


package revisions;

public class Joueur {
    public String idJoueur;
    public int score;

    public Joueur(String idJoueur, int score){
        this.idJoueur = idJoueur;
        this.score = score;
    }

    public String toString(){
        return "Joueur : \nID : " + this.idJoueur + " , score : " + score;
    }
}

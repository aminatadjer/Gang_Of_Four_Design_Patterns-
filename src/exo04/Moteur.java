package exo04;

public class Moteur {
    public static void main(String args[]) {
        Ajeu jeu=null;
        Ajoueur joueur=null;
        Aadversaire aadversaire=null;
        int choix=2;
        if (choix==1){
            jeu=new Jeu1();
        }
        if (choix==2){
            jeu= new Jeu2();
        }
        aadversaire= jeu.creerAdversaire();
        joueur=jeu.creerJoueur();
        System.out.println("le joueur est: "+joueur.getNom());
        System.out.println("l'adversaire est: "+aadversaire.getNom());


    }
}

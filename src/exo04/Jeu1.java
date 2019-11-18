package exo04;

public class Jeu1 extends Ajeu {
    public Kitty creerJoueur(){
       Kitty kitty= new Kitty();
        return kitty;
    }
    public Puzzle creerAdversaire(){
        Puzzle puzzle= new Puzzle();
        return puzzle;
    }
}

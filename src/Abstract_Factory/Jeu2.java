package Abstract_Factory;

public class Jeu2 extends Ajeu {
    public KungFuGuy creerJoueur(){
        KungFuGuy kungFuGuy= new KungFuGuy();
        return kungFuGuy;
    }
    public Nasty creerAdversaire(){
        Nasty nasty= new Nasty();
        return nasty;
    }
}

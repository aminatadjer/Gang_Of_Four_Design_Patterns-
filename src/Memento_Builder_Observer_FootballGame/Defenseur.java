package Memento_Builder_Observer_FootballGame;

public class Defenseur extends Player {
    public Defenseur(String name, int number,Ball ballon) {
        super(name, number,ballon);
    }
    public void update() {
        System.out.println("le defenseur numero "+this.number+" a reçu une notification de changement de position du ballon");
    }
    public void whoIam(){
        System.out.println("Je suis "+this.name+" mon numero est "+this.number+ " et je suis un defenseur");
    }

}
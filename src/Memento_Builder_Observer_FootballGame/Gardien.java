package Memento_Builder_Observer_FootballGame;

public class Gardien extends Player {
    public Gardien(String name, int number,Ball ballon) {
        super(name, number,ballon);
    }
    public void whoIam(){
        System.out.println("Je suis "+this.name+" mon numero est "+this.number+ " et je suis un gardien");
    }
    public void update() {
        System.out.println("le gardien numero "+this.number+" a reçu une notification de changement de position du ballon");
    }
}

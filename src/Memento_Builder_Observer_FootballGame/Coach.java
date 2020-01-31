package Memento_Builder_Observer_FootballGame;

import java.io.Serializable;

public class Coach implements Observer,Serializable{
private String name;
    private Ball ballon;

    public Coach(String name,Ball ballon) {
        this.name = name;
        this.ballon = ballon;
        ballon.attach(this);
    }
    protected void ﬁnalize() throws Throwable {ballon.detach(this); }
    public void whoIam(){
        System.out.println("Je suis "+this.name+" et je suis le Coach");
    }
    @Override
    public void update() {
        System.out.println("Je suis le coach "+this.name+" Je suis mis à jour parraport à la position du ballon, Le ballon est à la position X= "+ballon.getX()+" Y= "+ballon.getY()+" Z= "+ballon.getZ());
    }
}

package Memento_Builder_Observer_FootballGame;

import java.io.Serializable;

public abstract class Player implements Observer,Serializable{
   protected  String name;
   protected int number;
    private Ball ball;

    public Player(String name, int number,Ball ball) {
        this.name = name;
        this.number = number;
        this.ball = ball;
        ball.attach(this);
    }
    protected void ﬁnalize() throws Throwable {ball.detach(this); }
    public abstract void whoIam();
    public void update() {
        System.out.println("je suis le player et j'ai reçu la notification");
    }
}

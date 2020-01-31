package Memento_Builder_Observer_FootballGame;

import java.io.Serializable;
import java.util.ArrayList;

public class Ball extends Subject implements Serializable {
    private int x;
    private int y;
    private int z;
    ArrayList<Observer> b;

    public Ball() {
        this.x = 378;
        this.y = 238;
        this.z = 23;
        this.b=new ArrayList<Observer>();
    }

    public void attach(Observer o) { this.b.add(o); }

    public void notifyObservers() {
        for (Observer o: this.b) { o.update();}

    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
        notifyObservers();

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
        notifyObservers();

    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
        notifyObservers();

    }
}


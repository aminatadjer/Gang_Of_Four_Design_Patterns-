package Singleton.example2;

public class Pomegranate implements Fruit {
    private static Pomegranate instance=null;
    private Pomegranate(){}
    public static Pomegranate getInstance(){
        if(instance==null) {
            instance= new Pomegranate();
        }
        return instance;
    }
}

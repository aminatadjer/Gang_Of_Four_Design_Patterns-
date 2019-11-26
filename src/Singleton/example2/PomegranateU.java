package Singleton.example2;

public class PomegranateU extends FruitU {
    public Fruit instantiateFruit() {
        return Pomegranate.getInstance();
    }
}

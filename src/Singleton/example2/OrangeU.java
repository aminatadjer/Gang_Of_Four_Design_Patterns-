package Singleton.example2;

public class OrangeU extends FruitU {

    public Fruit instantiateFruit() {
        return Orange.getInstance();
    }
}

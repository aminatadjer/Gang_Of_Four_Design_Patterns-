package Prototype;

public class CloneFactory {
    // receive any type of dish (any subclass)
    public Dish getClone(Dish dish){
        return  dish.makeCopy();
    }

}

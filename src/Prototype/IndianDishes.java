package Prototype;

public class IndianDishes implements Dish{
    String name;

    public IndianDishes(String name) {
        this.name = name;
        System.out.println("The indian dish called "+name+ "is made");
    }

    public String getName() {
        return name;
    }

    public Dish makeCopy() {
        Dish dishObject = null;
        try {
            dishObject = (IndianDishes) super.clone();
            System.out.println("The indian dish called "+name+ "is cloned");
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return dishObject;
    }
}

package Prototype;

public class Test {

    public static void main(String[] args) {
        CloneFactory dishMaker= new CloneFactory();
        String dishName = "Malai Kofta";
        IndianDishes dish = new IndianDishes(dishName);
        IndianDishes clonedDish= (IndianDishes) dishMaker.getClone(dish);
        System.out.println("Name of dish is "+dish.getName());
        System.out.println("Name of clonned dish is "+clonedDish.getName());
        System.out.println("The original dish Hashcode: "+System.identityHashCode(System.identityHashCode(dish)));
        System.out.println("The original dish Hashcode: "+System.identityHashCode(System.identityHashCode(clonedDish)));
    }
}

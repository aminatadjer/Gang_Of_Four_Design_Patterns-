package Singleton.example2;

public class Test {
    public static void main(String args[]) {
        PomegranateU pomegranateU1 = new PomegranateU();
        PomegranateU pomegranateU2 = new PomegranateU();
        Fruit instance1;
        Fruit instance2;
        instance1= pomegranateU1.instantiateFruit();
        System.out.println("Instance 1 with ID: "+System.identityHashCode(instance1));
        instance2=  pomegranateU2.instantiateFruit();
        System.out.println("Instance 2 with ID: "+System.identityHashCode(instance2));
        //We will have the same ID because it's the same instance;

    }
}

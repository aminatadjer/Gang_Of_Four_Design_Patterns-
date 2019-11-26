package Singleton.example2;

import com.sun.org.apache.xpath.internal.operations.Or;

public class Orange implements Fruit {
    private static Orange instance=null;
    private Orange(){}
    public static Orange getInstance(){
        if(instance==null) {
            instance= new Orange();
        }
        return instance;
    }
}

package Memento_Builder_Observer_FootballGame;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class CareTaker {

    private final Map<String, Memento> savepointStorage = new HashMap<String, Memento>();

    public void saveMemento(Memento memento, String savepointName) {
        System.out.println("Saving state..." + savepointName);
        savepointStorage.put(savepointName, memento);
    }

    public Memento getMemento(String savepointName) {
        System.out.println("Undo at ..." + savepointName);
        return savepointStorage.get(savepointName);
    }

    public void clearSavepoints() {
        System.out.println("Clearing all save points...");
        savepointStorage.clear();
    }

    public void writeFile(String lastSave) {
        Memento m = getMemento(lastSave);
        try {
            FileOutputStream f = new FileOutputStream(new File("myObjects.txt"));
          ObjectOutputStream o = new ObjectOutputStream(f);
           o.writeObject(m);
            o.close();
            f.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Error initializing stream");
        }
    }

    public Memento restore() throws Exception{
        Memento m = new Memento();

        try {
            FileInputStream fi = new FileInputStream(new File("myObjects.txt"));
            ObjectInputStream oi = new ObjectInputStream(fi);
            m = (Memento) oi.readObject();

            System.out.println(m);

        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {

            System.out.println("Error initializing stream");

        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return m;
    }
}



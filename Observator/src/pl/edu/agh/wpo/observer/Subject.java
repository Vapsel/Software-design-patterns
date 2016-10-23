package pl.edu.agh.wpo.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 */
public class Subject {
    List<Listener> listeners = new ArrayList<>(0);

    public void addListener(Listener listener){
        listeners.add(listener);
    }

    public void removeListener(Listener listener){
        listeners.remove(listener);
    }

    public void doSmth(){
        System.out.println("robie cos");
        for(Listener l : listeners){
            l.event();
        }
    }
}

package designpattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by deepak.kumar on 2/2/16.
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void attach(Observer observer)
    {
        this.observers.add(observer);
    }
    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}

package designpattern.observer;

/**
 * Created by deepak.kumar on 2/2/16.
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( subject.getState() + " ====== BIN " + Integer.toBinaryString(subject.getState()));
    }
}

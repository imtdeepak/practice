package designpattern.observer;

/**
 * Created by deepak.kumar on 2/2/16.
 */
public class HexaObserver extends Observer {

    public HexaObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( subject.getState() + " ====== HEX " + Integer.toHexString(subject.getState()));
    }
}

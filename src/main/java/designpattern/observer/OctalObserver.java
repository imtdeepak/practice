package designpattern.observer;

/**
 * Created by deepak.kumar on 2/2/16.
 */
public class OctalObserver extends Observer {

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println( subject.getState() + " ====== OCT " + Integer.toOctalString(subject.getState()));
    }
}

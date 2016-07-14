package designpattern.observer;

import java.util.stream.IntStream;

/**
 * Created by byjumanikkan on 2/2/16.
 */
public class Demo {

    public static void main(String[] args) {
        Subject subject = new Subject();
        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);
        IntStream.iterate(0 , i -> i+ 1).limit(20).forEach(i -> subject.setState(i));
    }
}

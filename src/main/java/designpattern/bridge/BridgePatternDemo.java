package designpattern.bridge;

/**
 * Created by deepak.kumar on 2/2/16.
 */
public class BridgePatternDemo {

    public static void main(String[] args) {
        Shape redCircle = new Circle(new RedCircleDraw(), 1, 2,3);
        Shape greenCircle = new Circle(new GreenCircleDraw(), 1, 2,3);
        redCircle.draw();
        greenCircle.draw();

    }
}

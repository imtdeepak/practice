package designpattern.bridge;

/**
 * Created by byjumanikkan on 2/2/16.
 */
public class RedCircleDraw implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}

package designpattern.bridge;

/**
 * Created by deepak.kumar on 2/2/16.
 */
public class GreenCircleDraw implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}

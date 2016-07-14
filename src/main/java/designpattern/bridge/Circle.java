package designpattern.bridge;

/**
 * Created by byjumanikkan on 2/2/16.
 */
public class Circle extends Shape {


    private final int radius;
    private final int x;
    private final int y;

    protected Circle(DrawAPI drawAPI, int radius, int x, int y) {
        super(drawAPI);
        this.radius = radius;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}

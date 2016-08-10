package designpattern.bridge;

/**
 * Created by deepak.kumar on 2/2/16.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }

    public abstract void draw();

}


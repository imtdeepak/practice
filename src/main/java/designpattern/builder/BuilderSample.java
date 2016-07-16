package designpattern.builder;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by 212550544 on 7/15/16.
 */
public class BuilderSample {

    public static void main(String[] args) {
        Pizza pizza=Pizza.newBuilder().cheeseType("Cheddar").sauce("RedSauce").toppings(Arrays.asList("Tomatto","Olives","etc..")).needExtraCheese(false).build();
        System.out.println("Pizza is ready.. with below details:"+pizza);

    }
}


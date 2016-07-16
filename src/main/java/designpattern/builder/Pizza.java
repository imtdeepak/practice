package designpattern.builder;

import java.util.List;

/**
 * Created by 212550544 on 7/15/16.
 */
public class Pizza {

    private String sauce;
    private List<String> toppings;
    private String cheeseType;
    private Boolean needExtraCheese;

    @Override
    public String toString() {
        return "Pizza{" +
                "sauce='" + sauce + '\'' +
                ", toppings=" + toppings +
                ", cheeseType='" + cheeseType + '\'' +
                ", needExtraCheese=" + needExtraCheese +
                '}';
    }

    private Pizza(String sauce, List<String> toppings, String cheeseType, Boolean needExtraCheese) {
        this.sauce = sauce;
        this.toppings = toppings;
        this.cheeseType = cheeseType;
        this.needExtraCheese = needExtraCheese;
    }

    private Pizza(Builder builder) {
        sauce = builder.sauce;
        toppings = builder.toppings;
        cheeseType = builder.cheeseType;
        needExtraCheese = builder.needExtraCheese;
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder {
        private String sauce;
        private List<String> toppings;
        private String cheeseType;
        private Boolean needExtraCheese;

        private Builder() {
        }

        public Builder sauce(String val) {
            sauce = val;
            return this;
        }

        public Builder toppings(List<String> val) {
            toppings = val;
            return this;
        }

        public Builder cheeseType(String val) {
            cheeseType = val;
            return this;
        }

        public Builder needExtraCheese(Boolean val) {
            needExtraCheese = val;
            return this;
        }

        public Pizza build() {
            return new Pizza(this);
        }
    }
}

package DesignPatthern.Factory.SimpleFactory.PizzaObject2.Pizza;

public class GreekPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给希腊披萨准备材料");
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {

        Box<Fruit> src = new Box<>();
        Box<Fruit> dest = new Box<>();
        Box<Box<Fruit>> dest2 = new Box<>();
        Box<Object> dest3 = new Box<>();

        Apple apple = new Apple();
        apple.setFresh(true);

        src.element = apple;
        src.element.fresh = (apple.getFresh());

        src.put(apple);

        BoxUtil.copyFromBoxToBox(src, dest);

        BoxUtil.copyFreshFruitFromBoxToBox(src, dest);

        dest2.element = dest;
        dest2.put(dest);

        dest3.put(dest2);

        BoxUtil.printElementFromTwoBoxes(dest2);

        BoxUtil.printElementFromBoxes(dest3);

    }
}

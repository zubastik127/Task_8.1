package com.company;

public class BoxUtil {

    public static <T> void copyFromBoxToBox(Box<T> src, Box<T> dest) {

        dest.element = src.get();
    }

    public static void copyFreshFruitFromBoxToBox(Box<Fruit> src, Box<Fruit> dest) {

        if (src.element.fresh) {
            dest.element = src.get();
        }
    }

    public static <T> void printElementFromTwoBoxes(Box<Box<T>> box) {

        Box<T> box2 = box.get();
        System.out.println(box2.get().toString());
    }

    public static void printElementFromBoxes(Box<?> box) {

        if (box.get() instanceof Fruit) {
            System.out.println(box.get().toString());
        } else {
            printElementFromBoxes((Box<?>) box.get());
        }
    }
}

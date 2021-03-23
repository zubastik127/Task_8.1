package com.company;

public class BoxUtil {

    public static void copyFromBoxToBox(Box<Apple> src, Box<Object> dest) {

        dest.element = src.get();
    }

    public static <T> void copyFreshFruitFromBoxToBox(Box<Apple> src, Box<T> dest) {

        if (src.element.fresh) {
            dest.element = (T) src.get();
        }
    }

    public static <T> void printElementFromTwoBoxes(Box<Box<T>> box) {

        Box<T> box2 = box.get();
        System.out.println(box2.get().toString());
    }

    public static void printElementFromBoxes(Box<?> box) {

        if (box.get() instanceof Box) {
            printElementFromBoxes((Box<?>) box.get());
        } else {
            System.out.println(box.get().toString());
        }
    }
}



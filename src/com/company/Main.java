package com.company;

public class Main {

    public static void main(String[] args) {

        Box<Apple> box3 = new Box<>();
        box3.put(new Apple());
        Box<Object> box2 = new Box<>();
        box2.put(box3);
        Box<Box<Object>> box1 = new Box<>();
        box1.put(box2);

        Box<String> box = new Box<>();
        box.put("String");
        BoxUtil.printElementFromBoxes(box);
        //console String
    }
}

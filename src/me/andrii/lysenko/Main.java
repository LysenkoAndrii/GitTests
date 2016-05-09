package me.andrii.lysenko;

public class Main {

    public static void main(String[] args) {
        Animal[] zoo = new Animal[] {new Duck(), new Monkey()};
        for (Animal a : zoo)
            printClass(a);
    }

    static void printClass(Animal obj) {
        Class<?> cls = obj.getClass();
        System.out.println(cls.getName());
    }

}


class Animal {}

class Duck extends Animal {}

class Monkey extends Animal {}
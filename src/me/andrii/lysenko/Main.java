package me.andrii.lysenko;

public class Main {

    public static void main(String[] args) {
        Animal[] zoo = new Animal[] {new Duck(), new Monkey()};
        for (Animal a : zoo)
            printClass(a);
    }

    static void printClass(Animal obj) {
        Class<?> cls = obj.getClass();
        obj.move();
    }

}


abstract class Animal {
    abstract void move();
}

class Duck extends Animal {
    void move() {
        System.out.println("Duck walks slowly");
    }
}

class Monkey extends Animal {
    void move() {
        System.out.println("Monkey jumps fast");
    }
}
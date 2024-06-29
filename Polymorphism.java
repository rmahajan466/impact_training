public class Polymorphism {
    public static void main(String[] args) {
        // Polymorphism is the ability of an object to take on many forms. The most
        // common
        // use of polymorphism in OOP occurs when a parent class reference is used to
        // refer to
        // a child class object.
        // Calculator calculator = new Calculator();
        // System.out.println(calculator.add(2, 3));
        // calculator.add();
        Dog dog = new Dog();
        dog.eat();
    }
}

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // void add() {
    // System.out.println("Hello World");
    // }
}

class Animal {
    public void eat() {
        System.out.println("Eats Anything!");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("Eats Meat!");
    }
}
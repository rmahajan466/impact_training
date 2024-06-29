public class Inheritance {
    public static void main(String[] args) {
        // Inheritance is a way to create a new class from an existing class.
        // The new class is called a subclass and the existing class is called a
        // superclass.
        // The subclass inherits all the properties and methods of the superclass.
        // The subclass can add its own properties and methods.
        // The subclass can also override the properties and methods of the superclass.
        Dog dog = new Dog();
        dog.eat();
        GermanShepherd germanShepherd = new GermanShepherd();
        germanShepherd.eat();
        Cat cat = new Cat();
        cat.eat();
    }
}

class Animal {
    public void eat() {
        System.out.println("Eating...");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Barking...");
    }
}

class GermanShepherd extends Dog {
    public void german() {
        System.out.println("German Shepherd");
    }
}

class Cat extends Animal {
    public void meow() {
        System.out.println("Meowing...");
    }
}

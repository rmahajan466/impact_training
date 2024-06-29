public class Interface {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.drink();
    }
}

interface Animal {
    void eat();

    void drink();
}

class Dog implements Animal {
    public void eat() {
        System.out.println("Dog is eating");
    }

    public void drink() {
        System.out.println("Dog is drinking");
    }
}
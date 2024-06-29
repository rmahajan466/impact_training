public class Abstraction {
    public static void main(String[] args) {
        // Abstraction is the process of hiding the implementation details and showing
        // only functionality to the client
        Deer deer = new Deer();
        deer.eat();
    }
}

abstract class Animal {
    abstract void eat();

    public void sleep() {
        System.out.println("Sleeping");
    }
}

class Deer extends Animal {
    void eat() {
        System.out.println("Deer is eating grass");
    }
}

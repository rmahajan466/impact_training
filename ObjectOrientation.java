public class ObjectOrientation {
    public static void main(String[] args) {
        // OOPS - Object Oriented Programming System
        Student student = new Student();
        student.name = "Raghav Mahajan";
        student.age = 20;
        student.rollNo = 33;
        student.gender = "Male";
        student.address = "Indore";
        student.display();
    }
}

// Creating class

class Student {
    // Properties
    String name;
    int age;
    int rollNo;
    String gender;
    String address;

    // Methods
    void display() {
        System.out.println("Name: " + name + "\nAge: " + age + "\nGender: " + gender + "\nAddress: " + address);
    }

    void exam() {
        System.out.println("Exam");
    }
}

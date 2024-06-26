public class CreatingClass {
    public static void main(String[] args) {
        Student student = new Student("Raghav", 20, "Male", "Indore");
        System.out.println(student.name + " " + student.age + " " + student.gender + " " + student.address);
    }
}

class Student {
    String name;
    int age;
    String gender;
    String address;

    // Creating a constructor
    Student(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.address = address;
    }

}
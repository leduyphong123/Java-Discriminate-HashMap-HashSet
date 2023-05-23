public class Student {
    private String name;
    private int age;
    private String address;

    Student() {
    }

    Student(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    @Override
    public String toString() {
        return "name = " + this.name + " - age = " + this.age + " - address = " + this.address;
    }
}

package Trainer3;

class Student {

    String name;

    Student(String name) {
        this.name = name;
        System.out.println("Student Created: " + name);
    }
}

@FunctionalInterface
interface StudentFactory {
    Student create(String name);
}

public class E4{

    public static void main(String[] args) {


        StudentFactory sf = Student::new;

        Student s1 = sf.create("Samar");
        Student s2 = sf.create("Sam");
    }
}

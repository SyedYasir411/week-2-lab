class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayRole() {
        displayInfo();
        System.out.println("Subject: " + subject);
    }
}

class Student extends Person {
    String grade;

    Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    void displayRole() {
        displayInfo();
        System.out.println("Grade: " + grade);
    }
}

class Staff extends Person {
    String department;

    Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    void displayRole() {
        displayInfo();
        System.out.println("Department: " + department);
    }
}

public class P9 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Shawarma", 40, "Maths");
        Student student = new Student("Ani", 16, "10th Grade");
        Staff staff = new Staff("vgt", 35, "tydrd");

        teacher.displayRole();
        student.displayRole();
        staff.displayRole();
    }
}

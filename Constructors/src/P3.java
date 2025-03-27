class Person{
    String name;
    double age;

    Person(){
        name = "luffy";
        age =19;
    }

    Person(Person prev){
        name = prev.name;
        age = prev.age;

    }
}
public class P3 {
    public static void main(String[] args){
        Person nice = new Person();
        Person n1 = new Person(nice);
        System.out.println(n1.name+" ,"+n1.age);
    }
}

class Animal{
    String name;
    int age;
    Animal(String name,int age){
        this.name = name;
        this.age=age;
    }
    void makesound(){
        System.out.println(name+" makes sound");
    }
}

class Dog extends Animal{
    Dog(String name,int age){
        super(name,age);
    }
    @Override
    void makesound(){
        System.out.println(name+" barks");
    }
}

class Cat extends Animal{
    Cat(String name,int age){
        super(name,age);
    }

    @Override
    void makesound() {
        System.out.println(name + " meows");
    }
}

class Bird extends Animal{
    Bird(String name,int age){
        super(name,age);
    }

    @Override
    void makesound(){
        System.out.println(name+" chirps");
    }
}
public class P1 {
    public static void main(String[] args){
        Animal n = new Animal("cuddy",3);
        n.makesound();
        Bird b = new Bird("parr",2);
        b.makesound();
    }
}

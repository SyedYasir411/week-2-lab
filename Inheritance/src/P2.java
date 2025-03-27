class Employee{
    String name;
    int id;
    double salary;
    Employee(String name,int id,double salary){
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    void displayDetails(){
        System.out.println("name : "+name);
        System.out.println("id : "+id);
        System.out.println("salary : "+salary+"\n");
    }
}

class Manager extends Employee{
    int teamsize;
    Manager(String name,int id,double salary,int teamsize){
        super(name,id,salary);
        this.teamsize = teamsize;
    }

    @Override
    void displayDetails(){
        System.out.println("name : "+name);
        System.out.println("id : "+id);
        System.out.println("salary : "+salary);
        System.out.println("TeamSize : "+teamsize+"\n");
    }
}

class Developer extends Employee{
    String programmingLanguage;
    Developer(String name,int id,double salary,String programmingLanguage){
        super(name,id,salary);
        this.programmingLanguage=programmingLanguage;
    }

    @Override
    void displayDetails(){
        System.out.println("name : "+name);
        System.out.println("id : "+id);
        System.out.println("salary : "+salary);
        System.out.println("Language : "+programmingLanguage+"\n");
    }
}

class Intern extends Employee{
    String role;
    Intern(String name,int id,double salary,String role){
        super(name,id,salary);
        this.role = role;
    }
    @Override
    void displayDetails(){
        System.out.println("name : "+name);
        System.out.println("id : "+id);
        System.out.println("salary : "+salary);
        System.out.println("Role : "+role+"\n");
    }

}
public class P2 {
    public static void main(String[] args){
        Employee E = new Employee("charan",342,3000200);
        Manager M = new Manager("vasd",2,52332000,6);
        Developer D = new Developer("sca",34,45533300,"Python");
        Intern I = new Intern("ds",535,20000,"Intern");
        E.displayDetails();
        M.displayDetails();
        D.displayDetails();
        I.displayDetails();
    }
}

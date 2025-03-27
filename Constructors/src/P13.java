class Employee{
    public int employeeid;
    protected String department;
    private double salary;

    Employee(int employeeid,String department,double salary){
        this.employeeid=employeeid;
        this.department=department;
        this.salary = salary;
    }

    public double getsalary(){
        return salary;
    }
    public void setsalary(double salary){
        this.salary = salary;
    }

    void display(){
        System.out.println("empID : "+employeeid);
        System.out.println("Department : "+department);
        System.out.println("salary : "+getsalary());
    }

}

class Manager extends Employee{
    Manager(int empid,String depart,double salary){
        super(empid,depart,salary);
    }

    void display(){
        System.out.println("Managers details");
        super.display();
    }
}

public class P13 {
    public static void main(String[] args){
        Employee n1 = new Employee(3,"AIML",9032.32);
        Manager n2 = new Manager(1,"HR",344.44);
        n1.display();
        n2.display();
    }
}

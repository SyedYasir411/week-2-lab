import java.util.Scanner;
class Employee {
    String s;
    int id;
    double sal;

    Employee(String s, int id, double sal) {
        this.s = s;
        this.id = id;
        this.sal = sal;
    }
    void displayDetails(){
        System.out.println("Name ="+s);
        System.out.println("Id ="+id);
        System.out.println("Salary ="+sal);
        }

}
public class P1{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name = input.next();
        int id = input.nextInt();
        double sala = input.nextDouble();
        Employee emp = new Employee(name,id,sala);
        emp.displayDetails();
    }
}

class employee{
    static String companyname="Cap";
    String name;
    final int id;
    String designation;
    static int totalemp;

    employee(String name,int id,String designation){
        this.name = name;
        this.id = id;
        this.designation=designation;
        totalemp++;
    }

    void display(){
        System.out.println(companyname);
        System.out.println(name);
        System.out.println(id);
        System.out.println(designation);
    }

    static void displaytotal(){
        System.out.println(totalemp);
    }
}
public class P3 {
    public static void main(String[] args){
        employee n = new employee("caca",32,"csd");
        n.display();
        employee.displaytotal();
    }
}

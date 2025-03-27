import java.util.Scanner;
class BankAccount{
    String accountHolder;
    double accountNumber;
    double balance;
    BankAccount(String x,double y,double z){
        this.accountHolder=x;
        this.accountNumber=y;
        this.balance=z;
    }
    void deposit(double m){
        balance+=m;
        System.out.println("total_cash : "+(balance));
    }

    void Withdraw(double q){
        if(q<balance){
            balance-=q;
            System.out.println("Remaining balance : "+(balance));
        }else{
            System.out.println("Invalid Amount");
        }
    }

    void display(){
        System.out.println("curr_bal : "+balance);
    }

}
public class P7 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        double acc_num = input.nextDouble();
        double total_cash = input.nextDouble();
        BankAccount n= new BankAccount(name,acc_num,total_cash);
        System.out.println("Enter amount to be deposited");
        n.deposit(input.nextDouble());
        System.out.println("Enter money to be withdrawn");
        n.Withdraw(input.nextDouble());
        n.display();

    }
}

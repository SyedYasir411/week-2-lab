class BankAccount{
    public int accNum;
    protected String accholder;
    private double balance;

    BankAccount(int accNum,String accholder,double balance){
        this.accNum=accNum;
        this.accholder=accholder;
        this.balance=balance;
    }
    public double getbalance(){
        return balance;
    }

    public void setbalance(double balance){
        this.balance = balance;
    }

    public void display(){
        System.out.println("accNum : "+accNum);
        System.out.println("accHolder : "+accholder);
        System.out.println("balance : "+getbalance());
    }
}

class Subclass extends BankAccount{
    Subclass(int accNum, String accholder) {
        super(accNum,accholder,2000);
    }
}
public class P12 {
    public static void main(String[] args){
        BankAccount n1 = new BankAccount(3,"csa",1000);
        Subclass n2 = new Subclass(5,"awda");
        n1.setbalance(3000);
        n1.display();
        n2.display();
    }
}

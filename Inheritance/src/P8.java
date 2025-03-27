class BankAccount{
    int accNum;
    double balance;
    BankAccount(int accNum,double balance){
        this.accNum=accNum;
        this.balance=balance;
    }
    void display_type(){
        System.out.println("accNum : "+accNum);
        System.out.println("balance : "+balance);
    }
}

class SavingAcc extends BankAccount{
    double interestrate;
    SavingAcc(int accNum,double balance,double interestrate){
        super(accNum,balance);
        this.interestrate=interestrate;
    }

    @Override
    void display_type() {
        super.display_type();
        System.out.println("type : Savings \n");
    }
}

class CheckingAcc extends BankAccount{
    double withdrawllimit;
    CheckingAcc(int accNum,double balance, double withdrawllimit){
        super(accNum, balance);
        this.withdrawllimit=withdrawllimit;
    }
    @Override
    void display_type() {
        super.display_type();
        System.out.println("type : Checking\n");
    }
}

class FD extends BankAccount{
    int Min_yrs;
    FD(int accNum,double balance,int Min_yrs){
        super(accNum, balance);
        this.Min_yrs=Min_yrs;
    }
    @Override
    void display_type() {
        super.display_type();
        System.out.println("type : FixedDeposit\n");
    }
}
public class P8 {
    public static void main(String[] args){
//        BankAccount b1= new BankAccount(3232,344300);
        SavingAcc s1= new SavingAcc(4323,332200,0.1);
        CheckingAcc c1 = new CheckingAcc(3232,424400,30000);
        FD f = new FD(764,86400,2);
        s1.display_type();
        c1.display_type();
        f.display_type();
    }
}

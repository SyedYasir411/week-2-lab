class BankAccount{
    static String bankName;
    String accholdername;
    final int accountnumber;
    static int totalacc;

    BankAccount(String accholdername,int accountnumber){
        this.accholdername=accholdername;
        this.accountnumber=accountnumber;
        bankName="SBI";
        totalacc++;
    }
    public static void gettotalaccounts(){
        System.out.println("total acc : "+totalacc);
    }

    void display(){
        System.out.println("bankName : "+bankName);
        System.out.println("account Number : "+accountnumber);
        System.out.println("account Holder Name : "+accholdername);
        System.out.println();
    }
}
public class P1 {
    public static void main(String[] args){
        BankAccount n = new BankAccount("dwad",109);
        BankAccount account = new BankAccount("nckasc",10);
        n.display();
        System.out.println("account object is an instance of the BankAccount : "+(account instanceof BankAccount));
        account.display();
        BankAccount.gettotalaccounts();
    }
}

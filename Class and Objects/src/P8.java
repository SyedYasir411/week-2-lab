import java.util.Scanner;

class Palindrome{
    String text;
    Palindrome(String x){
        this.text = x;
    }
    public boolean checker(){
        int n = text.length();
        for(int i=0;i<n/2;i++){
            if(text.charAt(i)!=text.charAt(n-1-i)){
                return false;
            }
        }
        return true;
    }
    void display(){
        System.out.println("is palindrome : "+checker());
    }
}

public class P8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String t = input.nextLine();
        Palindrome n = new Palindrome(t);
        n.display();
    }
}

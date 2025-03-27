import java.util.Scanner;

class Book{
    String title;
    String author;
    double price;

    Book(){
        title = "Prisoner of Azkaban";
        author = "J.K";
        price = 999.99;
    }
    Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price = price;
    }

    void display(){
        System.out.println(title+ " ,"+author+" ,"+price);
    }
}
public class P1 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Book n = new Book();
        n.display();
    }
}

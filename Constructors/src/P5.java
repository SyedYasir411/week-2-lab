import java.util.Scanner;
class Books{
    String title;
    String author;
    double price;
    String availability;

    Books(String title,String author){
        this.title=title;
        this.author=author;
        this.price = 189.00;
        availability="yes";
    }

    void display(){
        System.out.println("title: "+title);
        System.out.println("author: "+author);
        System.out.println("price: "+price);
        System.out.println("availability: "+availability);
    }

}
public class P5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter title");
        String tit = input.nextLine();
        System.out.println("Enter author name");
        String author = input.nextLine();
        Books n1 = new Books(tit, author);

        n1.display();
    }
}

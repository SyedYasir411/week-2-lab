class Book{
    String title;
    String author;
    double price;
    Book(String title,String author,double price){
        this.title =title;
        this.author=author;
        this.price=price;
    }

    void display(){
        System.out.println("title : "+ title);
        System.out.println("author : "+ author);
        System.out.println("price : "+price);
    }
}

public class P3{
    public static void main(String[] args){
        Book j = new Book("Philosopher's Stone","J.K.",1000);
        j.display();
    }
}

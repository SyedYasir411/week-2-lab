class Book{
    String title;
    int publication_year;
    Book(String title,int year){
        this.title=title;
        this.publication_year=year;
    }
}

class Author extends Book{
    String name;
    String bio;
    Author(String title,int publication_year,String name,String bio){
        super(title,publication_year);
        this.name=name;
        this.bio=bio;
    }

    public void display(){
        System.out.println("name : "+name);
        System.out.println("bio : "+bio);
        System.out.println("title : "+title);
        System.out.println("year : "+publication_year);
    }
}
public class P4 {
    public static void main(String[] args){
        Author b1 = new Author("Chamber of secrets",2001,"J.k.","njnsd vnsedvc sdvjsn");
        b1.display();
    }
}

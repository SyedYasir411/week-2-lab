class Bok{
    public String isbn;
    protected String title;
    private String author;

    Bok(String isbn,String title,String author){
        this.isbn = isbn;
        this.title=title;
        this.author=author;
    }

    public String getauthor(){
        return author;
    }

    public void setauthor(String author){
        this.author = author;
    }
    void display(){
        System.out.println("isbn : "+isbn);
        System.out.println("title : "+title);
        System.out.println("author : "+getauthor());
    }
}

class Ebook extends Bok{
    Ebook(String isbn,String title){
        super(isbn,title,"J.K");
    }

}
public class P11 {
    public static void main(String[] args){
        Bok n1 = new Bok("213-342-32","chamber of secrets","rowling");
        Ebook n2 = new Ebook("31331-323-32","sdvsvse");
        n2.setauthor("sdc");
        n2.display();
    }
}

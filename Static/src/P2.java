class Book{
    static String libraryName="General library";
    String title;
    String author;
    final String isbn;
    Book(String title,String author,String isbn){
        this.title = title;
        this.author=author;
        this.isbn=isbn;
    }

    static void displayLibraryName(){
        System.out.println(libraryName);
    }

    public void display(){
        System.out.println(title);
        System.out.println(author);
        System.out.println(isbn);
    }
}
public class P2 {
    public static void main(String[] args){
        Book obj = new Book("order of phx","J.k","121-42-543");
        Book.displayLibraryName();
        obj.display();
        System.out.println("obj is an instance of Book : "+(obj instanceof Book));
    }
}

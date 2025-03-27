class Product{
    String productName;
    double price;
    static double totalProoducts;

    Product(String name,double pr){
        this.productName=name;
        this.price = pr;
        totalProoducts++;
    }

    public void display(){
        System.out.println("Name : "+productName);
        System.out.println("price : "+ price);
    }

    public static void totalproducts(){
        System.out.println("totalProoducts : "+totalProoducts);
    }
}
public class P7 {
    public static void main(String[] args){
        Product p1 = new Product("Brush", 60);
        Product p2 = new Product("Paste", 20);
        p1.display();
        p2.display();
        Product.totalproducts();
    }
}

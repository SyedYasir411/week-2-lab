class Product{
    static double discount=10;
    String productName;
    double price;
    double quantity;
    final double product_id;

    Product(String name,double price,double quantity,double product_id){
        this.productName=name;
        this.price=price;
        this.quantity=quantity;
        this.product_id=product_id;
    }

    public static void updateDiscount(double discount){
        Product.discount =discount;
        System.out.println("Discount : "+Product.discount);
    }
    void display(){
        System.out.println("ProductName : "+productName);
        System.out.println("Price : "+price);
        System.out.println("quantity : "+quantity);
        System.out.println("ProductID : "+product_id);
    }
}
public class P4 {
    public static void main(String[] args){
        Product n = new Product("sdv",879,4,39);
        Product.updateDiscount(23);
        n.display();
    }
}

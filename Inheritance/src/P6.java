class Order{
    int orderId;
    String orderdate;
    Order(int id,String date){
        this.orderId=id;
        this.orderdate=date;
    }

    public void getOrderDetails(){
        System.out.println("Ordered on : "+orderdate);
    }
}

class ShippedOrder extends Order{
    double trackingNumber;
    ShippedOrder(int orderId,String orderdate,double trackingnumber){
        super(orderId,orderdate);
        this.trackingNumber=trackingnumber;
    }

    @Override
    public void getOrderDetails() {
        super.getOrderDetails();
        System.out.println("Order Shipped with traking id : "+ trackingNumber);
    }
}

class DeliveredOrder extends ShippedOrder{
    String delivery_date;
    DeliveredOrder(int orderId,String orderdate,double trackingNumber,String delivery_date){
        super(orderId,orderdate,trackingNumber);
        this.delivery_date=delivery_date;
    }

    @Override
    public void getOrderDetails() {
        super.getOrderDetails();
        System.out.println("Delivered on : "+delivery_date);
    }
}
public class P6 {
    public static void main(String[] args){
        Order order = new Order(1,"12-3-25");
        ShippedOrder shipped = new ShippedOrder(2,"15-2-25",3242);
        DeliveredOrder delivered = new DeliveredOrder(3,"5-3-24",4363,"8-4-25");
        order.getOrderDetails();
        shipped.getOrderDetails();
        delivered.getOrderDetails();
    }
}

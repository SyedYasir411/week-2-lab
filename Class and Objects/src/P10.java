import java.util.Scanner;

class CartItem {
    String name;
    double price;
    int quantity;

    CartItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotal() {
        return price * quantity;
    }

    void display() {
        System.out.println(name + " - ₹" + price + " x " + quantity + " = ₹" + getTotal());
    }
}

public class P10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CartItem[] cart = new CartItem[100];
        int count = 0;
        int choice;

        do {
            System.out.println("\n1. Add Item\n2. Remove Item\n3. View Cart\n4. Total Cost\n5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter item name: ");
                String name = sc.nextLine();
                System.out.print("Enter price: ");
                double price = sc.nextDouble();
                System.out.print("Enter quantity: ");
                int qty = sc.nextInt();
                cart[count] = new CartItem(name, price, qty);
                count++;
                System.out.println("Item added!");
            } else if (choice == 2) {
                System.out.print("Enter item name to remove: ");
                String name = sc.nextLine();
                boolean found = false;
                for (int i = 0; i < count; i++) {
                    if (cart[i].name.equalsIgnoreCase(name)) {
                        for (int j = i; j < count - 1; j++) {
                            cart[j] = cart[j + 1];
                        }
                        cart[count - 1] = null;
                        count--;
                        found = true;
                        System.out.println("Item removed.");
                        break;
                    }
                }
                if (!found) {
                    System.out.println("Item not found.");
                }
            } else if (choice == 3) {
                if (count == 0) {
                    System.out.println("Cart is empty.");
                } else {
                    System.out.println("Items in cart:");
                    for (int i = 0; i < count; i++) {
                        cart[i].display();
                    }
                }
            } else if (choice == 4) {
                double total = 0;
                for (int i = 0; i < count; i++) {
                    total += cart[i].getTotal();
                }
                System.out.printf("Total cost: ₹%.2f\n", total);
            } else if (choice == 5) {
                System.out.println("Thanks for shopping!");
            } else {
                System.out.println("Invalid choice.");
            }

        } while (choice != 5);

        sc.close();
    }
}

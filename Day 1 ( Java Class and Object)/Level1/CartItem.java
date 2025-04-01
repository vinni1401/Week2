import java.util.Scanner;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }
}

class ShoppingCart {
    CartItem[] cart;
    int itemCount;

    ShoppingCart(int capacity) {
        cart = new CartItem[capacity];
        itemCount = 0;
    }

    void addItem(String itemName, double price, int quantity) {
        if (itemCount < cart.length) {
            cart[itemCount] = new CartItem(itemName, price, quantity);
            itemCount++;
            System.out.println(quantity + " " + itemName + "(s) added to the cart.");
        } else {
            System.out.println("Cart is full.");
        }
    }

    void removeItem(String itemName) {
        boolean found = false;
        for (int i = 0; i < itemCount; i++) {
            if (cart[i].itemName.equalsIgnoreCase(itemName)) {
                found = true;
                for (int j = i; j < itemCount - 1; j++) {
                    cart[j] = cart[j + 1];
                }
                cart[itemCount - 1] = null;
                itemCount--;
                System.out.println(itemName + " removed from the cart.");
                break;
            }
        }
        if (!found) {
            System.out.println(itemName + " not found.");
        }
    }

    void displayCart() {
        if (itemCount == 0) {
            System.out.println("Your cart is empty.");
        } else {
            System.out.println("Shopping Cart Items:");
            for (int i = 0; i < itemCount; i++) {
                System.out.println(cart[i].quantity + " x " + cart[i].itemName + " - $" + cart[i].price);
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart myCart = new ShoppingCart(10);

        while (true) {
            System.out.println("\n1. Add Item\n2. Remove Item\n3. Display Cart\n4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();

            if (choice == 1) {
                System.out.print("Enter item name: ");
                String name = sc.nextLine();
                System.out.print("Enter price: ");
                double price = sc.nextDouble();
                System.out.print("Enter quantity: ");
                int quantity = sc.nextInt();
                myCart.addItem(name, price, quantity);
            } else if (choice == 2) {
                System.out.print("Enter item name to remove: ");
                String name = sc.nextLine();
                myCart.removeItem(name);
            } else if (choice == 3) {
                myCart.displayCart();
            } else if (choice == 4) {
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid choice.");
            }
        }
        sc.close();
    }
}

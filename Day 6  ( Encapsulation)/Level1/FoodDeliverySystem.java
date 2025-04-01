abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String name, double price, int qty) {
        this.itemName = name;
        this.price = price;
        this.quantity = qty;
    }

    public double getPrice() { return price; }
    public int getQuantity() { return quantity; }

    public abstract double calculateTotalPrice();

    public void getItemDetails() {
        System.out.println("Item: " + itemName + ", Price: ₹" + price + ", Qty: " + quantity);
    }
}

interface Discountable {
    double applyDiscount();
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    public VegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.05;
    }

    public String getDiscountDetails() {
        return "5% Discount on Veg";
    }
}

class NonVegItem extends FoodItem implements Discountable {
    public NonVegItem(String name, double price, int qty) {
        super(name, price, qty);
    }

    public double calculateTotalPrice() {
        return (getPrice() + 20) * getQuantity(); // Additional charge for non-veg
    }

    public double applyDiscount() {
        return calculateTotalPrice() * 0.1;
    }

    public String getDiscountDetails() {
        return "10% Discount on Non-Veg";
    }
}

public class FoodDeliverySystem {
    public static void main(String[] args) {
        FoodItem[] items = {
            new VegItem("Paneer Tikka", 200, 2),
            new NonVegItem("Chicken Biryani", 250, 1)
        };

        for (int i = 0; i < items.length; i++) {
            items[i].getItemDetails();
            double total = items[i].calculateTotalPrice();

            if (items[i] instanceof Discountable) {
                Discountable d = (Discountable) items[i];
                double discount = d.applyDiscount();
                System.out.println(d.getDiscountDetails());
                System.out.println("Total after Discount: ₹" + (total - discount));
            }

            System.out.println("---------------------------------");
        }
    }
}

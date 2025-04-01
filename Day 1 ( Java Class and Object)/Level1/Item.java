class Item {
    int itemCode;
    String itemName;
    double price;

    Item(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }

    void displayDetails(int quantity) {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per unit: $" + price);
        System.out.println("Total Cost for " + quantity + " units: $" + calculateTotalCost(quantity));
    }

    public static void main(String[] args) {
        Item item = new Item(101, "Laptop", 750);
        item.displayDetails(2);
    }
}

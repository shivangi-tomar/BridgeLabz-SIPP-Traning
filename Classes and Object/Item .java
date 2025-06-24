class Item {
    int itemCode;
    String itemName;
    double price;

    void setDetails(int code, String name, double p) {
        itemCode = code;
        itemName = name;
        price = p;
    }

    void showDetails(int quantity) {
        double total = price * quantity;
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price: " + price);
        System.out.println("Total Cost: " + total);
    }

    public static void main(String args[]) {
        Item it = new Item();
        it.setDetails(2001, "Pen", 10);
        it.showDetails(5);
    }
}

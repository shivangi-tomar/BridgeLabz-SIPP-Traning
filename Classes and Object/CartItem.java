class CartItem {
    String itemName;
    double price;
    int quantity;

    void addItem(String name, double p, int q) {
        itemName = name;
        price = p;
        quantity = q;
    }

    void removeItem() {
        itemName = "";
        price = 0;
        quantity = 0;
    }

    void totalCost() {
        double total = price * quantity;
        System.out.println("Total Cost: " + total);
    }

    public static void main(String args[]) {
        CartItem cart = new CartItem();
        cart.addItem("T-shirt", 499.0, 2);
        cart.totalCost();
        cart.removeItem();
        cart.totalCost();
    }
}

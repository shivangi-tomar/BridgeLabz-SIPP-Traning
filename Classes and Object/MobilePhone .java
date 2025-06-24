class MobilePhone {
    String brand;
    String model;
    double price;

    void setDetails(String b, String m, double p) {
        brand = b;
        model = m;
        price = p;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }

    public static void main(String args[]) {
        MobilePhone phone = new MobilePhone();
        phone.setDetails("Samsung", "Galaxy M14", 12999);
        phone.display();
    }
}

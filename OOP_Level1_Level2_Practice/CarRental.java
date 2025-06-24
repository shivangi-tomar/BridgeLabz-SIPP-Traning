class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

    CarRental(String name, String model, int days) {
        customerName = name;
        carModel = model;
        rentalDays = days;
    }

    void displayTotalCost() {
        int costPerDay = 1000;
        int total = costPerDay * rentalDays;
        System.out.println("Customer: " + customerName);
        System.out.println("Car Model: " + carModel);
        System.out.println("Total Cost: Rs." + total);
    }

    public static void main(String[] args) {
        CarRental cr = new CarRental("Shivangi", "Honda City", 4);
        cr.displayTotalCost();
    }
}

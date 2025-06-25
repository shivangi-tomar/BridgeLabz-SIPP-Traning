class Vehicle {
    static int registrationFee = 5000;
    final String registrationNumber;
    String ownerName, vehicleType;

    Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    static void updateRegistrationFee(int newFee) {
        registrationFee = newFee;
    }

    void showDetails() {
        if (this instanceof Vehicle) {
            System.out.println(vehicleType + " owned by " + ownerName + ", Reg#: " + registrationNumber);
        }
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Rajeev", "Car", "UP85BQ4567");
        v1.showDetails();
        updateRegistrationFee(5500);
        System.out.println("Updated Fee: ₹" + registrationFee);
    }
}

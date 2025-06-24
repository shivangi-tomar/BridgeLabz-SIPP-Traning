class Vehicle {
    String ownerName;
    String vehicleType;
    static int registrationFee = 500;

    Vehicle(String owner, String type) {
        ownerName = owner;
        vehicleType = type;
    }

    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Type: " + vehicleType);
        System.out.println("Registration Fee: Rs." + registrationFee);
    }

    static void updateRegistrationFee(int newFee) {
        registrationFee = newFee;
    }

    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Shivangi", "Scooty");
        Vehicle v2 = new Vehicle("Sita", "Car");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(800);
        System.out.println("\nUpdated Fee:");
        v1.displayVehicleDetails();
    }
}

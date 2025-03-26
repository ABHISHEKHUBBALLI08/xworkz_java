public class Cab {
    String cabNumber;
    String driverName;
    String cabModel;
    String cabColor;
    boolean isAC;
    double farePerKm;
    double totalEarnings;
    int seatingCapacity;
    String ownerName;
    String ownerAddress;
    long phoneNumber;
    boolean hasGPS;
    String fuelType;
    boolean isAvailable;
    double rating;
    String serviceArea;
    boolean hasMusicSystem;
    String companyName;

    public Cab(String cabNumber, String driverName, String cabModel, String cabColor, boolean isAC, 
               double farePerKm, double totalEarnings, int seatingCapacity, String ownerName, 
               String ownerAddress, long phoneNumber, boolean hasGPS, String fuelType, boolean isAvailable, 
               double rating, String serviceArea, boolean hasMusicSystem, String companyName) {
        this.cabNumber = cabNumber;
        this.driverName = driverName;
        this.cabModel = cabModel;
        this.cabColor = cabColor;
        this.isAC = isAC;
        this.farePerKm = farePerKm;
        this.totalEarnings = totalEarnings;
        this.seatingCapacity = seatingCapacity;
        this.ownerName = ownerName;
        this.ownerAddress = ownerAddress;
        this.phoneNumber = phoneNumber;
        this.hasGPS = hasGPS;
        this.fuelType = fuelType;
        this.isAvailable = isAvailable;
        this.rating = rating;
        this.serviceArea = serviceArea;
        this.hasMusicSystem = hasMusicSystem;
        this.companyName = companyName;
    }
}

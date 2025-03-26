public class Tab {
    String brandName;
    int screenSize;
    int batteryCapacity;
    int storage;
    int price;
    String processor;
    String color;
    int ram;
    String os;
    boolean supportsStylus;
    String ownerName;
    String ownerAddress;
    long phoneNumber;
    int purchaseDate;
    int yearOfRegistration;
    boolean warranty;
    String email;
    boolean serviceAvailable;
    String customerCareMemberName;

    public Tab(String brandName, int screenSize, int batteryCapacity, int storage, int price,
               String processor, String color, int ram, String os, boolean supportsStylus,
               String ownerName, String ownerAddress, long phoneNumber, int purchaseDate,
               int yearOfRegistration, boolean warranty, String email, boolean serviceAvailable,
               String customerCareMemberName) {
        this.brandName = brandName;
        this.screenSize = screenSize;
        this.batteryCapacity = batteryCapacity;
        this.storage = storage;
        this.price = price;
        this.processor = processor;
        this.color = color;
        this.ram = ram;
        this.os = os;
        this.supportsStylus = supportsStylus;
        this.ownerName = ownerName;
        this.ownerAddress = ownerAddress;
        this.phoneNumber = phoneNumber;
        this.purchaseDate = purchaseDate;
        this.yearOfRegistration = yearOfRegistration;
        this.warranty = warranty;
        this.email = email;
        this.serviceAvailable = serviceAvailable;
        this.customerCareMemberName = customerCareMemberName;
    }
}

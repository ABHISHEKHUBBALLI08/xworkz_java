public class Dustbin {
    String brandName;
    int capacity;
    String material;
    String color;
    boolean hasLid;
    boolean isRecyclable;
    double height;
    double width;
    double price;
    String shape;
    String ownerName;
    String ownerAddress;
    long phoneNumber;
    boolean warranty;
    String email;
    boolean serviceAvailable;
    String customerCareMemberName;

    public Dustbin(String brandName, int capacity, String material, String color, boolean hasLid, 
                   boolean isRecyclable, double height, double width, double price, String shape, 
                   String ownerName, String ownerAddress, long phoneNumber, boolean warranty, 
                   String email, boolean serviceAvailable, String customerCareMemberName) {
        this.brandName = brandName;
        this.capacity = capacity;
        this.material = material;
        this.color = color;
        this.hasLid = hasLid;
        this.isRecyclable = isRecyclable;
        this.height = height;
        this.width = width;
        this.price = price;
        this.shape = shape;
        this.ownerName = ownerName;
        this.ownerAddress = ownerAddress;
        this.phoneNumber = phoneNumber;
        this.warranty = warranty;
        this.email = email;
        this.serviceAvailable = serviceAvailable;
        this.customerCareMemberName = customerCareMemberName;
    }
}

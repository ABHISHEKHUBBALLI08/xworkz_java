public class Mirror {
    String brandName;
    int height;
    int width;
    int area;
    int price;
    String shape;
    String borderDesign;
    String borderColor;
    int borderWidth;
    String glassType;
    String glassMaterial;
    String ownerName;
    String ownerAddress;
    long phoneNumber;
    int date;
    int yearOfRegistration;
    boolean warranty;
    String email;
    boolean service;
    String customerCareMemberName;

    public Mirror(String brandName, int height, int width, int area, int price, String shape,
                  String borderDesign, String borderColor, int borderWidth, String glassType, 
                  String glassMaterial, String ownerName, String ownerAddress, long phoneNumber, 
                  int date, int yearOfRegistration, boolean warranty, String email, 
                  boolean service, String customerCareMemberName) {
        
        this.brandName = brandName;
        this.height = height;
        this.width = width;
        this.area = area;
        this.price = price;
        this.shape = shape;
        this.borderDesign = borderDesign;
        this.borderColor = borderColor;
        this.borderWidth = borderWidth;
        this.glassType = glassType;
        this.glassMaterial = glassMaterial;
        this.ownerName = ownerName;
        this.ownerAddress = ownerAddress;
        this.phoneNumber = phoneNumber;
        this.date = date;
        this.yearOfRegistration = yearOfRegistration;
        this.warranty = warranty;
        this.email = email;
        this.service = service;
        this.customerCareMemberName = customerCareMemberName;
    }
}

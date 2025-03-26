public class Chocolate {
    String name;
    String brand;
    double weight;
    double price;
    String flavor;
    boolean hasNuts;
    int cocoaPercentage;
    String type;
    String originCountry;
    boolean isVegan;
    boolean isGlutenFree;
    boolean hasCaramel;
    boolean hasWafer;
    int sugarContent;
    int energyValue;
    String expiryDate;
    boolean isHandmade;
    boolean isFairTradeCertified;
    boolean isOrganic;
    String manufacturer;

    public Chocolate(String name, String brand, double weight, double price, String flavor, boolean hasNuts, int cocoaPercentage, String type, 
                     String originCountry, boolean isVegan, boolean isGlutenFree, boolean hasCaramel, boolean hasWafer, int sugarContent, int energyValue,
                     String expiryDate, boolean isHandmade, boolean isFairTradeCertified, boolean isOrganic, String manufacturer) {
        this.name = name;
        this.brand = brand;
        this.weight = weight;
        this.price = price;
        this.flavor = flavor;
        this.hasNuts = hasNuts;
        this.cocoaPercentage = cocoaPercentage;
        this.type = type;
        this.originCountry = originCountry;
        this.isVegan = isVegan;
        this.isGlutenFree = isGlutenFree;
        this.hasCaramel = hasCaramel;
        this.hasWafer = hasWafer;
        this.sugarContent = sugarContent;
        this.energyValue = energyValue;
        this.expiryDate = expiryDate;
        this.isHandmade = isHandmade;
        this.isFairTradeCertified = isFairTradeCertified;
        this.isOrganic = isOrganic;
        this.manufacturer = manufacturer;
    }
}

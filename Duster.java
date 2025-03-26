public class Duster {
    String brand;
    String color;
    String material;
    boolean isReusable;
    double price;
    String shape;
    double weight;
    String usageType;
    String handleMaterial;
    boolean isEcoFriendly;
    boolean isWashable;
    String surfaceType;
    String countryOfOrigin;
    boolean isAntiStatic;
    int durabilityInMonths;
    String size;
    String fragrance;
    boolean hasExtendableHandle;

    public Duster(String brand, String color, String material, boolean isReusable, double price, 
                  String shape, double weight, String usageType, String handleMaterial, 
                  boolean isEcoFriendly, boolean isWashable, String surfaceType, 
                  String countryOfOrigin, boolean isAntiStatic, int durabilityInMonths, 
                  String size, String fragrance, boolean hasExtendableHandle) {
        this.brand = brand;
        this.color = color;
        this.material = material;
        this.isReusable = isReusable;
        this.price = price;
        this.shape = shape;
        this.weight = weight;
        this.usageType = usageType;
        this.handleMaterial = handleMaterial;
        this.isEcoFriendly = isEcoFriendly;
        this.isWashable = isWashable;
        this.surfaceType = surfaceType;
        this.countryOfOrigin = countryOfOrigin;
        this.isAntiStatic = isAntiStatic;
        this.durabilityInMonths = durabilityInMonths;
        this.size = size;
        this.fragrance = fragrance;
        this.hasExtendableHandle = hasExtendableHandle;
    }
}

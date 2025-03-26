public class PaintBrush {
    String brand;
    String brushType;
    String bristleMaterial;
    double price;
    boolean isSynthetic;
    boolean isRound;
    boolean isFlat;
    boolean isFan;
    boolean isAngular;
    boolean isFilbert;
    String handleMaterial;
    int bristleLength;
    int handleLength;
    boolean isWaterResistant;
    boolean isForOilPaint;
    boolean isForAcrylicPaint;
    boolean isForWatercolor;
    boolean hasErgonomicGrip;
    String color;
    boolean isWashable;
    String usageType;

    public PaintBrush(String brand, String brushType, String bristleMaterial, double price, boolean isSynthetic,
                      boolean isRound, boolean isFlat, boolean isFan, boolean isAngular, boolean isFilbert,
                      String handleMaterial, int bristleLength, int handleLength, boolean isWaterResistant,
                      boolean isForOilPaint, boolean isForAcrylicPaint, boolean isForWatercolor,
                      boolean hasErgonomicGrip, String color, boolean isWashable, String usageType) {
        this.brand = brand;
        this.brushType = brushType;
        this.bristleMaterial = bristleMaterial;
        this.price = price;
        this.isSynthetic = isSynthetic;
        this.isRound = isRound;
        this.isFlat = isFlat;
        this.isFan = isFan;
        this.isAngular = isAngular;
        this.isFilbert = isFilbert;
        this.handleMaterial = handleMaterial;
        this.bristleLength = bristleLength;
        this.handleLength = handleLength;
        this.isWaterResistant = isWaterResistant;
        this.isForOilPaint = isForOilPaint;
        this.isForAcrylicPaint = isForAcrylicPaint;
        this.isForWatercolor = isForWatercolor;
        this.hasErgonomicGrip = hasErgonomicGrip;
        this.color = color;
        this.isWashable = isWashable;
        this.usageType = usageType;
    }
}

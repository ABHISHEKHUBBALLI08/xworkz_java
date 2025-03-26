public class PaintBrushRunner {
    public static void main(String[] args) {
        PaintBrush brush1 = new PaintBrush("Winsor & Newton", "Round", "Synthetic", 15.99, true, true, false, false, false, false,
                                           "Wood", 20, 150, true, true, false, true, true, "Black", true, "Detailing");

        PaintBrush brush2 = new PaintBrush("Princeton", "Flat", "Natural", 12.49, false, false, true, false, false, false,
                                           "Plastic", 25, 140, false, false, true, true, false, "Blue", true, "Blending");

        PaintBrush brush3 = new PaintBrush("Da Vinci", "Fan", "Synthetic", 18.75, true, false, false, true, false, false,
                                           "Bamboo", 30, 160, true, true, true, false, true, "Brown", true, "Texture Effects");

        System.out.println("Paint Brush 1 Details:");
        System.out.println("Brand: " + brush1.brand);
        System.out.println("Brush Type: " + brush1.brushType);
        System.out.println("Bristle Material: " + brush1.bristleMaterial);
        System.out.println("Price: $" + brush1.price);
        System.out.println("Synthetic: " + brush1.isSynthetic);
        System.out.println("Round: " + brush1.isRound);
        System.out.println("Flat: " + brush1.isFlat);
        System.out.println("Fan: " + brush1.isFan);
        System.out.println("Angular: " + brush1.isAngular);
        System.out.println("Filbert: " + brush1.isFilbert);
        System.out.println("Handle Material: " + brush1.handleMaterial);
        System.out.println("Bristle Length: " + brush1.bristleLength + " mm");
        System.out.println("Handle Length: " + brush1.handleLength + " mm");
        System.out.println("Water Resistant: " + brush1.isWaterResistant);
        System.out.println("For Oil Paint: " + brush1.isForOilPaint);
        System.out.println("For Acrylic Paint: " + brush1.isForAcrylicPaint);
        System.out.println("For Watercolor: " + brush1.isForWatercolor);
        System.out.println("Has Ergonomic Grip: " + brush1.hasErgonomicGrip);
        System.out.println("Color: " + brush1.color);
        System.out.println("Washable: " + brush1.isWashable);
        System.out.println("Usage Type: " + brush1.usageType);
        System.out.println("===========================================================");

        System.out.println("\nPaint Brush 2 Details:");
        System.out.println("Brand: " + brush2.brand);
        System.out.println("Brush Type: " + brush2.brushType);
        System.out.println("Bristle Material: " + brush2.bristleMaterial);
        System.out.println("Price: $" + brush2.price);
        System.out.println("Synthetic: " + brush2.isSynthetic);
        System.out.println("Round: " + brush2.isRound);
        System.out.println("Flat: " + brush2.isFlat);
        System.out.println("Fan: " + brush2.isFan);
        System.out.println("Angular: " + brush2.isAngular);
        System.out.println("Filbert: " + brush2.isFilbert);
        System.out.println("Handle Material: " + brush2.handleMaterial);
        System.out.println("Bristle Length: " + brush2.bristleLength + " mm");
        System.out.println("Handle Length: " + brush2.handleLength + " mm");
        System.out.println("Water Resistant: " + brush2.isWaterResistant);
        System.out.println("For Oil Paint: " + brush2.isForOilPaint);
        System.out.println("For Acrylic Paint: " + brush2.isForAcrylicPaint);
        System.out.println("For Watercolor: " + brush2.isForWatercolor);
        System.out.println("Has Ergonomic Grip: " + brush2.hasErgonomicGrip);
        System.out.println("Color: " + brush2.color);
        System.out.println("Washable: " + brush2.isWashable);
        System.out.println("Usage Type: " + brush2.usageType);
        System.out.println("===========================================================");

        System.out.println("\nPaint Brush 3 Details:");
        System.out.println("Brand: " + brush3.brand);
        System.out.println("Brush Type: " + brush3.brushType);
        System.out.println("Bristle Material: " + brush3.bristleMaterial);
        System.out.println("Price: $" + brush3.price);
        System.out.println("Synthetic: " + brush3.isSynthetic);
        System.out.println("Round: " + brush3.isRound);
        System.out.println("Flat: " + brush3.isFlat);
        System.out.println("Fan: " + brush3.isFan);
        System.out.println("Angular: " + brush3.isAngular);
        System.out.println("Filbert: " + brush3.isFilbert);
        System.out.println("Handle Material: " + brush3.handleMaterial);
        System.out.println("Bristle Length: " + brush3.bristleLength + " mm");
        System.out.println("Handle Length: " + brush3.handleLength + " mm");
        System.out.println("Water Resistant: " + brush3.isWaterResistant);
        System.out.println("For Oil Paint: " + brush3.isForOilPaint);
        System.out.println("For Acrylic Paint: " + brush3.isForAcrylicPaint);
        System.out.println("For Watercolor: " + brush3.isForWatercolor);
        System.out.println("Has Ergonomic Grip: " + brush3.hasErgonomicGrip);
        System.out.println("Color: " + brush3.color);
        System.out.println("Washable: " + brush3.isWashable);
        System.out.println("Usage Type: " + brush3.usageType);
    }
}

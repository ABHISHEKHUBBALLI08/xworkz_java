public class ZipRunner {
    public static void main(String[] args) {
        Zip zip1 = new Zip("YKK", "Metal", 25.5, true, true, false, false, true, false, false, "Silver",
                           50, "Standard", true, true, false, "Jackets", 3.99, true, "Sliding");

        Zip zip2 = new Zip("Coats", "Plastic", 20.0, false, false, true, true, false, true, false, "Black",
                           40, "Reversible", false, false, true, "Pants", 2.49, true, "Hook & Loop");

        Zip zip3 = new Zip("SBS", "Nylon", 30.0, true, true, true, false, false, false, true, "Blue",
                           60, "Auto Lock", true, true, true, "Backpacks", 4.75, true, "Magnetic");

        System.out.println("Zip 1 Details:");
        System.out.println("Brand: " + zip1.brand);
        System.out.println("Material: " + zip1.material);
        System.out.println("Length: " + zip1.length + " cm");
        System.out.println("Waterproof: " + zip1.isWaterproof);
        System.out.println("Auto Lock: " + zip1.isAutoLock);
        System.out.println("Two-Way: " + zip1.isTwoWay);
        System.out.println("Invisible: " + zip1.isInvisible);
        System.out.println("Metal: " + zip1.isMetal);
        System.out.println("Plastic: " + zip1.isPlastic);
        System.out.println("Nylon: " + zip1.isNylon);
        System.out.println("Color: " + zip1.color);
        System.out.println("Teeth Count: " + zip1.teethCount);
        System.out.println("Slider Type: " + zip1.sliderType);
        System.out.println("Rust Resistant: " + zip1.isRustResistant);
        System.out.println("Heavy Duty: " + zip1.isHeavyDuty);
        System.out.println("Flexible: " + zip1.isFlexible);
        System.out.println("Usage Type: " + zip1.usageType);
        System.out.println("Price: $" + zip1.price);
        System.out.println("Washable: " + zip1.isWashable);
        System.out.println("Closure Type: " + zip1.closureType);
        System.out.println("===========================================================");

        System.out.println("\nZip 2 Details:");
        System.out.println("Brand: " + zip2.brand);
        System.out.println("Material: " + zip2.material);
        System.out.println("Length: " + zip2.length + " cm");
        System.out.println("Waterproof: " + zip2.isWaterproof);
        System.out.println("Auto Lock: " + zip2.isAutoLock);
        System.out.println("Two-Way: " + zip2.isTwoWay);
        System.out.println("Invisible: " + zip2.isInvisible);
        System.out.println("Metal: " + zip2.isMetal);
        System.out.println("Plastic: " + zip2.isPlastic);
        System.out.println("Nylon: " + zip2.isNylon);
        System.out.println("Color: " + zip2.color);
        System.out.println("Teeth Count: " + zip2.teethCount);
        System.out.println("Slider Type: " + zip2.sliderType);
        System.out.println("Rust Resistant: " + zip2.isRustResistant);
        System.out.println("Heavy Duty: " + zip2.isHeavyDuty);
        System.out.println("Flexible: " + zip2.isFlexible);
        System.out.println("Usage Type: " + zip2.usageType);
        System.out.println("Price: $" + zip2.price);
        System.out.println("Washable: " + zip2.isWashable);
        System.out.println("Closure Type: " + zip2.closureType);
        System.out.println("===========================================================");

        System.out.println("\nZip 3 Details:");
        System.out.println("Brand: " + zip3.brand);
        System.out.println("Material: " + zip3.material);
        System.out.println("Length: " + zip3.length + " cm");
        System.out.println("Waterproof: " + zip3.isWaterproof);
        System.out.println("Auto Lock: " + zip3.isAutoLock);
        System.out.println("Two-Way: " + zip3.isTwoWay);
        System.out.println("Invisible: " + zip3.isInvisible);
        System.out.println("Metal: " + zip3.isMetal);
        System.out.println("Plastic: " + zip3.isPlastic);
        System.out.println("Nylon: " + zip3.isNylon);
        System.out.println("Color: " + zip3.color);
        System.out.println("Teeth Count: " + zip3.teethCount);
        System.out.println("Slider Type: " + zip3.sliderType);
        System.out.println("Rust Resistant: " + zip3.isRustResistant);
        System.out.println("Heavy Duty: " + zip3.isHeavyDuty);
        System.out.println("Flexible: " + zip3.isFlexible);
        System.out.println("Usage Type: " + zip3.usageType);
        System.out.println("Price: $" + zip3.price);
        System.out.println("Washable: " + zip3.isWashable);
        System.out.println("Closure Type: " + zip3.closureType);
    }
}

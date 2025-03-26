public class DusterRunner {
    public static void main(String[] args) {
        Duster duster1 = new Duster("Scotch-Brite", "Green", "Microfiber", true, 150.0, 
                                    "Rectangular", 0.2, "Household Cleaning", "Plastic", 
                                    true, true, "All Surfaces", "India", false, 12, 
                                    "Medium", "Lemon", true);

        Duster duster2 = new Duster("3M", "Blue", "Feather", false, 200.0, 
                                    "Oval", 0.3, "Car Cleaning", "Wood", 
                                    true, false, "Glass", "USA", true, 18, 
                                    "Large", "None", false);

        Duster duster3 = new Duster("Jopasu", "Yellow", "Cotton", true, 350.0, 
                                    "Round", 0.4, "Automobile", "Metal", 
                                    false, true, "Dashboard", "Germany", false, 24, 
                                    "Compact", "Lavender", true);

        System.out.println("Duster 1 Details:");
        System.out.println("Brand: " + duster1.brand);
        System.out.println("Color: " + duster1.color);
        System.out.println("Material: " + duster1.material);
        System.out.println("Is Reusable: " + duster1.isReusable);
        System.out.println("Price: $" + duster1.price);
        System.out.println("Shape: " + duster1.shape);
        System.out.println("Weight: " + duster1.weight + " kg");
        System.out.println("Usage Type: " + duster1.usageType);
        System.out.println("Handle Material: " + duster1.handleMaterial);
        System.out.println("Is Eco-Friendly: " + duster1.isEcoFriendly);
        System.out.println("Is Washable: " + duster1.isWashable);
        System.out.println("Surface Type: " + duster1.surfaceType);
        System.out.println("Country of Origin: " + duster1.countryOfOrigin);
        System.out.println("Is Anti-Static: " + duster1.isAntiStatic);
        System.out.println("Durability: " + duster1.durabilityInMonths + " months");
        System.out.println("Size: " + duster1.size);
        System.out.println("Fragrance: " + duster1.fragrance);
        System.out.println("Has Extendable Handle: " + duster1.hasExtendableHandle);
        System.out.println("===========================================================");

        System.out.println("\nDuster 2 Details:");
        System.out.println("Brand: " + duster2.brand);
        System.out.println("Color: " + duster2.color);
        System.out.println("Material: " + duster2.material);
        System.out.println("Is Reusable: " + duster2.isReusable);
        System.out.println("Price: $" + duster2.price);
        System.out.println("Shape: " + duster2.shape);
        System.out.println("Weight: " + duster2.weight + " kg");
        System.out.println("Usage Type: " + duster2.usageType);
        System.out.println("Handle Material: " + duster2.handleMaterial);
        System.out.println("Is Eco-Friendly: " + duster2.isEcoFriendly);
        System.out.println("Is Washable: " + duster2.isWashable);
        System.out.println("Surface Type: " + duster2.surfaceType);
        System.out.println("Country of Origin: " + duster2.countryOfOrigin);
        System.out.println("Is Anti-Static: " + duster2.isAntiStatic);
        System.out.println("Durability: " + duster2.durabilityInMonths + " months");
        System.out.println("Size: " + duster2.size);
        System.out.println("Fragrance: " + duster2.fragrance);
        System.out.println("Has Extendable Handle: " + duster2.hasExtendableHandle);
        System.out.println("===========================================================");

        System.out.println("\nDuster 3 Details:");
        System.out.println("Brand: " + duster3.brand);
        System.out.println("Color: " + duster3.color);
        System.out.println("Material: " + duster3.material);
        System.out.println("Is Reusable: " + duster3.isReusable);
        System.out.println("Price: $" + duster3.price);
        System.out.println("Shape: " + duster3.shape);
        System.out.println("Weight: " + duster3.weight + " kg");
        System.out.println("Usage Type: " + duster3.usageType);
        System.out.println("Handle Material: " + duster3.handleMaterial);
        System.out.println("Is Eco-Friendly: " + duster3.isEcoFriendly);
        System.out.println("Is Washable: " + duster3.isWashable);
        System.out.println("Surface Type: " + duster3.surfaceType);
        System.out.println("Country of Origin: " + duster3.countryOfOrigin);
        System.out.println("Is Anti-Static: " + duster3.isAntiStatic);
        System.out.println("Durability: " + duster3.durabilityInMonths + " months");
        System.out.println("Size: " + duster3.size);
        System.out.println("Fragrance: " + duster3.fragrance);
        System.out.println("Has Extendable Handle: " + duster3.hasExtendableHandle);
    }
}

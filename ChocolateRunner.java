public class ChocolateRunner {
    public static void main(String[] args) {
        Chocolate chocolate1 = new Chocolate("Dairy Milk", "Cadbury", 150, 120, "Milk Chocolate", false, 30, "Milk Chocolate", 
                                            "India", false, false, false, false, 40, 550, "12-2025", false, true, false, "Cadbury Ltd.");

        Chocolate chocolate2 = new Chocolate("Ferrero Rocher", "Ferrero", 200, 450, "Hazelnut", true, 50, "Premium Chocolate", 
                                            "Italy", false, false, true, false, 35, 600, "06-2025", true, true, false, "Ferrero Spa");

        Chocolate chocolate3 = new Chocolate("Lindt Excellence", "Lindt", 100, 350, "Dark Chocolate", false, 85, "Dark Chocolate", 
                                            "Switzerland", true, true, false, false, 20, 450, "09-2025", true, true, true, "Lindt & Sprüngli");

        System.out.println("Chocolate 1 Details:");
        System.out.println("Name: " + chocolate1.name);
        System.out.println("Brand: " + chocolate1.brand);
        System.out.println("Weight: " + chocolate1.weight + " g");
        System.out.println("Price: Rs. " + chocolate1.price);
        System.out.println("Flavor: " + chocolate1.flavor);
        System.out.println("Contains Nuts: " + chocolate1.hasNuts);
        System.out.println("Cocoa Percentage: " + chocolate1.cocoaPercentage + "%");
        System.out.println("Type: " + chocolate1.type);
        System.out.println("Origin Country: " + chocolate1.originCountry);
        System.out.println("Vegan: " + chocolate1.isVegan);
        System.out.println("Gluten-Free: " + chocolate1.isGlutenFree);
        System.out.println("Has Caramel: " + chocolate1.hasCaramel);
        System.out.println("Has Wafer: " + chocolate1.hasWafer);
        System.out.println("Sugar Content: " + chocolate1.sugarContent + " g");
        System.out.println("Energy Value: " + chocolate1.energyValue + " kcal");
        System.out.println("Expiry Date: " + chocolate1.expiryDate);
        System.out.println("Handmade: " + chocolate1.isHandmade);
        System.out.println("Fair Trade Certified: " + chocolate1.isFairTradeCertified);
        System.out.println("Organic: " + chocolate1.isOrganic);
        System.out.println("Manufacturer: " + chocolate1.manufacturer);
        System.out.println("===========================================================");

        System.out.println("\nChocolate 2 Details:");
        System.out.println("Name: " + chocolate2.name);
        System.out.println("Brand: " + chocolate2.brand);
        System.out.println("Weight: " + chocolate2.weight + " g");
        System.out.println("Price: Rs. " + chocolate2.price);
        System.out.println("Flavor: " + chocolate2.flavor);
        System.out.println("Contains Nuts: " + chocolate2.hasNuts);
        System.out.println("Cocoa Percentage: " + chocolate2.cocoaPercentage + "%");
        System.out.println("Type: " + chocolate2.type);
        System.out.println("Origin Country: " + chocolate2.originCountry);
        System.out.println("Vegan: " + chocolate2.isVegan);
        System.out.println("Gluten-Free: " + chocolate2.isGlutenFree);
        System.out.println("Has Caramel: " + chocolate2.hasCaramel);
        System.out.println("Has Wafer: " + chocolate2.hasWafer);
        System.out.println("Sugar Content: " + chocolate2.sugarContent + " g");
        System.out.println("Energy Value: " + chocolate2.energyValue + " kcal");
        System.out.println("Expiry Date: " + chocolate2.expiryDate);
        System.out.println("Handmade: " + chocolate2.isHandmade);
        System.out.println("Fair Trade Certified: " + chocolate2.isFairTradeCertified);
        System.out.println("Organic: " + chocolate2.isOrganic);
        System.out.println("Manufacturer: " + chocolate2.manufacturer);
        System.out.println("===========================================================");

        System.out.println("\nChocolate 3 Details:");
        System.out.println("Name: " + chocolate3.name);
        System.out.println("Brand: " + chocolate3.brand);
        System.out.println("Weight: " + chocolate3.weight + " g");
        System.out.println("Price: Rs. " + chocolate3.price);
        System.out.println("Flavor: " + chocolate3.flavor);
        System.out.println("Contains Nuts: " + chocolate3.hasNuts);
        System.out.println("Cocoa Percentage: " + chocolate3.cocoaPercentage + "%");
        System.out.println("Type: " + chocolate3.type);
        System.out.println("Origin Country: " + chocolate3.originCountry);
        System.out.println("Vegan: " + chocolate3.isVegan);
        System.out.println("Gluten-Free: " + chocolate3.isGlutenFree);
        System.out.println("Has Caramel: " + chocolate3.hasCaramel);
        System.out.println("Has Wafer: " + chocolate3.hasWafer);
        System.out.println("Sugar Content: " + chocolate3.sugarContent + " g");
        System.out.println("Energy Value: " + chocolate3.energyValue + " kcal");
        System.out.println("Expiry Date: " + chocolate3.expiryDate);
        System.out.println("Handmade: " + chocolate3.isHandmade);
        System.out.println("Fair Trade Certified: " + chocolate3.isFairTradeCertified);
        System.out.println("Organic: " + chocolate3.isOrganic);
        System.out.println("Manufacturer: " + chocolate3.manufacturer);
    }
}

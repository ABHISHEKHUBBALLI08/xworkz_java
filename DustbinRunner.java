public class DustbinRunner {
    public static void main(String[] args) {
        Dustbin dustbin1 = new Dustbin("CleanMax", 30, "Plastic", "Blue", true, true, 
                                        60.5, 40.2, 799.99, "Cylindrical", "Rahul", 
                                        "12 MG Road, Mumbai", 9876543210L, true, 
                                        "rahul@email.com", true, "Amit");

        Dustbin dustbin2 = new Dustbin("EcoBin", 50, "Metal", "Green", true, true, 
                                        70.0, 50.0, 1299.99, "Rectangular", "Sneha", 
                                        "45 JP Nagar, Bangalore", 9988776655L, false, 
                                        "sneha@email.com", true, "Pooja");

        Dustbin dustbin3 = new Dustbin("SmartTrash", 20, "Stainless Steel", "Silver", true, false, 
                                        50.0, 30.0, 1899.99, "Square", "Karan", 
                                        "22 Indiranagar, Chennai", 9123456789L, true, 
                                        "karan@email.com", false, "Rajesh");

        System.out.println("Dustbin 1 Details:");
        System.out.println("Brand Name: " + dustbin1.brandName);
        System.out.println("Capacity: " + dustbin1.capacity + "L");
        System.out.println("Material: " + dustbin1.material);
        System.out.println("Color: " + dustbin1.color);
        System.out.println("Has Lid: " + dustbin1.hasLid);
        System.out.println("Is Recyclable: " + dustbin1.isRecyclable);
        System.out.println("Height: " + dustbin1.height + "cm");
        System.out.println("Width: " + dustbin1.width + "cm");
        System.out.println("Price: $" + dustbin1.price);
        System.out.println("Shape: " + dustbin1.shape);
        System.out.println("Owner Name: " + dustbin1.ownerName);
        System.out.println("Owner Address: " + dustbin1.ownerAddress);
        System.out.println("Phone Number: " + dustbin1.phoneNumber);
        System.out.println("Warranty: " + dustbin1.warranty);
        System.out.println("Email: " + dustbin1.email);
        System.out.println("Service Available: " + dustbin1.serviceAvailable);
        System.out.println("Customer Care Member: " + dustbin1.customerCareMemberName);
        System.out.println("===========================================================");

        System.out.println("\nDustbin 2 Details:");
        System.out.println("Brand Name: " + dustbin2.brandName);
        System.out.println("Capacity: " + dustbin2.capacity + "L");
        System.out.println("Material: " + dustbin2.material);
        System.out.println("Color: " + dustbin2.color);
        System.out.println("Has Lid: " + dustbin2.hasLid);
        System.out.println("Is Recyclable: " + dustbin2.isRecyclable);
        System.out.println("Height: " + dustbin2.height + "cm");
        System.out.println("Width: " + dustbin2.width + "cm");
        System.out.println("Price: $" + dustbin2.price);
        System.out.println("Shape: " + dustbin2.shape);
        System.out.println("Owner Name: " + dustbin2.ownerName);
        System.out.println("Owner Address: " + dustbin2.ownerAddress);
        System.out.println("Phone Number: " + dustbin2.phoneNumber);
        System.out.println("Warranty: " + dustbin2.warranty);
        System.out.println("Email: " + dustbin2.email);
        System.out.println("Service Available: " + dustbin2.serviceAvailable);
        System.out.println("Customer Care Member: " + dustbin2.customerCareMemberName);
        System.out.println("===========================================================");

        System.out.println("\nDustbin 3 Details:");
        System.out.println("Brand Name: " + dustbin3.brandName);
        System.out.println("Capacity: " + dustbin3.capacity + "L");
        System.out.println("Material: " + dustbin3.material);
        System.out.println("Color: " + dustbin3.color);
        System.out.println("Has Lid: " + dustbin3.hasLid);
        System.out.println("Is Recyclable: " + dustbin3.isRecyclable);
        System.out.println("Height: " + dustbin3.height + "cm");
        System.out.println("Width: " + dustbin3.width + "cm");
        System.out.println("Price: $" + dustbin3.price);
        System.out.println("Shape: " + dustbin3.shape);
        System.out.println("Owner Name: " + dustbin3.ownerName);
        System.out.println("Owner Address: " + dustbin3.ownerAddress);
        System.out.println("Phone Number: " + dustbin3.phoneNumber);
        System.out.println("Warranty: " + dustbin3.warranty);
        System.out.println("Email: " + dustbin3.email);
        System.out.println("Service Available: " + dustbin3.serviceAvailable);
        System.out.println("Customer Care Member: " + dustbin3.customerCareMemberName);
    }
}

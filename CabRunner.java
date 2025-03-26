public class CabRunner {
    public static void main(String[] args) {
        Cab cab1 = new Cab("KA01AB1234", "Ramesh", "Toyota Etios", "White", true, 
                            12.5, 50000.0, 4, "Sunil", "45 MG Road, Bangalore", 
                            9876543210L, true, "Petrol", true, 4.8, 
                            "Bangalore City", true, "Ola");

        Cab cab2 = new Cab("MH02XY5678", "Suresh", "Honda Amaze", "Black", false, 
                            10.0, 75000.0, 4, "Amit", "12 JP Nagar, Mumbai", 
                            9988776655L, true, "Diesel", false, 4.5, 
                            "Mumbai Suburbs", true, "Uber");

        Cab cab3 = new Cab("DL03PQ7890", "Rajesh", "Maruti Swift Dzire", "Blue", true, 
                            11.0, 62000.0, 4, "Karan", "22 Connaught Place, Delhi", 
                            9123456789L, true, "CNG", true, 4.7, 
                            "Delhi NCR", false, "Rapido");

        System.out.println("Cab 1 Details:");
        System.out.println("Cab Number: " + cab1.cabNumber);
        System.out.println("Driver Name: " + cab1.driverName);
        System.out.println("Cab Model: " + cab1.cabModel);
        System.out.println("Cab Color: " + cab1.cabColor);
        System.out.println("Is AC Available: " + cab1.isAC);
        System.out.println("Fare per Km: $" + cab1.farePerKm);
        System.out.println("Total Earnings: $" + cab1.totalEarnings);
        System.out.println("Seating Capacity: " + cab1.seatingCapacity);
        System.out.println("Owner Name: " + cab1.ownerName);
        System.out.println("Owner Address: " + cab1.ownerAddress);
        System.out.println("Phone Number: " + cab1.phoneNumber);
        System.out.println("Has GPS: " + cab1.hasGPS);
        System.out.println("Fuel Type: " + cab1.fuelType);
        System.out.println("Is Available: " + cab1.isAvailable);
        System.out.println("Rating: " + cab1.rating);
        System.out.println("Service Area: " + cab1.serviceArea);
        System.out.println("Has Music System: " + cab1.hasMusicSystem);
        System.out.println("Company Name: " + cab1.companyName);
        System.out.println("===========================================================");

        System.out.println("\nCab 2 Details:");
        System.out.println("Cab Number: " + cab2.cabNumber);
        System.out.println("Driver Name: " + cab2.driverName);
        System.out.println("Cab Model: " + cab2.cabModel);
        System.out.println("Cab Color: " + cab2.cabColor);
        System.out.println("Is AC Available: " + cab2.isAC);
        System.out.println("Fare per Km: $" + cab2.farePerKm);
        System.out.println("Total Earnings: $" + cab2.totalEarnings);
        System.out.println("Seating Capacity: " + cab2.seatingCapacity);
        System.out.println("Owner Name: " + cab2.ownerName);
        System.out.println("Owner Address: " + cab2.ownerAddress);
        System.out.println("Phone Number: " + cab2.phoneNumber);
        System.out.println("Has GPS: " + cab2.hasGPS);
        System.out.println("Fuel Type: " + cab2.fuelType);
        System.out.println("Is Available: " + cab2.isAvailable);
        System.out.println("Rating: " + cab2.rating);
        System.out.println("Service Area: " + cab2.serviceArea);
        System.out.println("Has Music System: " + cab2.hasMusicSystem);
        System.out.println("Company Name: " + cab2.companyName);
        System.out.println("===========================================================");

        System.out.println("\nCab 3 Details:");
        System.out.println("Cab Number: " + cab3.cabNumber);
        System.out.println("Driver Name: " + cab3.driverName);
        System.out.println("Cab Model: " + cab3.cabModel);
        System.out.println("Cab Color: " + cab3.cabColor);
        System.out.println("Is AC Available: " + cab3.isAC);
        System.out.println("Fare per Km: $" + cab3.farePerKm);
        System.out.println("Total Earnings: $" + cab3.totalEarnings);
        System.out.println("Seating Capacity: " + cab3.seatingCapacity);
        System.out.println("Owner Name: " + cab3.ownerName);
        System.out.println("Owner Address: " + cab3.ownerAddress);
        System.out.println("Phone Number: " + cab3.phoneNumber);
        System.out.println("Has GPS: " + cab3.hasGPS);
        System.out.println("Fuel Type: " + cab3.fuelType);
        System.out.println("Is Available: " + cab3.isAvailable);
        System.out.println("Rating: " + cab3.rating);
        System.out.println("Service Area: " + cab3.serviceArea);
        System.out.println("Has Music System: " + cab3.hasMusicSystem);
        System.out.println("Company Name: " + cab3.companyName);
    }
}

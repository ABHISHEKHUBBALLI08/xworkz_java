public class TabRunner {
    public static void main(String[] args) {
        Tab tab1 = new Tab("Samsung", 10.5, "Android", 256, "Silver", 35000, "WiFi+LTE", 
                           "Snapdragon", 8, 7000, "USB-C", "Amoled", "S-Pen", true);
        
        Tab tab2 = new Tab("Apple", 11.0, "iOS", 512, "Space Gray", 85000, "WiFi", 
                           "M1", 16, 7600, "Lightning", "Liquid Retina", "Apple Pencil", true);
        
        Tab tab3 = new Tab("Lenovo", 10.3, "Android", 128, "Black", 25000, "WiFi", 
                           "MediaTek", 6, 5000, "USB-C", "IPS LCD", "No Pen", false);
        
        System.out.println("Tab 1 Details:");
        System.out.println("Brand: " + tab1.brand);
        System.out.println("Screen Size: " + tab1.screenSize + " inches");
        System.out.println("Operating System: " + tab1.os);
        System.out.println("Storage: " + tab1.storage + " GB");
        System.out.println("Color: " + tab1.color);
        System.out.println("Price: Rs. " + tab1.price);
        System.out.println("Connectivity: " + tab1.connectivity);
        System.out.println("Processor: " + tab1.processor);
        System.out.println("RAM: " + tab1.ram + " GB");
        System.out.println("Battery Capacity: " + tab1.batteryCapacity + " mAh");
        System.out.println("Charging Port: " + tab1.chargingPort);
        System.out.println("Display Type: " + tab1.displayType);
        System.out.println("Stylus: " + tab1.stylusSupport);
        System.out.println("===========================================================");
        
        System.out.println("\nTab 2 Details:");
        System.out.println("Brand: " + tab2.brand);
        System.out.println("Screen Size: " + tab2.screenSize + " inches");
        System.out.println("Operating System: " + tab2.os);
        System.out.println("Storage: " + tab2.storage + " GB");
        System.out.println("Color: " + tab2.color);
        System.out.println("Price: Rs. " + tab2.price);
        System.out.println("Connectivity: " + tab2.connectivity);
        System.out.println("Processor: " + tab2.processor);
        System.out.println("RAM: " + tab2.ram + " GB");
        System.out.println("Battery Capacity: " + tab2.batteryCapacity + " mAh");
        System.out.println("Charging Port: " + tab2.chargingPort);
        System.out.println("Display Type: " + tab2.displayType);
        System.out.println("Stylus: " + tab2.stylusSupport);
        System.out.println("===========================================================");
        
        System.out.println("\nTab 3 Details:");
        System.out.println("Brand: " + tab3.brand);
        System.out.println("Screen Size: " + tab3.screenSize + " inches");
        System.out.println("Operating System: " + tab3.os);
        System.out.println("Storage: " + tab3.storage + " GB");
        System.out.println("Color: " + tab3.color);
        System.out.println("Price: Rs. " + tab3.price);
        System.out.println("Connectivity: " + tab3.connectivity);
        System.out.println("Processor: " + tab3.processor);
        System.out.println("RAM: " + tab3.ram + " GB");
        System.out.println("Battery Capacity: " + tab3.batteryCapacity + " mAh");
        System.out.println("Charging Port: " + tab3.chargingPort);
        System.out.println("Display Type: " + tab3.displayType);
        System.out.println("Stylus: " + tab3.stylusSupport);
    }
}

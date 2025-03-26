public class Rocket {
    String name;
    String manufacturer;
    double height; 
    double weight; 
    double payloadCapacity; 
    double thrust; 
    double speed;
    int stages;
    boolean isReusable;
    String fuelType;
    String launchSite;
    String missionType; 
    int successfulLaunches;
    boolean isActive;

    public Rocket(String name, String manufacturer, double height, double weight, double payloadCapacity, double thrust,
                  double speed, int stages, boolean isReusable, String fuelType, String launchSite, String missionType,
                  int successfulLaunches, boolean isActive) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.height = height;
        this.weight = weight;
        this.payloadCapacity = payloadCapacity;
        this.thrust = thrust;
        this.speed = speed;
        this.stages = stages;
        this.isReusable = isReusable;
        this.fuelType = fuelType;
        this.launchSite = launchSite;
        this.missionType = missionType;
        this.successfulLaunches = successfulLaunches;
        this.isActive = isActive;
    }
}

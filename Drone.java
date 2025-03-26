public class Drone {
    String model;
    String manufacturer;
    double weight;
    double maxSpeed;
    double flightTime;
    double range;
    boolean isAutonomous;
    String cameraQuality;
    String batteryType;
    String purpose;
    boolean hasGPS;
    boolean obstacleAvoidance;

    public Drone(String model, String manufacturer, double weight, double maxSpeed, double flightTime, double range,
                 boolean isAutonomous, String cameraQuality, String batteryType, String purpose,
                 boolean hasGPS, boolean obstacleAvoidance) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.flightTime = flightTime;
        this.range = range;
        this.isAutonomous = isAutonomous;
        this.cameraQuality = cameraQuality;
        this.batteryType = batteryType;
        this.purpose = purpose;
        this.hasGPS = hasGPS;
        this.obstacleAvoidance = obstacleAvoidance;
    }
}

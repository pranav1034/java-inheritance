// Superclass Device
class Device {
    protected String deviceId;
    protected String status;

    public Device(String deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    public void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}

// Subclass Thermostat (inherits from Device)
class Thermostat extends Device {
    final private double temperatureSetting;

    public Thermostat(String deviceId, String status, double temperatureSetting) {
        super(deviceId, status);  // Call superclass constructor
        this.temperatureSetting = temperatureSetting;
    }

    @Override
    public void displayStatus() {
        super.displayStatus();  // Call superclass method
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }

    public static void main(String[] args) {
        Thermostat thermostat = new Thermostat("TH000", "Online", 28.5);

        // Display device details
        thermostat.displayStatus();
    }
}

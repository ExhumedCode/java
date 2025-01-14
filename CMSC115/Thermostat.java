public class Thermostat {
    // Data fields
    private double temperature;
    private boolean isOn;

    // Constructor
    public Thermostat(double startTemp) {
        this.temperature = startTemp;
        this.isOn = true;
    }

    // Method
    public void adjustTemp(double newTemp) {
        this.temperature = newTemp;
        System.out.println("Temperature set to: " + temperature + "°F");
    }
}

/* File: Thermostat.java */
public class Thermostat implements Device {
    protected String id;
    protected double temperature;

    public Thermostat(String id) {
        this.id = id;
        this.temperature = 22.0; 
    }
    
    public String getId() {
        return id;
    }

    @Override
    public void turnOn() {
        System.out.println("Thermostat " + id + " is activated.");
    }
    
    @Override
    public void turnOff() {
        System.out.println("Thermostat " + id + " is deactivated.");
    }
    
    @Override
    public String getStatus() {
        return "Thermostat " + id + " temperature: " + temperature + "°C";
    }
    
    public void setTemperature(double temperature) {
        this.temperature = temperature;
        System.out.println("Thermostat " + id + " set to " + temperature + "°C");
    }
}


public class AdvancedThermostat extends Thermostat {
    public AdvancedThermostat(String id) {
        super(id);
    }
    
    @Override
    public void setTemperature(double temperature) {
        System.out.println("Advanced Thermostat " + getId() + " adjusting temperature with AI.");
        super.setTemperature(temperature);
    }
}

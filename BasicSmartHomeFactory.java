public class BasicSmartHomeFactory extends SmartHomeFactory {
    @Override
    public Device createLight(String id) {
        return new Light(id);
    }
    
    @Override
    public Device createThermostat(String id) {
        return new Thermostat(id);
    }
    
    @Override
    public Device createSecurityCamera(String id) {
        return new SecurityCamera(id);
    }
}

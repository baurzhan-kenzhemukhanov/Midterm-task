
public class AdvancedSmartHomeFactory extends SmartHomeFactory {
    @Override
    public Device createLight(String id) {
        return new AdvancedLight(id);
    }
    
    @Override
    public Device createThermostat(String id) {
        return new AdvancedThermostat(id);
    }
    
    @Override
    public Device createSecurityCamera(String id) {
        return new AdvancedSecurityCamera(id);
    }
}


public abstract class SmartHomeFactory {
    public abstract Device createLight(String id);
    public abstract Device createThermostat(String id);
    public abstract Device createSecurityCamera(String id);
}

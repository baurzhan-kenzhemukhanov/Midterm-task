
public class AdvancedLight extends Light {
    public AdvancedLight(String id) {
        super(id);
    }
    
    @Override
    public void turnOn() {
        System.out.println("Advanced Light " + getId() + " is now ON with enhanced brightness control.");
        super.turnOn();
    }
}

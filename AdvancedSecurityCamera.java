
public class AdvancedSecurityCamera extends SecurityCamera {
    public AdvancedSecurityCamera(String id) {
        super(id);
    }
    
    @Override
    public void turnOn() {
        System.out.println("Advanced Security Camera " + getId() + " is now ON with motion detection.");
        super.turnOn();
    }
}

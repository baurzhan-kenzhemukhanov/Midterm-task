
public class Light implements Device {
    protected String id;
    protected boolean isOn;

    public Light(String id) {
        this.id = id;
        this.isOn = false;
    }
    
    public String getId() {
        return id;
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println("Light " + id + " is turned ON.");
    }
    
    @Override
    public void turnOff() {
        isOn = false;
        System.out.println("Light " + id + " is turned OFF.");
    }
    
    @Override
    public String getStatus() {
        return "Light " + id + " status: " + (isOn ? "ON" : "OFF");
    }
}

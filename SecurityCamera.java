
public class SecurityCamera implements Device {
    protected String id;
    protected boolean recording;

    public SecurityCamera(String id) {
        this.id = id;
        this.recording = false;
    }
    
    public String getId() {
        return id;
    }

    @Override
    public void turnOn() {
        recording = true;
        System.out.println("Security Camera " + id + " started recording.");
    }
    
    @Override
    public void turnOff() {
        recording = false;
        System.out.println("Security Camera " + id + " stopped recording.");
    }
    
    @Override
    public String getStatus() {
        return "Security Camera " + id + " is " + (recording ? "recording" : "not recording");
    }
}

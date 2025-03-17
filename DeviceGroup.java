
import java.util.ArrayList;
import java.util.List;

public class DeviceGroup implements Device {
    private String name;
    private List<Device> devices = new ArrayList<>();

    public DeviceGroup(String name) {
        this.name = name;
    }
    
    public void addDevice(Device device) {
        devices.add(device);
    }
    
    public void removeDevice(Device device) {
        devices.remove(device);
    }
    
    @Override
    public void turnOn() {
        System.out.println("Turning ON all devices in " + name);
        for (Device d : devices) {
            d.turnOn();
        }
    }
    
    @Override
    public void turnOff() {
        System.out.println("Turning OFF all devices in " + name);
        for (Device d : devices) {
            d.turnOff();
        }
    }
    
    @Override
    public String getStatus() {
        StringBuilder sb = new StringBuilder();
        sb.append("Group " + name + " Status:\n");
        for (Device d : devices) {
            sb.append(" - " + d.getStatus() + "\n");
        }
        return sb.toString();
    }
}

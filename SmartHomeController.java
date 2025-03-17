
import java.util.ArrayList;
import java.util.List;

public class SmartHomeController {
    private List<Device> allDevices;

    public SmartHomeController() {
        allDevices = new ArrayList<>();
    }
    
    public void addDevice(Device device) {
        allDevices.add(device);
    }
    
    public void turnAllDevicesOn() {
        System.out.println("Facade: Turning on all devices.");
        for (Device d : allDevices) {
            d.turnOn();
        }
    }
    
    public void turnAllDevicesOff() {
        System.out.println("Facade: Turning off all devices.");
        for (Device d : allDevices) {
            d.turnOff();
        }
    }
    
    public void setGlobalTemperature(double temperature) {
        System.out.println("Facade: Setting global temperature to " + temperature + "°C.");
        for (Device d : allDevices) {
            if (d instanceof Thermostat) {
                ((Thermostat)d).setTemperature(temperature);
            }
        }
    }
    
    public void getSystemStatusReport() {
        System.out.println("---- System Status Report ----");
        for (Device d : allDevices) {
            System.out.println(d.getStatus());
        }
    }
}

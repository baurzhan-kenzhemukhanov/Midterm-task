
public class Demo {
    public static void main(String[] args) {

        SmartHomeFactory basicFactory = new BasicSmartHomeFactory();
        SmartHomeFactory advancedFactory = new AdvancedSmartHomeFactory();
        

        Device basicLight = basicFactory.createLight("BasicLight1");
        Device advancedLight = advancedFactory.createLight("AdvancedLight1");
        Device basicThermostat = basicFactory.createThermostat("BasicThermostat1");
        Device advancedThermostat = advancedFactory.createThermostat("AdvancedThermostat1");
        Device securityCamera = basicFactory.createSecurityCamera("Camera1");

        DeviceGroup livingRoom = new DeviceGroup("Living Room");
        livingRoom.addDevice(basicLight);
        livingRoom.addDevice(advancedLight);
        livingRoom.addDevice(basicThermostat);
        livingRoom.addDevice(securityCamera);
        

        Device scheduledLight = new ScheduledOperationDecorator(basicLight, "Turn on at 6 PM");

        livingRoom.removeDevice(basicLight);
        livingRoom.addDevice(scheduledLight);

        LegacyDoorLock legacyLock = new LegacyDoorLock();
        Device doorLockAdapter = new LegacyDoorLockAdapter(legacyLock);
        livingRoom.addDevice(doorLockAdapter);

        SmartHomeController controller = new SmartHomeController();

        controller.addDevice(livingRoom);
        controller.addDevice(advancedThermostat);

        System.out.println("--- Turning on all devices ---");
        controller.turnAllDevicesOn();
        
        System.out.println("--- Setting global temperature ---");
        controller.setGlobalTemperature(24.5);
        
        System.out.println("--- System Status Report ---");
        controller.getSystemStatusReport();
        
        System.out.println("--- Turning off all devices ---");
        controller.turnAllDevicesOff();
    }
}

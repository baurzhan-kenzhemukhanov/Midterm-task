
public class ScheduledOperationDecorator extends DeviceDecorator {
    private String scheduleInfo;

    public ScheduledOperationDecorator(Device device, String scheduleInfo) {
        super(device);
        this.scheduleInfo = scheduleInfo;
    }

    @Override
    public void turnOn() {
        System.out.println("Scheduled operation: " + scheduleInfo);
        super.turnOn();
    }
}

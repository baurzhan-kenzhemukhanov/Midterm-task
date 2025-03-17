
public class LegacyDoorLockAdapter implements Device {
    private LegacyDoorLock legacyDoorLock;
    
    public LegacyDoorLockAdapter(LegacyDoorLock legacyDoorLock) {
        this.legacyDoorLock = legacyDoorLock;
    }
    
    @Override
    public void turnOn() {

        legacyDoorLock.unlockDoor();
    }
    
    @Override
    public void turnOff() {

        legacyDoorLock.lockDoor();
    }
    
    @Override
    public String getStatus() {
        return "Legacy Door Lock Adapter: status unknown";
    }
}

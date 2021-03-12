package academy.pocu.comp2500.lab8;

import java.util.ArrayList;

public abstract class SmartDevice {
    protected int tick;
    protected ArrayList<Boolean> isOnList = new ArrayList<>();
    protected int lastUpdatedTickTime;
    protected SmartDeviceType smartDeviceType;

    public SmartDevice(SmartDeviceType smartDeviceType) {
        tick = 0;
        lastUpdatedTickTime = 0;
        isOnList.add(false);
        this.smartDeviceType = smartDeviceType;
    }
    public int getTick() {
        return tick;
    }
    public int getLastUpdatedTickTime() {
        return lastUpdatedTickTime;
    }
    public boolean isOn() {
        if (isOnList.get(tick) == false) {
            return false;
        }
        return true;
    }
    public abstract void onTick();
    public int getTicksSinceLastUpdate() {
        return tick - lastUpdatedTickTime;
    }

}

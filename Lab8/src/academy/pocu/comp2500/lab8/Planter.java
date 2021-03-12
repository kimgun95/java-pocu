package academy.pocu.comp2500.lab8;

import java.util.ArrayList;
import java.util.LinkedList;

public class Planter {
    private int amountOfWater;
    private ArrayList<SmartDevice> smartDevices = new ArrayList<>();

    public Planter(int amountOfWater) {
        this.amountOfWater = amountOfWater;
    }
    public int getWaterAmount() {
        return amountOfWater;
    }
    protected void setWaterAmount(int amountOfWater) {
        this.amountOfWater = amountOfWater;
    }

    public void installSmartDevice(SmartDevice smartDevice) {
        smartDevices.add(smartDevice);
    }

    public void tick() {
        for (SmartDevice sd : smartDevices) {
            if (sd.smartDeviceType == SmartDeviceType.DRAINER) {
                Drainer drainer = (Drainer) sd;
                drainer.detect(amountOfWater);
            }
        }
        for (SmartDevice sd : smartDevices) {
            if (sd.smartDeviceType == SmartDeviceType.SPRINKLER) {
                Sprinkler sprinkler = (Sprinkler) sd;
                sprinkler.spray(this);
            } else if (sd.smartDeviceType == SmartDeviceType.DRAINER) {
                Drainer drainer = (Drainer) sd;
                drainer.drain(this);
            }
        }
        if (amountOfWater >= 2) {
            amountOfWater -= 2;
        } else if (amountOfWater == 1) {
            amountOfWater -= 1;
        }
    }
}

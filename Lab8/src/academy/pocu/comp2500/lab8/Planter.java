package academy.pocu.comp2500.lab8;

import java.util.ArrayList;

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
        ArrayList<Sprinkler> sprinklers = new ArrayList<>();
        ArrayList<Drainer> drainers = new ArrayList<>();
        for (SmartDevice sd : smartDevices) {
            if (sd.smartDeviceType == SmartDeviceType.SPRINKLER) {
                Sprinkler sprinkler = (Sprinkler) sd;
                sprinklers.add(sprinkler);
            } else if (sd.smartDeviceType == SmartDeviceType.DRAINER) {
                Drainer drainer = (Drainer) sd;
                drainers.add(drainer);
            }
        }

        for (Drainer d : drainers) {
            d.drain(this);
        }
        for (Sprinkler s : sprinklers) {
            s.spray(this);
        }
        if (amountOfWater >= 2) {
            amountOfWater -= 2;
        } else if (amountOfWater == 1) {
            amountOfWater -= 1;
        }
    }
}

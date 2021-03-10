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

    }
}

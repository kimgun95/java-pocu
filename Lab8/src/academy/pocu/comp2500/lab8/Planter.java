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
        // 첫 시작에 drainer가 작동할 수 있는지 여부를 확인
        for (SmartDevice sd : smartDevices) {
            if (sd.smartDeviceType == SmartDeviceType.DRAINER) {
                Drainer drainer = (Drainer) sd;
                drainer.detect(amountOfWater);
            }
        }
        // 각각 sprinkler와 drainer를 동작시킨다.
        for (SmartDevice sd : smartDevices) {
            if (sd.smartDeviceType == SmartDeviceType.SPRINKLER) {
                Sprinkler sprinkler = (Sprinkler) sd;
                sprinkler.spray(this);
            } else if (sd.smartDeviceType == SmartDeviceType.DRAINER) {
                Drainer drainer = (Drainer) sd;
                drainer.drain(this);
            }
        }
        // Planter는 1 틱당 2L의 물을 소비
        if (amountOfWater >= 2) {
            amountOfWater -= 2;
        } else if (amountOfWater == 1) {
            amountOfWater -= 1;
        }
    }
}

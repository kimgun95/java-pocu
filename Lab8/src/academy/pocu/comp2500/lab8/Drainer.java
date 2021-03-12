package academy.pocu.comp2500.lab8;

import java.util.LinkedList;

public class Drainer extends SmartDevice implements IDrainable, IWaterDetectable {
    private int waterStandard;
    private LinkedList<Boolean> drainerOnList = new LinkedList<>();

    public Drainer(int waterStandard) {
        super(SmartDeviceType.DRAINER);
        this.waterStandard = waterStandard;
    }
    public int getWaterStandard() {
        return waterStandard;
    }
    public void onTick() {
        super.tick += 1;
    }

    // Planter에 있는 물의 양을 감지하여 물이 기준 이상이면
    // 1틱마다 Planter에서 7L의 물을 배수, 물이 기준 미만이 되면 작동 중지
    public void drain(Planter planter) {
        onTick();
        if (drainerOnList.getFirst()) {
            if (planter.getWaterAmount() >= 7) {
                planter.setWaterAmount(planter.getWaterAmount() - 7);
            }
            isOnList.add(true);
            if (isOnList.get(super.tick - 1) == false) {
                super.lastUpdatedTickTime = super.tick;
            }
        } else {
            isOnList.add(false);
            if (isOnList.get(super.tick - 1) == true) {
                super.lastUpdatedTickTime = super.tick;
            }
        }
        drainerOnList.removeFirst();
    }
    // 물의 양을 받아와 기준 선 보다 높다면 작동(true) 아니면(false)
    public void detect(final int waterLevel) {
        if (waterStandard <= waterLevel) {
            drainerOnList.add(true);
        } else {
            drainerOnList.add(false);
        }
    }
}

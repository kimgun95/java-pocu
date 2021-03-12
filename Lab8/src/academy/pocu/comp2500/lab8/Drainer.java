package academy.pocu.comp2500.lab8;

public class Drainer extends SmartDevice implements IDrainable {
    private int waterStandard;

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
        if (planter.getDrainerIsOn() == true) {
            if (planter.getWaterAmount() >= 7) {
                planter.setWaterAmount(planter.getWaterAmount() - 7);
            } else if (planter.getWaterAmount() < 7) {
                planter.setWaterAmount(0);
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
    }
}

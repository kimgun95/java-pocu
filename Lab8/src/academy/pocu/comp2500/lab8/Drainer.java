package academy.pocu.comp2500.lab8;

public class Drainer extends SmartDevice implements IDrainable{
    private int waterStandard;

    public Drainer(int waterStandard) {
        super();
        this.waterStandard = waterStandard;
    }

    public void onTick() {
        super.tick += 1;

    }

    // Planter에 있는 물의 양을 감지하여 물이 기준 이상이면
    // 1틱마다 Planter에서 7L의 물을 배수, 물이 기준 미만이 되면 작동 중지
    public void drain(Planter planter) {
        if (planter.getWaterAmount() >= waterStandard) {
            planter.setWaterAmount(planter.getWaterAmount() - 7);
        }
    }
}

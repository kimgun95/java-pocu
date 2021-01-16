public class FlowerPot {
    private boolean alive = true;
    private final int minDailyWaterInMl;
    private int dailyWaterReceived = 0;

    public FlowerPot(int minDailyWaterInMl) {
        this.minDailyWaterInMl = minDailyWaterInMl;
    }

    public  int getMinDailyWaterInMl() {
        return this.minDailyWaterInMl;
    }

    public void addWater(WaterSpray spray) {
        SprayHead head = spray.getHead();
        SprayBottle body = spray.getBody();

        int water = body.getRemainingWater();
        head.sprayFrom(body);
        water -= body.getRemainingWater();
        dailyWaterReceived += water;
    }
    public void liveAnotherDay() {
        if (dailyWaterReceived < minDailyWaterInMl) {
            alive = false;
        }
        dailyWaterReceived = 0;
    }
}

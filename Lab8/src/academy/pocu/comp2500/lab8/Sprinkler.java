package academy.pocu.comp2500.lab8;

import java.util.ArrayList;

public class Sprinkler extends SmartDevice implements ISprayable {
    private ArrayList<Schedule> schedules = new ArrayList<>();

    public Sprinkler() {
        super();
    }

    public void addSchedule(Schedule schedule) {
        schedules.add(schedule);
    }

    public void onTick() {
        super.tick += 1;
        int check = 0;
        for (Schedule sch : schedules) {
            int tickTime = sch.getTickTime();
            int tickCount = sch.getTickCount();

            if (tickTime == 0) {
                continue;
            }
            if (tickTime <= super.tick &&
                    tickTime + tickCount - 1 >= super.tick &&
                    super.lastUpdatedTickTime <= tickTime) {
                isOnList.add(true);
                check = 1;
                if (tickTime == super.tick || tickTime + tickCount - 1 == super.tick) {
                    super.lastUpdatedTickTime = super.tick;
                }
                break;
            }
        }
        if (check == 0) {
            isOnList.add(false);
        }
    }
    // 1 틱마다 15L의 물을 Planter에 분사
    public void spray(Planter planter) {
        if (isOn() == true) {
            planter.setWaterAmount(planter.getWaterAmount() - 15);
        }
    }
}

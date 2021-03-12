package academy.pocu.comp2500.lab8;

import java.util.ArrayList;
import java.util.HashSet;

public class Sprinkler extends SmartDevice implements ISprayable {
    private ArrayList<Schedule> schedules = new ArrayList<>();
    private boolean isFinished;
    private HashSet<Integer> badTickTime = new HashSet<>();

    public Sprinkler() {
        super(SmartDeviceType.SPRINKLER);
        isFinished = false;
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
            if (tickTime > super.tick) {
                break;
            }
            if (isFinished == true) {
                super.lastUpdatedTickTime = super.tick;
                isFinished = false;
            }
            if (tickTime <= super.tick &&
                    tickTime + tickCount - 1 >= super.tick &&
                    super.lastUpdatedTickTime <= tickTime) {
                if (super.lastUpdatedTickTime == super.tick) {
                    badTickTime.add(super.tick);
                    continue;
                }
                if (badTickTime.contains(tickTime)) {
                    continue;
                }
                isOnList.add(true);
                check = 1;
                if (isOnList.get(super.tick - 1) == false) {
                    super.lastUpdatedTickTime = super.tick;
                }
                if (super.tick == tickTime + tickCount - 1) {
                    isFinished = true;
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
        this.onTick();
        if (isOn() == true) {
            planter.setWaterAmount(planter.getWaterAmount() + 15);
        }
    }
}

package academy.pocu.comp2500.lab8;

import java.util.ArrayList;
import java.util.HashSet;

public class Sprinkler extends SmartDevice implements ISprayable {
    private ArrayList<Schedule> schedules = new ArrayList<>();
    private boolean isFinished;
    private HashSet<Integer> badTickTime = new HashSet<>();
    private HashSet<Integer> goodTickTime = new HashSet<>();

    public Sprinkler() {
        super(SmartDeviceType.SPRINKLER);
        isFinished = false;
    }
    public ArrayList<Schedule> getSchedules() {
        return schedules;
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
            // tickTime이 0인 스케줄은 무시
            if (tickTime == 0) {
                continue;
            }
            // tickTime이 현재 tick 보다 크다면 빠르게 break
            if (tickTime > super.tick) {
                break;
            }
            // 이전 tick에서 스케줄러가 종료됨을 알려줌. 변수 최신화
            if (isFinished == true) {
                super.lastUpdatedTickTime = super.tick;
                isFinished = false;
            }
            // 스케줄러가 유효할 때
            if (tickTime <= super.tick &&
                    tickTime + tickCount - 1 >= super.tick &&
                    super.lastUpdatedTickTime <= tickTime) {
                // 위 조건에서 유일하게 유효하지 않을 때 1
                if (super.lastUpdatedTickTime == super.tick) {
                    badTickTime.add(super.tick);
                    continue;
                }
                if (badTickTime.contains(tickTime)) {
                    continue;
                }
                // 스케줄러의 tickTime을 따로 저장
                if (super.tick == tickTime) {
                    goodTickTime.add(super.tick);
                }
                if (goodTickTime.contains(tickTime)) {
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
            } else if (tickTime <= super.tick &&
                    tickTime + tickCount - 1 >= super.tick) {
                // 스케줄러가 유효하지 않을 때 2
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

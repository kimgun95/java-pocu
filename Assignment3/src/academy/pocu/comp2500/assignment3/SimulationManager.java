package academy.pocu.comp2500.assignment3;

import java.util.ArrayList;

public class SimulationManager {
    private static SimulationManager instance;
    private ArrayList<Unit> units = new ArrayList<>();

    public static SimulationManager getInstance() {
        if (instance == null) {
            instance = new SimulationManager();
        }
        return instance;
    }

    public ArrayList<Unit> getUnits() {
        return units;
    }

    public void spawn(Unit unit) {
        units.add(unit);
        unit.onSpawn();
    }
    // 매개변수 자료형 변경 가능
    public void registerThinkable(Unit thinkable) {

    }
    // 매개변수 자료형 변경 가능
    public void registerMovable(Unit movable) {

    }
    // 매개변수 자료형 변경 가능
    public void registerCollisionEventListener(Unit listener) {

    }

    public void update() {

    }
}

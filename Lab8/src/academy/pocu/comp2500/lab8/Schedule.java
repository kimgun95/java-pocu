package academy.pocu.comp2500.lab8;

public final class Schedule {
    private final int tickTime;
    private final int tickCount;

    public Schedule(int tickTime, int tickCount) {
        this.tickTime = tickTime;
        this.tickCount = tickCount;
    }
    public int getTickTime() {
        return tickTime;
    }
    public int getTickCount() {
        return tickCount;
    }
}

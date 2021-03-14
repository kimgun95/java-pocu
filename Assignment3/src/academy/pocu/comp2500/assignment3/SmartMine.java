package academy.pocu.comp2500.assignment3;

public class SmartMine extends Unit {
    private int deadCount;
    private int detectCount;

    public SmartMine(IntVector2D position, int deadCount, int detectCount) {
        super(position, UnitType.SMART_MINE);
        this.deadCount = deadCount;
        this.detectCount = detectCount;
    }
}

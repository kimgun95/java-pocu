package academy.pocu.comp2500.assignment3;

public class Mine extends Unit {
    private int deadCount;

    public Mine(IntVector2D position, int deadCount) {
        super(position, UnitType.MINE);
        this.deadCount = deadCount;
    }
}

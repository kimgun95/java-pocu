package academy.pocu.comp2500.assignment3;

public class Tank extends Unit {

    public Tank(IntVector2D position) {
        super(position);
        super.unitType = UnitType.TANK;
    }
}

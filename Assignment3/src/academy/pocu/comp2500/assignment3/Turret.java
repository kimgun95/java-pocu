package academy.pocu.comp2500.assignment3;

public class Turret extends Unit {

    public Turret(IntVector2D position) {
        super(position);
        super.unitType = UnitType.TURRET;
    }
}

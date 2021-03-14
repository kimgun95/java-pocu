package academy.pocu.comp2500.assignment3;

import java.util.ArrayList;

public abstract class Unit {
    private IntVector2D position;
    private AttackIntent attackIntent;
    protected UnitType unitType;
    private char symbol;
    private int hp;
    private int vision;
    private int areaOfEffect;
    private int ap;
    private GroundAirType groundAirType;
    private GroundAirType attackUnitGroundAirType;


    public Unit(IntVector2D position) {
        this.position = position;
    }
    public IntVector2D getPosition() {
        return position;
    }

    public int getHp() {
        return hp ;
    }

    public AttackIntent attack() {
        return attackIntent;
    };

    public void onAttacked(int damage) {
        hp -= damage;
    };

    public void onSpawn() {
        this.symbol = unitType.getSymbol();
        this.hp = unitType.getHp();
        this.vision = unitType.getVision();
        this.areaOfEffect = unitType.getAoe();
        this.ap = unitType.getAp();
        this.groundAirType = unitType.getGroundAirType();
        this.attackUnitGroundAirType = unitType.getAttackUnitGroundAirType();
    };

    public char getSymbol() {
        return symbol;
    };
}

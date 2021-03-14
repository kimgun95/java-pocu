package academy.pocu.comp2500.assignment3;

import java.util.ArrayList;

public enum UnitType {
    MARINE('M', 35, 2, 0, 6, GroundAirType.GROUND, GroundAirType.BOTH),
    TANK('T', 85, 3, 1, 8, GroundAirType.GROUND, GroundAirType.GROUND),
    WRAITH('W', 80, 4, 0, 6, GroundAirType.AIR, GroundAirType.BOTH),
    TURRET('U', 99, 2, 0, 7, GroundAirType.GROUND, GroundAirType.AIR),
    MINE('N', 1, 0, 0, 10, GroundAirType.GROUND, GroundAirType.GROUND),
    SMART_MINE('A', 1, 1, 1, 15, GroundAirType.GROUND, GroundAirType.GROUND),
    DESTROYER('D', 100, 1, 1, 1, GroundAirType.GROUND, GroundAirType.BOTH),
    ;

    private char symbol;
    private int hp;
    private int vision;
    private int aoe;
    private int ap;
    private GroundAirType groundAirType;
    private GroundAirType attackUnitGroundAirType;
    UnitType(char symbol, int hp, int vision, int aoe, int ap, GroundAirType groundAirType, GroundAirType attackUnitGroundAirType) {
        this.symbol = symbol;
        this.hp = hp;
        this.vision = vision;
        this.aoe = aoe;
        this.ap = ap;
        this.groundAirType = groundAirType;
        this.attackUnitGroundAirType = attackUnitGroundAirType;
    }
    public char getSymbol() {
        return symbol;
    }
    public int getHp() {
        return hp;
    }
    public int getVision() {
        return vision;
    }
    public int getAoe() {
        return aoe;
    }
    public int getAp() {
        return ap;
    }
    public GroundAirType getGroundAirType() {
        return groundAirType;
    }
    public GroundAirType getAttackUnitGroundAirType() {
        return attackUnitGroundAirType;
    }
}

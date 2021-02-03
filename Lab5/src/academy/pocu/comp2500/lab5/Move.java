package academy.pocu.comp2500.lab5;

public class Move {
    private String attackMoveName;
    private int attackMovePower;
    private int maxCountPower;
    private int currentCountPower;

    public Move(String attackMoveName, int attackMovePower, int maxCountPower) {
        this.attackMoveName = attackMoveName;
        this.attackMovePower = attackMovePower;
        this.maxCountPower = maxCountPower;
        this.currentCountPower = maxCountPower;
    }
    public String getAttackMoveName() {
        return this.attackMoveName;
    }
    public int getAttackMovePower() {
        return this.attackMovePower;
    }
    public int getMaxCountPower() {
        return this.maxCountPower;
    }
    public int getCurrentCountPower() {
        return this.currentCountPower;
    }
    public void setCurrentCountPower(int count) {
        this.currentCountPower += count;
    }
}

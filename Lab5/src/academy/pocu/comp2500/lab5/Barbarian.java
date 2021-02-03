package academy.pocu.comp2500.lab5;

public class Barbarian {
    protected String name;
    protected int attack;
    protected int defense;
    protected int hp;
    protected int maxHp;

    public Barbarian(String name, int hp, int attack, int defense) {
        this.name = name;
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
        this.maxHp = hp;
    }
    public int getHp() {
        return this.hp;
    }
    public void attack(Barbarian enemy) {
        if (this.hp <= 0) {
            return;
        }
        if (this.name.equals(enemy.name)) {
            return;
        }
        int damage = (int) (((double) this.attack - (double) enemy.defense) / (double) 2);
        if (damage < 1) {
            damage = 1;
        }
        if (enemy.hp < damage) {
            enemy.hp = 0;
        } else {
            enemy.hp -= damage;
        }
    }
    public boolean isAlive() {
        if (this.hp <= 0) {
            return false;
        }
        return true;
    }
}

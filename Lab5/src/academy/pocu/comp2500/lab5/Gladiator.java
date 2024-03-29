package academy.pocu.comp2500.lab5;

import java.util.ArrayList;

public class Gladiator extends Barbarian {
    private ArrayList<Move> attackMove;

    public Gladiator(String name, int hp, int attack, int defense) {
        super(name, hp, attack, defense);
        this.attackMove = new ArrayList<>();
    }
    public boolean addMove(Move attackMove) {
        if (this.attackMove.size() == 4) {
            return false;
        }
        for (Move move : this.attackMove) {
            if (move.getAttackMoveName().equals(attackMove.getAttackMoveName())) {
                return false;
            }
        }
        this.attackMove.add(attackMove);
        return true;
    }
    public boolean removeMove(String attackMoveName) {
        for (Move move : this.attackMove) {
            if (move.getAttackMoveName().equals(attackMoveName)) {
                this.attackMove.remove(move);
                return true;
            }
        }
        return false;
    }
    public void attack(String attackMoveName, Barbarian enemy) {
        if (super.hp <= 0) {
            return;
        }
        if (super.name.equals(enemy.name)) {
            return;
        }
        for (Move move : this.attackMove) {

            if (move.getAttackMoveName().equals(attackMoveName)) {
                if (move.getCurrentCountPower() < 1) {
                    return;
                }
                int damage = (int) (((double) super.attack / (double) enemy.defense * (double) move.getAttackMovePower()) / (double) 2);
                if (damage < 1) {
                    damage = 1;
                }
//                System.out.println(super.attack + " " + enemy.defense + " " + move.getAttackMovePower());
//                System.out.println((double) super.attack / (double) enemy.defense * (double) move.getAttackMovePower());
                move.setCurrentCountPower(-1);
                if (enemy.hp < damage) {
                    enemy.hp = 0;
                } else {
                    enemy.hp -= damage;
                }
                return;
            }
        }
        return;
    }
    public void rest() {
        super.hp += 10;
        if (super.maxHp < super.hp) {
            super.hp = super.maxHp;
        }
        for (Move move : this.attackMove) {
            if (move.getCurrentCountPower() < move.getMaxCountPower()) {
                move.setCurrentCountPower(1);
            }
        }
    }
}

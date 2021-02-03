package academy.pocu.comp2500.lab5;

public class Knight extends Gladiator {
    private Pet pet;

    public Knight(String name, int hp, int attack, int defense) {
        super(name, hp, attack, defense);
    }
    public void setPet(Pet pet) {
        if (pet == null) {
            this.pet = null;
            return;
        }
        this.pet = pet;
    }
    public void attackTogether(Barbarian enemy) {
        if (this.pet == null) {
            return;
        }
        int damage = (int) (((double) super.attack + (double) pet.getAttack() - (double) enemy.defense) / (double) 2);
        if (damage < 1) {
            damage = 1;
        }
        enemy.hp -= damage;
    }
}

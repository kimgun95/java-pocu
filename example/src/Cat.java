public class Cat extends Animal {
    public void shout() {
        System.out.println("Meow~!");
    }
    public void purr() {
        System.out.println("Grrrr!");
    }
    public void keepShouting(Animal animal) {
        animal.shout();
    }
}

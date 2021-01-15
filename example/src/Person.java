public class Person {
    private int age;
    private String name;

    public Person(String name, int age) {
        this.name = name;
        this.age = Math.max(0, age);
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void punch(Person enemy) {

    }
    public void pat(Dog dog) {

    }
}

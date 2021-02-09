package academy.pocu.comp2500.lab6;

import java.util.ArrayList;

public class Menu {
    protected int price;

    protected static final int MAX_MEAT_COUNT = 2;
    protected static final int MAX_VEGGIE_COUNT = 2;
    protected static final int MAX_CHEESE_COUNT = 2;

    protected ArrayList<Appetizer> appetizers;
    protected ArrayList<MainCourse> mainCourses;
    protected ArrayList<Dessert> desserts;

    protected boolean isValid;

    protected int meatCountHousePizza;
    protected int meatCountFreeSoulPizza;
    protected int veggieCount;
    protected int cheeseCount;
    protected boolean isVeggieAdded;
    protected boolean isCheeseAdded;

    protected Menu(int price) {
        this.price = price;

        appetizers = new ArrayList<>();
        desserts = new ArrayList<>();
        mainCourses = new ArrayList<>();
    }
    public int getPrice() {
        return this.price;
    }

    public boolean isValid() {
        return ((this.appetizers.size() == 2 && this.desserts.size() == 1)
                || (this.isValid) || (this.appetizers.size() == 1 && this.mainCourses.size() == 1 && this.desserts.size() == 1)
        || (this.meatCountHousePizza == MAX_MEAT_COUNT) || (this.isVeggieAdded) ||
                (this.meatCountFreeSoulPizza == MAX_MEAT_COUNT && this.veggieCount == MAX_VEGGIE_COUNT
                        && this.isCheeseAdded) || (this.cheeseCount == MAX_CHEESE_COUNT));
    }
}

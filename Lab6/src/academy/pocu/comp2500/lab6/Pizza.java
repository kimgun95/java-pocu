package academy.pocu.comp2500.lab6;

import java.util.ArrayList;

public class Pizza extends Menu {
    protected static final int MAX_MEAT_COUNT = 2;
    protected static final int MAX_VEGGIE_COUNT = 2;
    protected static final int MAX_CHEESE_COUNT = 2;

    protected ArrayList<Topping> toppings;
    protected int meatCountHousePizza;
    protected int meatCountFreeSoulPizza;
    protected int veggieCount;
    protected int cheeseCount;
    protected boolean isVeggieAdded;
    protected boolean isCheeseAdded;

    protected Pizza(int price) {
        super(price);
        toppings = new ArrayList<>();
    }
    public ArrayList<Topping> getToppings() {
        return this.toppings;
    }

    public boolean isValid() {
        return ((this.meatCountHousePizza == MAX_MEAT_COUNT) || (this.isVeggieAdded) ||
                (this.meatCountFreeSoulPizza == MAX_MEAT_COUNT && this.veggieCount == MAX_VEGGIE_COUNT
                        && this.isCheeseAdded) || (this.cheeseCount == MAX_CHEESE_COUNT));
    }
}

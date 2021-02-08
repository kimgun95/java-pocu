package academy.pocu.comp2500.lab6;

import java.util.ArrayList;

public class Pizza extends Menu {
    protected static final int MAX_MEAT_COUNT = 2;
    protected static final int MAX_VEGGIE_COUNT = 2;
    protected static final int MAX_CHEESE_COUNT = 2;

    protected ArrayList<Topping> toppings;
    protected int meatCount;
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
}

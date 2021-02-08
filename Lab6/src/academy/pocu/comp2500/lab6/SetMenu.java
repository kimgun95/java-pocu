package academy.pocu.comp2500.lab6;

import java.util.ArrayList;

public class SetMenu extends Menu {
    protected ArrayList<Appetizer> appetizers;
    protected MainCourse mainCourse;
    protected ArrayList<Dessert> desserts;

    public SetMenu(int price) {
        super(price);
        appetizers = new ArrayList<>();
        desserts = new ArrayList<>();
        mainCourse = null;
    }
    public ArrayList<Appetizer> getAppetizers() {
        assert (this.appetizers != null) : "call isValid() first!";
        return this.appetizers;
    }

    public MainCourse getMainCourse() {
        assert (this.mainCourse != null) : "call isValid() first!";
        return this.mainCourse;
    }

    public ArrayList<Dessert> getDesserts() {
        assert (this.desserts != null) : "call isValid() first!";
        return this.desserts;
    }
}

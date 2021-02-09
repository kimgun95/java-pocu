package academy.pocu.comp2500.lab6;

import java.util.ArrayList;

public class SetMenu extends Menu {

    protected SetMenu(int price) {
        super(price);
    }

    public ArrayList<Appetizer> getAppetizers() {
        assert (this.appetizers != null) : "call isValid() first!";
        return this.appetizers;
    }

    public ArrayList<Dessert> getDesserts() {
        assert (this.desserts != null) : "call isValid() first!";
        return this.desserts;
    }

    public ArrayList<MainCourse> getMainCourses() {
        assert (this.mainCourses != null) : "call isValid() first!";
        return this.mainCourses;
    }
}

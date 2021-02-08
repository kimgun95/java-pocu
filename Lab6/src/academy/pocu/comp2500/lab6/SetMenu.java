package academy.pocu.comp2500.lab6;

import java.util.ArrayList;

public class SetMenu extends Menu {
    protected ArrayList<Appetizer> appetizers;
    protected ArrayList<MainCourse> mainCourses;
    protected ArrayList<Dessert> desserts;

    protected SetMenu(int price) {
        super(price);
        appetizers = new ArrayList<>();
        desserts = new ArrayList<>();
        mainCourses = new ArrayList<>();
    }
    public ArrayList<Appetizer> getAppetizers() {
        assert (this.appetizers != null) : "call isValid() first!";
        return this.appetizers;
    }

    public ArrayList<MainCourse> getMainCourse() {
        assert (this.mainCourses != null) : "call isValid() first!";
        return this.mainCourses;
    }

    public ArrayList<Dessert> getDesserts() {
        assert (this.desserts != null) : "call isValid() first!";
        return this.desserts;
    }
}

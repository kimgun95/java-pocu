package academy.pocu.comp2500.lab6;

import java.util.ArrayList;

public class ThreeCourseMeal extends SetMenu {

    // 에피타이저, 메인, 디저트 1개씩
    public ThreeCourseMeal() {
        super(25);
    }

    public void setMainCourse(MainCourse mainCourse) {
        this.mainCourse = mainCourse;
    }

    public MainCourse getMainCourse() {
        assert (this.mainCourse != null) : "call isValid() first!";
        return this.mainCourse;
    }

    public void setAppetizer(Appetizer appetizer) {
        this.appetizers.clear();
        this.appetizers.add(appetizer);
    }

    public void setDessert(Dessert dessert) {
        this.desserts.clear();
        this.desserts.add(dessert);
    }
}
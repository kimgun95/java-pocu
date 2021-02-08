package academy.pocu.comp2500.lab6;

import java.util.ArrayList;

public class ThreeCourseMeal extends SetMenu {
    private static final int PRICE = 25;

    // 에피타이저, 메인, 디저트 1개씩
    public ThreeCourseMeal() {
        super(PRICE);
    }

    public boolean isValid() {
        return this.appetizers.size() == 1 && this.mainCourses.size() == 1 && this.desserts.size() == 1;
    }

    public void setMainCourse(MainCourse mainCourse) {
        this.mainCourses.clear();
        this.mainCourses.add(mainCourse);
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
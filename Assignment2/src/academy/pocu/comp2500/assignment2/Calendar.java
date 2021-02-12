package academy.pocu.comp2500.assignment2;

import java.awt.*;

public class Calendar extends Product {

    public Calendar(CalendarType calendarType, Size size, int price) {
        super(size, price);
        super.color = new Color(0xFF, 0xFF, 0xFF);
        if (calendarType == CalendarType.WALL) {
            super.name = "Wall Calender";
        } else if (calendarType == CalendarType.DESK) {
            super.name = "Desk Calender";
        } else {
            super.name = "Magnet Calender";
        }
    }
}

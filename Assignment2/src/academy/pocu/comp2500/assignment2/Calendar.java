package academy.pocu.comp2500.assignment2;

import java.awt.*;

public class Calendar extends Product {
    private CalendarType calendarType;

    public Calendar(CalendarType calendarType, ShippingMethod shippingMethod) {
        super(calendarType.getName(), new Color(0xFF, 0xFF, 0xFF), calendarType.getProductSize(), calendarType.getPrice(), shippingMethod);

        this.calendarType = calendarType;
    }
}

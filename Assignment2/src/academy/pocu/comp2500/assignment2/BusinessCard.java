package academy.pocu.comp2500.assignment2;

import java.awt.*;

public class BusinessCard extends Aperture {
    private BusinessCardSides businessCardSides;
    private Orientation orientation;


    public BusinessCard(BusinessCardType businessCardType, BusinessCardSides businessCardSides, Size size, int price, BusinessCardColor businessCardColor, Orientation orientation) {
        super(size, price);
        if (businessCardColor == BusinessCardColor.GRAY) {
            super.color = new Color(0xE6, 0xE6, 0xE6);
        } else if (businessCardColor == BusinessCardColor.IVORY) {
            super.color = new Color(0xFF, 0xFF, 0xF0);
        } else {
            super.color = new Color(0xFF, 0xFF, 0xFF);
        }
        if (businessCardType == BusinessCardType.LINEN) {
            super.name = "Linen Business Card";
        } else if (businessCardType == BusinessCardType.LAID) {
            super.name = "Laid Business Card";
        } else {
            super.name = "Smooth Business Card";
        }
        this.businessCardSides = businessCardSides;
        this.orientation = orientation;
    }

    public Orientation getOrientation() {
        return this.orientation;
    }
    public BusinessCardSides getBusinessCardSides() {
        return this.businessCardSides;
    }
}

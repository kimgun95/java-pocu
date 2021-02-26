package academy.pocu.comp2500.assignment2;

public class BusinessCard extends ApertureProduct {
    BusinessCardType businessCardType;
    BusinessCardColor businessCardColor;
    BusinessCardSides businessCardSides;

    public BusinessCard(BusinessCardType businessCardType, BusinessCardColor businessCardColor, BusinessCardSides businessCardSides, ShippingMethod shippingMethod, Orientation orientation) {
        super(businessCardType.getName(), businessCardColor.getColor(), businessCardSides.getProductSize(), businessCardSides.getPrice(businessCardType), shippingMethod, orientation);

        this.businessCardType = businessCardType;
        this.businessCardColor = businessCardColor;
        this.businessCardSides = businessCardSides;
    }

}

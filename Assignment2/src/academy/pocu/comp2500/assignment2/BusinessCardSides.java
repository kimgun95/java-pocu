package academy.pocu.comp2500.assignment2;

public enum BusinessCardSides {
    SINGLE_SIDED(new ProductSize(90, 50), 110),
    DOUBLE_SIDED(new ProductSize(90, 50), 140),
    ;

    private ProductSize productSize;
    private int price;

    BusinessCardSides(ProductSize productSize, int price) {
        this.productSize = productSize;
        this.price = price;
    }
    public ProductSize getProductSize() {
        return this.productSize;
    }
    public int getPrice(BusinessCardType businessCardType) {
        if (businessCardType == BusinessCardType.LAID) {
            return this.price + 10;
        } else if (businessCardType == BusinessCardType.SMOOTH) {
            return this.price - 10;
        }
        return this.price;
    }
}

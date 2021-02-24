package academy.pocu.comp2500.assignment2;

public enum StampSize {
    SIZE40X30(new ProductSize(40, 30), 2300),
    SIZE50X20(new ProductSize(50, 20), 2300),
    SIZE70X40(new ProductSize(70, 40), 2600),
    ;

    private ProductSize productSize;
    private int price;

    StampSize(ProductSize productSize, int price) {
        this.productSize = productSize;
        this.price = price;
    }
    public int getPrice() {
        return this.price;
    }
    public ProductSize getProductSize() {
        return this.productSize;
    }
}

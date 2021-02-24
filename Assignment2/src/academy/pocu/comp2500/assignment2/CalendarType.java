package academy.pocu.comp2500.assignment2;

public enum CalendarType {
    WALL("Wall Calendar", new ProductSize(400, 400), 1000),
    DESK("Desk Calendar", new ProductSize(200, 150), 1000),
    MAGNET("Magnet Calendar", new ProductSize(100, 200), 1500),
    ;

    private String name;
    private ProductSize productSize;
    private int price;

    CalendarType(String name, ProductSize productSize, int price) {
        this.name = name;
        this.productSize = productSize;
        this.price = price;
    }
    public String getName() {
        return this.name;
    }
    public ProductSize getProductSize() {
        return this.productSize;
    }
    public int getPrice() {
        return this.price;
    }
}

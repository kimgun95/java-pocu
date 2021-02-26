package academy.pocu.comp2500.assignment2;

public enum BannerSize {
    SIZE1000X500(new ProductSize(1000, 500), 5000),
    SIZE1000X1000(new ProductSize(1000, 1000), 5200),
    SIZE2000X500(new ProductSize(2000, 500), 5300),
    SIZE3000X1000(new ProductSize(3000, 1000), 6000),
    ;

    private ProductSize productSize;
    private int price;

    BannerSize(ProductSize productSize, int price) {
        this.productSize = productSize;
        this.price = price;
    }
    public ProductSize getProductSize() {
        return this.productSize;
    }
    public int getPrice(BannerType bannerType) {
        if (bannerType == BannerType.SCRIM || bannerType == BannerType.MESH) {
            return this.price + 100;
        }
        return this.price;
    }
}

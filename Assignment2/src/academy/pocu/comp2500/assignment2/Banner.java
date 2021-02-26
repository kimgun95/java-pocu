package academy.pocu.comp2500.assignment2;

public class Banner extends ApertureProduct {
    private BannerType bannerType;
    private BannerSize bannerSize;

    public Banner(BannerType bannerType, BannerSize bannerSize, Color color, ShippingMethod shippingMethod, Orientation orientation) {
        super(bannerType.getName(), color, bannerSize.getProductSize(), bannerSize.getPrice(bannerType), shippingMethod, orientation);

        this.bannerType = bannerType;
        this.bannerSize = bannerSize;
    }
}

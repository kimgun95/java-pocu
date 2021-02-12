package academy.pocu.comp2500.assignment2;

import academy.pocu.comp2500.assignment2.registry.Registry;

public class App {
    public App(Registry registry) {
        registry.registerRedStampCreator("Stamp");
        registry.registerBlueStampCreator("Stamp");
        registry.registerGreenStampCreator("Stamp");
        registry.registerWallCalendarCreator("Calendar");
        registry.registerMagnetCalendarCreator("Calendar");
        registry.registerDeskCalendarCreator("Calendar");
        registry.registerLandscapeBannerCreator("Banner");
        registry.registerPortraitBannerCreator("Banner");
        registry.registerGlossBannerCreator("Banner");
        registry.registerScrimBannerCreator("Banner");
        registry.registerMeshBannerCreator("Banner");
        registry.registerLandscapeBusinessCardCreator("BusinessCard");
        registry.registerPortraitBusinessCardCreator("BusinessCard");
        registry.registerIvoryBusinessCardCreator("BusinessCard");
        registry.registerGrayBusinessCardCreator("BusinessCard");
        registry.registerWhiteBusinessCardCreator("BusinessCard");
        registry.registerLaidBusinessCardCreator("BusinessCard");
        registry.registerLinenBusinessCardCreator("BusinessCard");
        registry.registerSmoothBusinessCardCreator("BusinessCard");
        registry.registerSingleSidedBusinessCardCreator("BusinessCard");
        registry.registerDoubleSidedBusinessCardCreator("BusinessCard");
        registry.registerCartCreator("Cart");
        registry.registerProductAdder("Cart", "addProduct");
        registry.registerProductRemover("Cart", "deleteProduct");
        registry.registerTotalPriceGetter("Cart", "getTotalPrice");
        registry.registerLandscapeBannerTextApertureAdder("Product", "addTextAperture");
        registry.registerLandscapeBannerImageApertureAdder("Product", "addImageAperture");
        registry.registerPortraitBannerTextApertureAdder("Product", "addTextAperture");
        registry.registerPortraitBannerImageApertureAdder("Product", "addImageAperture");
        registry.registerGlossBannerTextApertureAdder("Product", "addTextAperture");
        registry.registerGlossBannerImageApertureAdder("Product", "addImageAperture");
        registry.registerScrimBannerTextApertureAdder("Product", "addTextAperture");
        registry.registerScrimBannerImageApertureAdder("Product", "addImageAperture");
        registry.registerMeshBannerTextApertureAdder("Product", "addTextAperture");
        registry.registerMeshBannerImageApertureAdder("Product", "addImageAperture");
        registry.registerLandscapeBusinessCardTextApertureAdder("Product", "addTextAperture");
        registry.registerLandscapeBusinessCardImageApertureAdder("Product", "addImageAperture");
        registry.registerPortraitBusinessCardTextApertureAdder("Product", "addTextAperture");
        registry.registerPortraitBusinessCardImageApertureAdder("Product", "addImageAperture");
        registry.registerIvoryBusinessCardTextApertureAdder("Product", "addTextAperture");
        registry.registerIvoryBusinessCardImageApertureAdder("Product", "addImageAperture");
        registry.registerGrayBusinessCardTextApertureAdder("Product", "addTextAperture");
        registry.registerGrayBusinessCardImageApertureAdder("Product", "addImageAperture");
        registry.registerWhiteBusinessCardTextApertureAdder("Product", "addTextAperture");
        registry.registerWhiteBusinessCardImageApertureAdder("Product", "addImageAperture");
        registry.registerLaidBusinessCardTextApertureAdder("Product", "addTextAperture");
        registry.registerLaidBusinessCardImageApertureAdder("Product", "addImageAperture");
        registry.registerLinenBusinessCardTextApertureAdder("Product", "addTextAperture");
        registry.registerLinenBusinessCardImageApertureAdder("Product", "addImageAperture");
        registry.registerSmoothBusinessCardTextApertureAdder("Product", "addTextAperture");
        registry.registerSmoothBusinessCardImageApertureAdder("Product", "addImageAperture");
        registry.registerSingleSidedBusinessCardTextApertureAdder("Product", "addTextAperture");
        registry.registerSingleSidedBusinessCardImageApertureAdder("Product", "addImageAperture");
        registry.registerDoubleSidedBusinessCardTextApertureAdder("Product", "addTextAperture");
        registry.registerDoubleSidedBusinessCardImageApertureAdder("Product", "addImageAperture");

    }
}

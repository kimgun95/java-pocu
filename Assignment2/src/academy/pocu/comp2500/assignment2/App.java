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
        registry.registerLandscapeBannerTextApertureAdder("Product", "addText");
        registry.registerLandscapeBannerImageApertureAdder("Product", "addImage");
        registry.registerPortraitBannerTextApertureAdder("Product", "addText");
        registry.registerPortraitBannerImageApertureAdder("Product", "addImage");
        registry.registerGlossBannerTextApertureAdder("Product", "addText");
        registry.registerGlossBannerImageApertureAdder("Product", "addImage");
        registry.registerScrimBannerTextApertureAdder("Product", "addText");
        registry.registerScrimBannerImageApertureAdder("Product", "addImage");
        registry.registerMeshBannerTextApertureAdder("Product", "addText");
        registry.registerMeshBannerImageApertureAdder("Product", "addImage");
        registry.registerLandscapeBusinessCardTextApertureAdder("Product", "addText");
        registry.registerLandscapeBusinessCardImageApertureAdder("Product", "addImage");
        registry.registerPortraitBusinessCardTextApertureAdder("Product", "addText");
        registry.registerPortraitBusinessCardImageApertureAdder("Product", "addImage");
        registry.registerIvoryBusinessCardTextApertureAdder("Product", "addText");
        registry.registerIvoryBusinessCardImageApertureAdder("Product", "addImage");
        registry.registerGrayBusinessCardTextApertureAdder("Product", "addText");
        registry.registerGrayBusinessCardImageApertureAdder("Product", "addImage");
        registry.registerWhiteBusinessCardTextApertureAdder("Product", "addText");
        registry.registerWhiteBusinessCardImageApertureAdder("Product", "addImage");
        registry.registerLaidBusinessCardTextApertureAdder("Product", "addText");
        registry.registerLaidBusinessCardImageApertureAdder("Product", "addImage");
        registry.registerLinenBusinessCardTextApertureAdder("Product", "addText");
        registry.registerLinenBusinessCardImageApertureAdder("Product", "addImage");
        registry.registerSmoothBusinessCardTextApertureAdder("Product", "addText");
        registry.registerSmoothBusinessCardImageApertureAdder("Product", "addImage");
        registry.registerSingleSidedBusinessCardTextApertureAdder("Product", "addText");
        registry.registerSingleSidedBusinessCardImageApertureAdder("Product", "addImage");
        registry.registerDoubleSidedBusinessCardTextApertureAdder("Product", "addText");
        registry.registerDoubleSidedBusinessCardImageApertureAdder("Product", "addImage");

    }
}

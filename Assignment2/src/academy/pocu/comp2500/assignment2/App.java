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
        registry.registerLandscapeBannerTextApertureAdder("Banner", "addText");
        registry.registerLandscapeBannerImageApertureAdder("Banner", "addImage");
        registry.registerPortraitBannerTextApertureAdder("Banner", "addText");
        registry.registerPortraitBannerImageApertureAdder("Banner", "addImage");
        registry.registerGlossBannerTextApertureAdder("Banner", "addText");
        registry.registerGlossBannerImageApertureAdder("Banner", "addImage");
        registry.registerScrimBannerTextApertureAdder("Banner", "addText");
        registry.registerScrimBannerImageApertureAdder("Banner", "addImage");
        registry.registerMeshBannerTextApertureAdder("Banner", "addText");
        registry.registerMeshBannerImageApertureAdder("Banner", "addImage");
        registry.registerLandscapeBusinessCardTextApertureAdder("BusinessCard", "addText");
        registry.registerLandscapeBusinessCardImageApertureAdder("BusinessCard", "addImage");
        registry.registerPortraitBusinessCardTextApertureAdder("BusinessCard", "addText");
        registry.registerPortraitBusinessCardImageApertureAdder("BusinessCard", "addImage");
        registry.registerIvoryBusinessCardTextApertureAdder("BusinessCard", "addText");
        registry.registerIvoryBusinessCardImageApertureAdder("BusinessCard", "addImage");
        registry.registerGrayBusinessCardTextApertureAdder("BusinessCard", "addText");
        registry.registerGrayBusinessCardImageApertureAdder("BusinessCard", "addImage");
        registry.registerWhiteBusinessCardTextApertureAdder("BusinessCard", "addText");
        registry.registerWhiteBusinessCardImageApertureAdder("BusinessCard", "addImage");
        registry.registerLaidBusinessCardTextApertureAdder("BusinessCard", "addText");
        registry.registerLaidBusinessCardImageApertureAdder("BusinessCard", "addImage");
        registry.registerLinenBusinessCardTextApertureAdder("BusinessCard", "addText");
        registry.registerLinenBusinessCardImageApertureAdder("BusinessCard", "addImage");
        registry.registerSmoothBusinessCardTextApertureAdder("BusinessCard", "addText");
        registry.registerSmoothBusinessCardImageApertureAdder("BusinessCard", "addImage");
        registry.registerSingleSidedBusinessCardTextApertureAdder("BusinessCard", "addText");
        registry.registerSingleSidedBusinessCardImageApertureAdder("BusinessCard", "addImage");
        registry.registerDoubleSidedBusinessCardTextApertureAdder("BusinessCard", "addText");
        registry.registerDoubleSidedBusinessCardImageApertureAdder("BusinessCard", "addImage");

    }
}

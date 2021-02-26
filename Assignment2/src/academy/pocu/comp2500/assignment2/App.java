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

        registry.registerLandscapeBannerTextApertureAdder("ApertureProduct", "addAperture");
        registry.registerLandscapeBannerImageApertureAdder("ApertureProduct", "addAperture");
        registry.registerPortraitBannerTextApertureAdder("ApertureProduct", "addAperture");
        registry.registerPortraitBannerImageApertureAdder("ApertureProduct", "addAperture");
        registry.registerGlossBannerTextApertureAdder("ApertureProduct", "addAperture");
        registry.registerGlossBannerImageApertureAdder("ApertureProduct", "addAperture");
        registry.registerScrimBannerTextApertureAdder("ApertureProduct", "addAperture");
        registry.registerScrimBannerImageApertureAdder("ApertureProduct", "addAperture");
        registry.registerMeshBannerTextApertureAdder("ApertureProduct", "addAperture");
        registry.registerMeshBannerImageApertureAdder("ApertureProduct", "addAperture");
        registry.registerLandscapeBusinessCardTextApertureAdder("ApertureProduct", "addAperture");
        registry.registerLandscapeBusinessCardImageApertureAdder("ApertureProduct", "addAperture");
        registry.registerPortraitBusinessCardTextApertureAdder("ApertureProduct", "addAperture");
        registry.registerPortraitBusinessCardImageApertureAdder("ApertureProduct", "addAperture");
        registry.registerIvoryBusinessCardTextApertureAdder("ApertureProduct", "addAperture");
        registry.registerIvoryBusinessCardImageApertureAdder("ApertureProduct", "addAperture");
        registry.registerGrayBusinessCardTextApertureAdder("ApertureProduct", "addAperture");
        registry.registerGrayBusinessCardImageApertureAdder("ApertureProduct", "addAperture");
        registry.registerWhiteBusinessCardTextApertureAdder("ApertureProduct", "addAperture");
        registry.registerWhiteBusinessCardImageApertureAdder("ApertureProduct", "addAperture");
        registry.registerLaidBusinessCardTextApertureAdder("ApertureProduct", "addAperture");
        registry.registerLaidBusinessCardImageApertureAdder("ApertureProduct", "addAperture");
        registry.registerLinenBusinessCardTextApertureAdder("ApertureProduct", "addAperture");
        registry.registerLinenBusinessCardImageApertureAdder("ApertureProduct", "addAperture");
        registry.registerSmoothBusinessCardTextApertureAdder("ApertureProduct", "addAperture");
        registry.registerSmoothBusinessCardImageApertureAdder("ApertureProduct", "addAperture");
        registry.registerSingleSidedBusinessCardTextApertureAdder("ApertureProduct", "addAperture");
        registry.registerSingleSidedBusinessCardImageApertureAdder("ApertureProduct", "addAperture");
        registry.registerDoubleSidedBusinessCardTextApertureAdder("ApertureProduct", "addAperture");
        registry.registerDoubleSidedBusinessCardImageApertureAdder("ApertureProduct", "addAperture");

    }
}

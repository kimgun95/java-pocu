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
        registry.registerLandscapeBannerTextApertureAdder("Aperture", "setTextAperture");
        registry.registerLandscapeBannerImageApertureAdder("Aperture", "setImageAperture");
        registry.registerPortraitBannerTextApertureAdder("Aperture", "setTextAperture");
        registry.registerPortraitBannerImageApertureAdder("Aperture", "setImageAperture");
        registry.registerGlossBannerTextApertureAdder("Aperture", "setTextAperture");
        registry.registerGlossBannerImageApertureAdder("Aperture", "setImageAperture");
        registry.registerScrimBannerTextApertureAdder("Aperture", "setTextAperture");
        registry.registerScrimBannerImageApertureAdder("Aperture", "setImageAperture");
        registry.registerMeshBannerTextApertureAdder("Aperture", "setTextAperture");
        registry.registerMeshBannerImageApertureAdder("Aperture", "setImageAperture");
        registry.registerLandscapeBusinessCardTextApertureAdder("Aperture", "setTextAperture");
        registry.registerLandscapeBusinessCardImageApertureAdder("Aperture", "setImageAperture");
        registry.registerPortraitBusinessCardTextApertureAdder("Aperture", "setTextAperture");
        registry.registerPortraitBusinessCardImageApertureAdder("Aperture", "setImageAperture");
        registry.registerIvoryBusinessCardTextApertureAdder("Aperture", "setTextAperture");
        registry.registerIvoryBusinessCardImageApertureAdder("Aperture", "setImageAperture");
        registry.registerGrayBusinessCardTextApertureAdder("Aperture", "setTextAperture");
        registry.registerGrayBusinessCardImageApertureAdder("Aperture", "setImageAperture");
        registry.registerWhiteBusinessCardTextApertureAdder("Aperture", "setTextAperture");
        registry.registerWhiteBusinessCardImageApertureAdder("Aperture", "setImageAperture");
        registry.registerLaidBusinessCardTextApertureAdder("Aperture", "setTextAperture");
        registry.registerLaidBusinessCardImageApertureAdder("Aperture", "setImageAperture");
        registry.registerLinenBusinessCardTextApertureAdder("Aperture", "setTextAperture");
        registry.registerLinenBusinessCardImageApertureAdder("Aperture", "setImageAperture");
        registry.registerSmoothBusinessCardTextApertureAdder("Aperture", "setTextAperture");
        registry.registerSmoothBusinessCardImageApertureAdder("Aperture", "setImageAperture");
        registry.registerSingleSidedBusinessCardTextApertureAdder("Aperture", "setTextAperture");
        registry.registerSingleSidedBusinessCardImageApertureAdder("Aperture", "setImageAperture");
        registry.registerDoubleSidedBusinessCardTextApertureAdder("Aperture", "setTextAperture");
        registry.registerDoubleSidedBusinessCardImageApertureAdder("Aperture", "setImageAperture");

    }
}

package academy.pocu.comp2500.assignment2;

public enum BannerType {
    GLOSS("Gloss Banner"),
    SCRIM("Scrim Banner"),
    MESH("Mesh Banner"),
    ;

    private String name;

    BannerType(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}

package academy.pocu.comp2500.assignment2;

public enum BusinessCardType {
    LINEN("Linen Business Card"),
    LAID("Laid Business Card"),
    SMOOTH("Smooth Business Card"),
    ;

    private String name;

    BusinessCardType(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
}

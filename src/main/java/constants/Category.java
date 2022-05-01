package constants;

public enum Category {
    FRAGRANCES("Fragrances"),
    FACE("Face"),
    BODY("Body"),
    HAIR("Hair"),
    NAILS("Nails"),
    MAKEUP("Make up");

    private String value;

    Category(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

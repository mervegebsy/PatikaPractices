package week5;

public enum Day {
    SUNDAY("Kapalı"),
    MONDAY("09:00 - 17:00"),
    TUESDAY("09:00 - 17:00"),
    WEDNESDAY("09:00 - 17:00"),
    THURSDAY("09:00 - 17:00"),
    FRIDAY("09:00 - 17:00"),
    SATURDAY("10:00 - 14:00");

    private final String calismaSaati;

    Day(String calismaSaati) {
        this.calismaSaati = calismaSaati;
    }

    public String getCalismaSaati() {
        return calismaSaati;
    }
}


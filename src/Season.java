import java.util.HashSet;
import java.util.List;


public enum Season {
    WINTER("зима"),
    SPRING("весна"),
    SUMMER("лето"),
    AUTUMN("осень");

    final String ruName;
    HashSet<Month> monthInside;

    Season(String ruName) {
        this.ruName = ruName;
        switch (this.ruName) {
            case "зима" -> monthInside = new HashSet<>(List.of(Month.DECEMBER, Month.JANUARY, Month.FEBRUARY));
            case "весна" -> monthInside = new HashSet<>(List.of(Month.MARCH, Month.APRIL, Month.MAY));
            case "лето" -> monthInside = new HashSet<>(List.of(Month.JUNE, Month.JULY, Month.AUGUST));
            case "осень" -> monthInside = new HashSet<>(List.of(Month.SEPTEMBER, Month.OCTOBER, Month.NOVEMBER));
        }
    }
    @Override
    public String toString() {
        return  ruName;
    }
}

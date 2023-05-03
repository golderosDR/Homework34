public class Main {
    public static void main(String[] args) {

        System.out.println(getSeasonByMonth(Month.OCTOBER));
        System.out.println(getSeasonByStringMonth("январь"));
        System.out.println(getSeasonByStringMonth("пендябрь"));
        System.out.println("_".repeat(20));
        printAllMonth();


    }
    public static Season getSeasonByMonth(Month month) {
        Season[] seasons = Season.values();
        for (Season s : seasons) {
            if (s.monthInside.contains(month)) {
                return s;
            }
        }
        return null;
    }
    public static Season getSeasonByStringMonth(String month) {
        Season[] seasons = Season.values();
        for (Season value : seasons) {

            for (Month monthName : value.monthInside) {

                if (monthName.ruName.equals(month)) {
                    return value;
                }
            }
        }
        return null;
    }
    public static void printAllMonth() {
        for (Month month: Month.values()) {
            System.out.println(month.toStringToPrint());
        }
    }
}
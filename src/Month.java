public enum Month {
    JANUARY("январь", 1),
    FEBRUARY("февраль", 2),
    MARCH("март", 3),
    APRIL("апрель", 4),
    MAY("май", 5),
    JUNE("июнь", 6),
    JULY("июль", 7),
    AUGUST("август", 8),
    SEPTEMBER("сентябрь", 9),
    OCTOBER("октябрь", 10),
    NOVEMBER("ноябрь", 11),
    DECEMBER("декабрь", 12);

    final String ruName;
    final int monthNumber;

    Month(String ruName, int monthNumber) {
        this.ruName = ruName;
        this.monthNumber = monthNumber;
    }


    public String toString() {
        return ruName;
    }

    public String toStringToPrint() {
        return String.format("Месяц %d – %s.", this.monthNumber, this.toString());
    }
}

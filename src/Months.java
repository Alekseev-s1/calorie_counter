public enum Months {
    JANUARY(1, "Январь"),
    FEBRUARY(2, "Февраль"),
    MARCH(3, "Март"),
    APRIL(4, "Апрель"),
    MAY(5, "Май"),
    JUNE(6, "Июнь"),
    JULY(7, "Июль"),
    AUGUST(8, "Август"),
    SEPTEMBER(9, "Сентябрь"),
    OCTOBER(10, "Октябрь"),
    NOVEMBER(11, "Ноябрь"),
    DECEMBER(12, "Декабрь");

    private final int number;
    private final String name;

    Months(int number, String name) {
        this.number = number;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public static Months lookup(int number) {
        for (Months month : values()) {
            if (month.number == number) {
                return month;
            }
        }
        throw new IllegalArgumentException("Такого месяца не существует");
    }
}

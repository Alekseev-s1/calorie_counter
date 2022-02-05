public enum Operations {

    ENTER_STEPS(1),
    PRINT_MONTH_STATISTIC(2),
    CHANGE_GOAL(3),
    EXIT(4),
    INCORRECT_NUMBER(-1),
    NOT_NUMBER(-2);

    private final int number;

    Operations(int number) {
        this.number = number;
    }

    public static Operations lookup(int number) {
        for (Operations operation : values()) {
            if (operation.number == number) {
                return operation;
            }
        }

        return INCORRECT_NUMBER;
    }
}

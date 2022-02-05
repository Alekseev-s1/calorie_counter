public class Main {

    public static void main(String[] args) {

        ConsoleReader consoleReader = new ConsoleReader();
        StepTracker stepTracker = new StepTracker();
        boolean isBreak = false;

        while (!isBreak) {
            printMenu();
            Operations operations = consoleReader.readCommand();
            int month = 0;
            int day = 0;
            int steps = 0;

            switch (operations) {
                case ENTER_STEPS:
                    month = consoleReader.readMonth();
                    day = consoleReader.readDay();
                    steps = consoleReader.readSteps();
                    stepTracker.saveStepsCount(month, day, steps);
                    break;
                case PRINT_MONTH_STATISTIC:
                    month = consoleReader.readMonth();
                    stepTracker.showMonthlyStatistic(month);
                    break;
                case CHANGE_GOAL:
                    steps = consoleReader.readSteps();
                    stepTracker.changeGoal(steps);
                    break;
                case EXIT:
                    isBreak = true;
                    break;
                case INCORRECT_NUMBER:
                    System.out.println("Такого дейставия нет, повторите ввод!");
                    break;
                case NOT_NUMBER:
                    System.out.println("Вы ввели некорректное значение. Введите целое число!");
                    break;
            }
        }

        consoleReader.closeScanner();
    }

    private static void printMenu() {
        System.out.println("Выберите действие:");
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Напечатать статистику за определённый месяц");
        System.out.println("3 - Изменить цель по количеству шагов в день");
        System.out.println("4 - Выйти из приложения");
    }
}

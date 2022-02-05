import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isBreak = false;

        while (!isBreak) {
            int command;
            Operations operations;
            printMenu();

            if (scanner.hasNextInt()) {
                command = scanner.nextInt();
                operations = Operations.lookup(command);
            } else {
                System.out.println("Вы ввели некорректное значение - " + scanner.next() + ". Введите целое число!");
                continue;
            }

            switch (operations) {
                case ENTER_STEPS:

                case PRINT_MONTH_STATISTIC:

                case CHANGE_GOAL:

                case EXIT:

                case INCORRECT_NUMBER:
                    System.out.println("Такого дейставия нет, повторите ввод!");
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Выберите действие:");
        System.out.println("1 - Ввести количество шагов за определённый день");
        System.out.println("2 - Напечатать статистику за определённый месяц");
        System.out.println("3 - Изменить цель по количеству шагов в день");
        System.out.println("4 - Выйти из приложения");
    }
}

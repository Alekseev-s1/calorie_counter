import java.util.Scanner;

public class ConsoleReader {

    Scanner scanner = new Scanner(System.in);

    public Operations readCommand() {
        if (scanner.hasNextInt()) {
            int command = scanner.nextInt();
            Operations operation = Operations.lookup(command);
            return operation;
        } else {
            scanner.next();
            return Operations.NOT_NUMBER;
        }
    }

    public int readMonth() {
        System.out.println("Введите номер месяца:");
        int month = scanner.nextInt();
        return month;
    }

    public int readDay() {
        System.out.println("Введите номер дня:");
        int day = scanner.nextInt();
        return day;
    }

    public int readSteps() {
        System.out.println("Введите количество шагов:");
        int steps = scanner.nextInt();
        return steps;
    }

    public void closeScanner() {
        scanner.close();
    }
}

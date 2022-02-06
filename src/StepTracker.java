import java.util.HashMap;

public class StepTracker {

    private int goalSteps = 10000;
    private final HashMap<Integer, int[]> stepsByDay = initiateStepsCalendar();

    public void saveStepsCount(int month, int day, int steps) {
        if (steps < 0) {
            System.out.println("Количество шагов не может быть отрицательным!");
            return;
        }

        stepsByDay.get(month)[day - 1] = steps;
    }

    public void showMonthlyStatistic(int month) {
        int[] monthlySteps = stepsByDay.get(month);

        System.out.println("Статистика за " + convertMonthNumberToName(month));
        showStepsByDay(monthlySteps);
        showMaxSteps(monthlySteps);
        showAverageSteps(monthlySteps);
        showDistance(monthlySteps);
        showCalories(monthlySteps);
        showBestSeries(monthlySteps);
    }

    public void changeGoal(int steps) {
        goalSteps = steps;
        System.out.println("Готово! Ваша цель - " + goalSteps + " шагов в день!");
    }

    private void showStepsByDay(int[] monthlySteps) {
        System.out.println("Количество шагов за каждый день месяца:");
        for (int i = 0; i < monthlySteps.length; i++) {
            System.out.println((i + 1) + " день: " + monthlySteps[i]);
        }
        System.out.println("-----------------------------------------");
    }

    private void showMaxSteps(int[] monthlySteps) {
        int maxSteps = 0;

        for (int steps : monthlySteps) {
            if (maxSteps < steps) {
                maxSteps = steps;
            }
        }

        System.out.println("Максимальное количество шагов, пройденных за день - " + maxSteps);
        System.out.println("-----------------------------------------");
    }

    private void showAverageSteps(int[] monthlySteps) {
        int count = 0;
        int sum = 0;

        for (int steps : monthlySteps) {
            sum = sum + steps;
            count++;
        }

        int averageSteps = sum / count;
        System.out.println("Среднее количество шагов, пройденных за день - " + averageSteps);
        System.out.println("-----------------------------------------");
    }

    private void showDistance(int[] monthlySteps) {
        double distance = 0;
        int sumSteps = 0;

        for (int steps : monthlySteps) {
            sumSteps = sumSteps + steps;
        }

        distance = Converter.stepsToKilometers(sumSteps);
        System.out.println("Всего пройдено за месяц - " + distance + " км");
        System.out.println("-----------------------------------------");
    }

    private void showCalories(int[] monthlySteps) {
        double calories = 0;
        int sumSteps = 0;

        for (int steps : monthlySteps) {
            sumSteps = sumSteps + steps;
        }

        calories = Converter.stepsToKCalories(sumSteps);
        System.out.println("Всего сожженных килокалорий за месяц - " + calories);
        System.out.println("-----------------------------------------");
    }

    private void showBestSeries(int[] monthlySteps) {
        int count = 0;
        int sequence = 0;

        for (int steps : monthlySteps) {
            if (goalSteps <= steps) {
                count++;
            } else {
                if (sequence < count) {
                    sequence = count;
                }
                count = 0;
            }
        }

        System.out.println("Лучшая серия - " + sequence);
        System.out.println("-----------------------------------------");
    }

    private HashMap<Integer, int[]> initiateStepsCalendar() {
        HashMap<Integer, int[]> stepsCalendar = new HashMap<>();

        for (int i = 1; i < 13; i++) {
            stepsCalendar.put(i, new int[30]);
        }

        return stepsCalendar;
    }

    private static String convertMonthNumberToName(int monthNumber) {
        String monthName = Months.lookup(monthNumber).getName();
        return monthName;
    }
}

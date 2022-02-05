import java.util.HashMap;

public class StepTracker {

    private int goalSteps = 10000;
    private HashMap<Integer, int[]> stepsByDay;

    public void saveStepsCount(int month, int day, int steps) {
        if (steps < 0) {
            System.out.println("Количество шагов не может быть отрицательным!");
            return;
        }


    }
}

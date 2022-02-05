public class Converter {

    private final static double KILOMETERS_INDEX = 0.075;
    private final static double CALORIES_INDEX = 50;

    public static double stepsToKilometers(int steps) {
        double kilometers = steps * KILOMETERS_INDEX;
        return kilometers;
    }

    public static double stepsToKCalories(int steps) {
        double kCalories = steps * CALORIES_INDEX / 1000;
        return kCalories;
    }
}

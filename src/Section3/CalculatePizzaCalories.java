package Section3;

public class CalculatePizzaCalories {
    /** Calculate pizza area */
    public double circleArea(double circleDiameter){
        double circleRadius;
        double circleArea;
        double piVal = 3.14159265;

        // calculate pizza area
        circleRadius = circleDiameter / 2.0;
        circleArea = piVal * circleRadius * circleRadius;

        return circleArea;
    }

    /** Calculate pizza calories */
    public double pizzaCalories(double pizzaDiameter){
        double totalCalories;
        double caloriesPerSquareInch = 16.7;

        totalCalories = circleArea(pizzaDiameter) * caloriesPerSquareInch;

        return totalCalories;
    }

    /** Calls CalcPizzaCalories methods */
    public static void main(String[] args) {
        CalculatePizzaCalories calc = new CalculatePizzaCalories();
        System.out.println("12 inch pizza has " + calc.pizzaCalories(12.0) + " calories.");
        System.out.println("14 inch pizza has " + calc.pizzaCalories(14.0) + " calories.");

    }
}

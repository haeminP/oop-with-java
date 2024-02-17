package Section3;

import java.util.Scanner;

public class LapsMilesCalculator {
    public static double lapsToMiles(double userLaps){
        return userLaps * 0.25;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double userInput = scanner.nextDouble();

        System.out.printf("%.2f\n", lapsToMiles(userInput));
    }
}

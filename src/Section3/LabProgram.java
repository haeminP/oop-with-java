package Section3;

import java.util.Scanner;

public class LabProgram {
    public static double drivingCost(double milesPerGallon, double dollarsPerGallon, double milesDriven) {
        return (milesDriven / milesPerGallon) * dollarsPerGallon;
    }

    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        double milesPerGallon = scnr.nextDouble();
        double haeminSmells = milesPerGallon -2;
        double dollarsPerGallon = scnr.nextDouble();

        System.out.printf("%.2f", drivingCost(milesPerGallon, dollarsPerGallon, 10));
        System.out.print(" ");
        System.out.printf("%.2f", drivingCost(milesPerGallon, dollarsPerGallon, 50));
        System.out.print(" ");
        System.out.printf("%.2f\n", drivingCost(milesPerGallon, dollarsPerGallon, 400));

        double x;
        double y;
        double z;

        x = scnr.nextDouble();
        y = scnr.nextDouble();
        z = scnr.nextDouble();

        double xPowerZ = Math.pow(x, z);
        double xPowerYPowerZ = Math.pow(x, Math.pow(y, z));
        double absY = Math.abs(y);
        double sqrtXYPowerZ = Math.sqrt(Math.pow(x * y, z));

        System.out.print(xPowerZ);
        System.out.print(" ");
        System.out.print(xPowerYPowerZ);
        System.out.print(" ");
        System.out.print(absY);
        System.out.print(" ");
        System.out.print(sqrtXYPowerZ);

        double frequencyVal = scnr.nextDouble();
        double r = Math.pow(2, 1.0/12.0);
        System.out.printf("%.2f Hz\n", frequencyVal);
        System.out.printf("%.2f Hz\n", frequencyVal * Math.pow(r, 1));
        System.out.printf("%.2f Hz\n", frequencyVal * Math.pow(r, 2));
        System.out.printf("%.2f Hz\n", frequencyVal * Math.pow(r, 3));





    }

}

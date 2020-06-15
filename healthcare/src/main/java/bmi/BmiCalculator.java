package bmi;

import java.util.Locale;
import java.util.Scanner;

public class BmiCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.println("Please, enter your weight in [kg]:");
        double weight = scan.nextDouble();

        System.out.println("Please, enter your height in [m]:");
        double height = scan.nextDouble();

        scan.nextLine();

        System.out.println("What's your name?");
        String name = scan.nextLine();

        double bmi = weight / (height * height);

        System.out.print("Hi " + name + "! Your BMI is: ");
        System.out.format("%.2f%n", bmi);


        if (bmi < 16.0) {
            System.out.println("Starvation - we recommend to contact a doctor.");
        } else if (bmi >= 16.0 && bmi < 17.0) {
            System.out.println("Emaciation - you are too thin.");
        } else if (bmi >= 17.0 && bmi < 18.5) {
            System.out.println("Underweight - try to eat more balanced meals.");
        } else if (bmi >= 18.5 && bmi < 25.0) {
            System.out.println("Norm - great! Your result is correct!");
        } else if (bmi >= 25.0 && bmi < 30.0) {
            System.out.println("Overweight - try to reduce the calorie content of meals.");
        } else if (bmi >= 30.0 && bmi < 35.0) {
            System.out.println("First degree obesity - we recommend to contact a doctor.");
        } else if (bmi >= 35.0 && bmi < 40.0) {
            System.out.println("Second degree of obesity - a visit to the doctor is necessary!");
        } else {
            System.out.println("Extreme obesity - your condition threatens your life and health!");
        }
    }
}

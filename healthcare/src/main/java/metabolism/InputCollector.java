package metabolism;

import metabolism.sexstrategy.SexValidator;

import java.util.Locale;
import java.util.Scanner;

public class InputCollector {

    private Scanner scanner;

    public InputCollector() {
        this.scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
    }

    public String collectName() {
        System.out.println("What's your name?");
        return scanner.nextLine();
    }

    public String collectSex() {
        System.out.println("Enter your sex typing F or M");
        return SexValidator.validate(scanner.nextLine());
    }

    public int collectAge() {
        System.out.println("How old are you");
        return scanner.nextInt();
    }

    public double collectWeight() {
        System.out.println("Please, enter your weight in [kg]:");
        return scanner.nextDouble();
    }

    public int collectHeight() {
        System.out.println("Please, enter your height in [cm]:");
        return scanner.nextInt();
    }

    public int collectLifestyle() {
        System.out.println("Please select your lifestyle:\n" +
                "1 - lying or sedentary lifestyle, lack of physical activity\n" +
                "2 - sedentary work, low level of physical activity\n" +
                "3 - not manual work, training twice a week\n" +
                "4 - light physical work, training 3-4 times a week\n" +
                "5 - physical work, training 5 times a week\n" +
                "6 - hard physical work, daily training\n");
        return scanner.nextInt();
    }
}

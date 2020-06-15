package metabolism.lifestyle;

public class LifestyleFactory {

    private static double LIFESTYLE_FACTOR = 0.2;

    public static double getLifestyle(int lifestyleInput) {
        if(lifestyleInput < 1  ||  lifestyleInput  > 5) {
            throw new IllegalArgumentException();
        }
        return 1 + (lifestyleInput * LIFESTYLE_FACTOR);
    }
}

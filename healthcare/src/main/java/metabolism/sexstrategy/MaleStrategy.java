package metabolism.sexstrategy;

public class MaleStrategy implements SexStrategy {

    @Override
    public double calculate(double weight, double height, int age) {
        return 65.5 + (13.7 * weight) + (5 * height) - (6.8 * age);
    }
}

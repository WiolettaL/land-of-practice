package metabolism.sexstrategy;

public class FemaleStrategy implements SexStrategy{

    @Override
    public double calculate(double weight, double height, int age) {
        return 655 + (9.6 * weight) + (1.85 * height) - (4.7 * age);
    }
}

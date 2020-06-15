package metabolism.sexstrategy;

public class SexDependentCalculator {

    private SexStrategy strategy;

    public SexDependentCalculator(String sex) {
        this.strategy = sex.equalsIgnoreCase("F") ? new FemaleStrategy() : new MaleStrategy();
    }

    public double calculate(double weight,double height, int age) {
        return strategy.calculate(weight, height, age);
    }
}

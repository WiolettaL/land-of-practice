package metabolism;

import metabolism.sexstrategy.SexDependentCalculator;

public class BasicMetabolismCalculator {

    String sex;
    double weight;
    double height;
    int age;

    public BasicMetabolismCalculator(String sex, double weight, double height, int age) {
        this.sex = sex;
        this.weight = weight;
        this.height = height;
        this.age = age;
    }

    public double calculateBasicMetabolism() {
        return new SexDependentCalculator(this.sex).calculate(this.weight, this.height, this.age);
    }
}

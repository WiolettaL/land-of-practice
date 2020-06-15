package metabolism;

import metabolism.lifestyle.LifestyleFactory;

public class CalculationProcessor {

    private UserInput userInput;

    public CalculationProcessor(UserInput userInput) {
        this.userInput = userInput;
    }

    public ResultSet calculateBmr() {
        BasicMetabolismCalculator calc = new BasicMetabolismCalculator(
                userInput.getSex(),
                userInput.getWeight(),
                userInput.getHeight(),
                userInput.getAge()
        );

        double bmr = calc.calculateBasicMetabolism();
        double lifestyleParameter = LifestyleFactory.getLifestyle(userInput.getLifestyle());
        return new ResultSet(bmr, bmr * lifestyleParameter);
    }
}

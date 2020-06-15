package metabolism;

public class MetabolismCalculator {
    public static void main(String[] args) {

        UserInput userInput = new InputProcessor().processCollectingData();
        ResultSet resultSet = new CalculationProcessor(userInput).calculateBmr();
        MessageWriter.writeMessage(userInput.getName(), resultSet);
    }
}

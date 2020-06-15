package metabolism;

public class MessageWriter {

    public static void writeMessage(String name, ResultSet resultSet) {

        System.out.println("Hi " + name + "!");

        System.out.println("Basic metabolism (BMR) - this is the amount of kcal that needs to be supplied to the body to maintain basic life function");
        System.out.println("Your BMR is: " + resultSet.getBmr());

        System.out.println("Your daily energy demand - to maintain the weight you currently have is: ");
        System.out.format("%.2f%n", resultSet.getDed());
    }
}

package metabolism.sexstrategy;

public class SexValidator {

    public static String validate(String sex) {
        if(!(sex.equals("F") || sex.equals("M"))) {
            throw new IllegalArgumentException("Error! Please enter correct sex sign!");
        }
        return sex;
    }
}

package metabolism;

public class ResultSet {

    private double bmr;
    private double ded;

    public double getBmr() {
        return bmr;
    }

    public double getDed() {
        return ded;
    }

    public ResultSet(double bmr, double ded) {
        this.bmr = bmr;
        this.ded = ded;
    }
}

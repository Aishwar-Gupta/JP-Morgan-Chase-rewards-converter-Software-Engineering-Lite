public class RewardValue {

    private double cash_value;
    private int miles_value;

    protected RewardValue(double cash){
        cash_value = cash;
    }

    protected RewardValue(int miles){
        miles_value = miles;
    }

    public void convert_from_cash_to_miles(double cash){
        miles_value = (int)this.miles_value + (int)(this.cash_value/0.0035);
    }

    public void convert_from_miles_to_cash(int miles){
        cash_value = this.cash_value + (this.miles_value * 0.0035);
    }

    public double getCashValue(){
        // return this.cash_value + (this.miles_value * 0.0035);
        return this.cash_value;
    }

    public int getMilesValue(){
        return this.miles_value;
        // return this.miles_value + (int)(this.cash_value/0.0035);
    }
}


/*
 * Create a RewardValue class

    Time to make your change - add a new class named RewardValue to the main.java package. Right-click on a directory 
    in the project tab on the left, then highlight new to create a Java Class.
    This class must satisfy the following requirements:
        RewardValue must have two constructors: one that accepts a cash value and one that accepts a value in miles.
        RewardValue must have a getCashValue() method, which returns the cash value of the RewardValue.
        RewardValue must have a getMilesValue() method, which returns how many miles the RewardValue is worth.
        RewardValue must convert from miles to cash at a rate of 0.0035.


        go, channels, checks,context, go interfaces, no class - structs
 */
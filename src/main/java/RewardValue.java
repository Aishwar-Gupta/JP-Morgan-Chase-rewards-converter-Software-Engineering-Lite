public class RewardValue {

    private double cash_value;
    private double miles_to_cash_rate = 0.0035;

    protected RewardValue(double cash){
        this.cash_value = cash;
    }

    protected RewardValue(int miles){
        this.cash_value = convertToCash(miles);
    }

    public int convertToMiles(double cash){
        return (int) (cash_value/miles_to_cash_rate);
    }

    public double convertToCash(int miles){
        return miles * 0.0035;
    }

    public double getCashValue(){
        return cash_value;
    }

    public int getMilesValue(){
        return convertToMiles(this.cash_value);
    }
}
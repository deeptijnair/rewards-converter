public class RewardValue {

    double cashValue;
    int miles;
    RewardValue(double cashValue){
        this.cashValue = cashValue;
    }

    RewardValue(int miles){
        this.miles = miles;
    }

    public double getCashValue() {
        return cashValue;
    }

    public int getMilesValue() {
      //  double cash = getCashValue();
        miles = (int) ((int)cashValue * 0.0035);
        return miles;
    }
}

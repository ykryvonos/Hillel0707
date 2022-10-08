package Homeworks.homework23;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Legal extends Client {

    final double COMMISSION = 1;
    public double finalSum;

    @Override
    void accountInfo() {
        System.out.println("Info about your account: replenishment from the account occurs without commission, withdrawal of money commission - "
                + COMMISSION + "%");
    }

    @Override
    void refill(int sum, int refillSum) {
        finalSum = sum + refillSum;
        System.out.println("You refill your account - " + refillSum + "$. Now in your account - " + round(finalSum, 2) + "$");
    }

    @Override
    void cashWithdrawal(int sum, int withdrawalSum) {
        double percent = withdrawalSum * COMMISSION / 100;

        if (sum - withdrawalSum - percent < 0) {
            System.out.println("You have exceeded your account limit");
        } else {
            finalSum = sum - withdrawalSum - percent;
            System.out.println("You withdrawal - " + withdrawalSum + "$, commission - " + round(percent, 2) + "$. Now in your account - " + round(finalSum, 2) + "$");
        }
    }

    @Override
    void accountBalance(int sum) {
        System.out.println("Account balance - " + sum + "$.");
    }

    private static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        BigDecimal bd = new BigDecimal(Double.toString(value));
        bd = bd.setScale(places, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}

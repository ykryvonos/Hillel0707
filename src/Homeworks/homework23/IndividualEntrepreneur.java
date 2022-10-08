package Homeworks.homework23;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class IndividualEntrepreneur extends Client {
    final double COMMISSION1 = 1.00;
    final double COMMISSION2 = 0.5;
    public double finalSum;

    @Override
    void accountInfo() {
        System.out.println("Info about your account: replenishment from the account occurs with a commission of " +
                COMMISSION1 + "% if the amount is less than $ 1000 and with a commission of " + COMMISSION2 + "%, for an amount of $ 1000 or more, " +
                "withdrawal of money from the account without commission.");
    }

    @Override
    void refill(int sum, int refillSum) {
        double percent;

        if (refillSum < 1000) {
            percent = refillSum * COMMISSION1 / 100;
        } else {
            percent = refillSum * COMMISSION2 / 100;
        }
        finalSum = sum + refillSum - round(percent, 2);
        System.out.println("You refill your account - " + refillSum + "$, commission - " + round(percent, 2) + "$. Now in your account - " + round(finalSum, 2) + "$");
    }

    @Override
    void cashWithdrawal(int sum, int withdrawalSum) {
        if (sum - withdrawalSum < 0) {
            System.out.println("You have exceeded your account limit");
        } else {
            finalSum = sum - withdrawalSum;
            System.out.println("You withdrawal - " + round(withdrawalSum, 2) + "$. Now in your account - " + round(finalSum, 2) + "$");
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

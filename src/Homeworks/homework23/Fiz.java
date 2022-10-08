package Homeworks.homework23;

public class Fiz extends Client {

    public double finalSum;

    @Override
    void accountInfo() {
        System.out.println("Info about your account: replenishment and withdrawal of money from the account occurs without commission");
    }

    @Override
    void refill(int sum, int refillSum) {
        finalSum = sum + refillSum;
        System.out.println("You refill your account - " + refillSum + "$. Now in your account - " + finalSum + "$");
    }

    @Override
    void cashWithdrawal(int sum, int withdrawalSum) {
        if (sum - withdrawalSum < 0) {
            System.out.println("You have exceeded your account limit");
        } else {
            finalSum = sum - withdrawalSum;
            System.out.println("You withdrawal - " + withdrawalSum + "$. Now in your account - " + finalSum + "$");
        }
    }

    @Override
    void accountBalance(int sum) {
        System.out.println("Account balance - " + sum + "$.");
    }

}

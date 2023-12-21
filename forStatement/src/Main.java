public class Main {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
        }
        for (double rate = 2.0; rate <= 5.0; rate++){
            double interestAmount = calculateInterest(10000.0, rate);
            System.out.println("10,000 ate " + rate + "% interest = " + interestAmount);
        }

        for (double i = 7.5; i <= 10; i+=0.25){
            double interestAmount = calculateInterest(100.00, i);
            if (interestAmount > 8.5){
                break;
            }
            System.out.println("$100.00 at " + i + "% interest = $" + interestAmount);
        }
    }
    public static double calculateInterest (double amount, double interestRate){
        return (amount * (interestRate/100));
    }
}
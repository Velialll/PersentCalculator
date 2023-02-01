import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the invested amount: ");
        double investedAmount = sc.nextDouble();

        System.out.print("Enter the interest rate: ");
        double interestRate = sc.nextDouble();

        System.out.print("Enter the number of period: ");
        double numberOfPeriod = sc.nextDouble();

        System.out.print("Result: ");
        SimplePercentCalculator( investedAmount, interestRate, numberOfPeriod);
    }
    static void SimplePercentCalculator(double investedAmount, double interestRate, double numberOfPeriod) {

        interestRate = interestRate / 100;
        numberOfPeriod = numberOfPeriod / 12;
        double amountReceived = investedAmount * (1 + (interestRate * numberOfPeriod));
        System.out.println(amountReceived);
    }
}

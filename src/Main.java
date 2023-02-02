import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("""
                Select the calculator you want:
                If you need Simple Percent Calculator press: 1
                If you need Compound Interest Calculator press: 2""");

        String text = sc.nextLine();

        if (text.equals("1")) {
            System.out.print("Enter the Initial Investment: ");
            double initialInvestment = sc.nextDouble();

            System.out.print("Enter the Estimated Interest Rate: ");
            double estimatedInterestRate = sc.nextDouble();

            System.out.print("Enter the Length Of Time In Month: ");
            double lengthOfTimeInMonth = sc.nextDouble();

            System.out.print("Result: ");
            SimplePercentCalculator(initialInvestment,
                    estimatedInterestRate,
                    lengthOfTimeInMonth);
        }

        if (text.equals("2")) {

            System.out.print("Enter the Initial Investment: ");
            double initialInvestment1 = sc.nextDouble();

            System.out.print("Enter the Estimated InterestRate: ");
            double estimatedInterestRate1 = sc.nextDouble();

            System.out.print("Enter the Monthly Contribution:");
            double monthlyContribution1 = sc.nextDouble();

            System.out.print("Enter the Length Of Time In Month: ");
            double lengthOfTimeInMonth1 = sc.nextDouble();

            System.out.println("Enter the Number Of Calculation Periods: ");
            double numberOfCalculationPeriods1 = sc.nextDouble();

            System.out.print("Result: ");
            CompoundInterestCalculator(initialInvestment1,
                    estimatedInterestRate1,
                    lengthOfTimeInMonth1,
                    monthlyContribution1,
                    numberOfCalculationPeriods1);
        }

    }

    static void SimplePercentCalculator(double initialInvestment,
                                        double estimatedInterestRate,
                                        double lengthOfTimeInMonth) {
        estimatedInterestRate /= 100.0;
        lengthOfTimeInMonth /= 12.0;
        double amountReceived = initialInvestment * (1.0 + estimatedInterestRate * lengthOfTimeInMonth);
        System.out.println(amountReceived);
    }

    static void CompoundInterestCalculator(double initialInvestment1,
                                           double estimatedInterestRate1,
                                           double monthlyContribution1,
                                           double lengthOfTimeInMonth1,
                                           double numberOfCalculationPeriods) {
        estimatedInterestRate1 /= 100.0;
        lengthOfTimeInMonth1 /= 12.0;
        numberOfCalculationPeriods /= lengthOfTimeInMonth1;


        double amountReceived = initialInvestment1 * (1.0 + estimatedInterestRate1);
        System.out.println(amountReceived);


    }
}
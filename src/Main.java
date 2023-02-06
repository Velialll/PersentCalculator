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

        /*if (text.equals("2")) {

            System.out.print("Enter the Initial Investment: ");
            double initialInvestment1 = sc.nextDouble();

            System.out.print("Enter the Estimated Interest Rate: ");
            double estimatedInterestRate1 = sc.nextDouble();

            //System.out.print("Enter the Monthly Contribution:");
            //double monthlyContribution1 = sc.nextDouble();

            System.out.print("Enter the Length Of Time In Month: ");
            double lengthOfTimeInMonth1 = sc.nextDouble();

            System.out.print("Enter the Number Of Calculation Periods: ");
            double numberOfCalculationPeriods1 = sc.nextDouble();

            System.out.print("Result: ");
        }*/
    }

    static void SimplePercentCalculator(double initialInvestment,
                                        double estimatedInterestRate,
                                        double lengthOfTimeInMonth) {
        estimatedInterestRate /= 100.0;
        lengthOfTimeInMonth /= 12.0;
        double amountReceived = initialInvestment * (1.0 + estimatedInterestRate * lengthOfTimeInMonth);
        System.out.println(amountReceived);
    }

    static void CompoundPercentDailyCapitalization(double money,
                                                   double percent,
                                                   int days){

        double result =money * Math.pow(1 + ((percent / 100) / 365 ), days);
        System.out.println("Compound percent Daily Capitalization = " + result);
    }
    static void CompoundPercentMonthlyCapitalization(double money,
                                                     double percent,
                                                     int numberOfOperation){

        double result = money  * Math.pow(1 + ((percent / 100) / 12), numberOfOperation);
        System.out.println("Compound percent Monthly Capitalization = " + result);
    }

    static void CompoundPercentQuarterlyCapitalization(double money,
                                                       double percent,
                                                       int quarterly){

        double result = money  * Math.pow(1 + ((percent / 100) / 4), quarterly);
        System.out.println("Compound percent Quarterly Capitalization = " + result);
    }
}
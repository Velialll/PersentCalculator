public class Temp {
    public static void main(String[] args) {

        double money = 350000;
        double percent = 4.7;
        int days = 273;
        int quarterly = 3;
        int numberOfOperation = days / 30;

        CompoundPercentDailyCapitalization(money,percent,days);
        CompoundPercentMonthlyCapitalization(money,percent,numberOfOperation);
        CompoundPercentQuarterlyCapitalization(money,percent,quarterly);
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

/*
   static double P = 10000.0;

    public static void main(String[] args) {
        double A;
        double A2;
        // double P = 10000.0;
        double I = 9.0;
        double T = 1.0;

        // I = I / 100;
        // System.out.println(I);
        double T1 = T / 12.0;
        // System.out.println(T);
       */
/* System.out.println(P);
        //A = P * (1 + (I * T));
       // System.out.println(A);
        A2 = P * (I * T);
        System.out.println(A2+"\n\n\n");*//*

 */
/**
 * 10000*(1-0.042)^5
 procent = 4.2 %
 balance * ( 1- (4.2%/100) ^ 5
 *//*


        // A = P * (1 + (I * T));
        //A = P * (1 + (I)^?
        // double operation2 = 10000 * (Math.pow(1 + 0.09, T * 1));
        //10000 * ( 1 + 0.09)^2
        // System.out.println("operation2 -> -> -> " +operation2);
       */
/**for (int i = 1; i <= 12; i++) {
 double A1 = P * Math.pow((1.0 + 0.09), T1);
 P = A1;
 System.out.println( i + " MONTH -" + " " + A1);
 }*//*

 */
/*int i = 1;
        while (i <= 24) {
            System.out.println("P = " + P);
            double A1 = P * Math.pow((1.0 + 0.09), T1);
            System.out.println("P = " + P);
            P = A1;
            System.out.println( i + " MONTH -" + " " + A1 + "\n");
            i++;*//*

        }


    }

}
*/
/**
 * S = S1*(1 + W)^tn
 * S = RES
 * S1 = DEP
 * W = PERCENT / 100
 * t = time (year)
 * n = periods
 */
public class Temp {
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
       /* System.out.println(P);

        //A = P * (1 + (I * T));
       // System.out.println(A);

        A2 = P * (I * T);
        System.out.println(A2+"\n\n\n");*/
        /**
         * 10000*(1-0.042)^5
         procent = 4.2 %
         balance * ( 1- (4.2%/100) ^ 5
         */

        // A = P * (1 + (I * T));
        //A = P * (1 + (I)^?
        // double operation2 = 10000 * (Math.pow(1 + 0.09, T * 1));
        //10000 * ( 1 + 0.09)^2
        // System.out.println("operation2 -> -> -> " +operation2);
        double P = 10000.0;
        for (int i = 1; i <= 12; i++) {



            double A1 = P1 * Math.pow((1.0 + 0.09), T1);
            P1 = A1;


            System.out.println( i + " MONTH -" + " " + A1);

        }
    }
    static double P1 = 1;
}
/**
 * S = S1*(1 + W)^tn
 * S = RES
 * S1 = DEP
 * W = PERCENT / 100
 * t = time (year)
 * n = periods
 */


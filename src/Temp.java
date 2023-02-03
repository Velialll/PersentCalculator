public class Temp {
    public static void main(String[] args) {
        double A;
        double A2;
        double P = 10000;
        double I = 15;
        double T = 1;//month

        I = I / 100;
        System.out.println(I);
        T = T / 12;
        System.out.println(T);
        System.out.println(P);

        A = P * (1 + (I * T));
        System.out.println(A);

        A2 = P * (I * T);
        System.out.println(A2+"\n\n\n\n\n\n");
        /**
         * 10000*(1-0.042)^5
         procent = 4.2 %
         balance * ( 1- (4.2%/100) ^ 5
         */

        A = P * (1 + (I * T));
        //A = P * (1 + (I)^?
        double operation2 = 10000 * (Math.pow(1 + 0.09, T));
        //10000 * ( 1 + 0.09)^2
        System.out.println("operation2  " +operation2);
    }
}

package MortgageCalc;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
        public Main() {
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Principal: ");
            double principal = scanner.nextDouble();
            System.out.print("Annual Interest Rate: ");
            double rate = scanner.nextDouble();
            System.out.print("Period (Years): ");
            double period = scanner.nextDouble();
            double p = principal;
            double r = (rate / 100) / 12;
            double n = period * 12;
            double x = Math. pow((1+r),n);
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            String mortgage = currency.format(p * ((r * x) / (x - 1)));
            System.out.println("Mortgage: " + mortgage + "/ month");
            String total = currency.format((p * ((r * x) / (x - 1))) * n);
            System.out.println("Total Pay Estimate: " + total);

        }

}

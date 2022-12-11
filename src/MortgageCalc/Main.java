package MortgageCalc;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float principal = 0;
        float rate = 0;
        float period = 0;

        while (true) {
            System.out.print("Principal (1K to 1M): ");
            principal = scanner.nextFloat();
            if (principal >= 1000 && principal <= 1_000_000)
                break;
            System.out.println("Please enter a value between 1,000 and 1,000,000");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            rate = scanner.nextFloat();
            if (rate >= 0.1 && rate <=50)
                break;
            System.out.println("Please enter a value between 0.1 and 50");
        }

        while (true) {
            System.out.print("Period (Years): ");
            period = scanner.nextFloat();
            if (period >= 1 && period <= 50)
                break;
            System.out.println("Please enter a value between 1 and 50");
        }

        float p = principal;
        float r = (rate / 100) / 12;
        float n = period * 12;
        double x = Math.pow((1 + r), n);
        double m = p * ((r * x) / (x - 1));
            //m is the monthly mortgage

        NumberFormat currency = NumberFormat.getCurrencyInstance();
        String mortgage = currency.format(m);
        System.out.println("Mortgage: " + mortgage + "/ month");
        String total = currency.format(m * n);
        System.out.println("Total Pay Estimate: " + total);

        }

    }
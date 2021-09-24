package calc1;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.security.SecureRandom;

// FIXME: Address/justify review comments
// TODO: Should be able to reuse the same payment system in another county/region with different tax percentage.
public class Payment {
    public static final SecureRandom RANDOM = new SecureRandom();
    // 1 = 100%
    private static final double TAX = 0.25D;

    // Test system this main method is
    public static void main(String[] args) {
        Payment payment = new Payment();
        // Selling stuff 0 - 1000 SEK only
        double cost = RANDOM.nextDouble() * 1000;

        // People always pay from 0 to 2000 SEK
        double paid = RANDOM.nextDouble() * 2000;

        System.out.println(payment.calculateRefund(cost, paid));
    }


    double calculateRefund(double cost, double paid) {
        System.out.println("cost: " + cost + ", paid: " + paid);

        return BigDecimal
                .valueOf((cost + (cost * TAX)) - paid)
                .setScale(2, RoundingMode.CEILING)
                .doubleValue();

    }
}


// 1- Unable to use calculateRefund() from another class com.finance.* ?
// 2- Why is BigDecimal used here, explain or let's not use it.

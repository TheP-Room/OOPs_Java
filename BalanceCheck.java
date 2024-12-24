package MortgageCalculator;
import java.lang.Math;
public class BalanceCheck {
    public static void balance(double principal, float mortgage){
        int i = 1;
        while(principal >= mortgage){
            principal -= mortgage;
            System.out.println("Balance after Month "+i+" : "+(float)Math.round(principal*100)/100);
            i++;
        }
    }
}

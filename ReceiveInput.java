package MortgageCalculator;
import java.util.Scanner;
public class ReceiveInput {
    private double principal;
    private float intrest;
    private int years;
    private final Scanner SC = new Scanner(System.in);

    public void setPrincipal(){
        System.out.print("Principal : ");
        double principal = SC.nextDouble();
        if(principal < 1_000 || principal > 10_00_000) {
            System.out.println("Enter a value between 1000 and 1000000");
            setPrincipal();
        }
        this.principal = principal;
    }
    public void setIntrest(){
        System.out.print("Annual Intrest : ");
        intrest = SC.nextFloat();
        if(intrest < 0 || intrest > 30) {
            System.out.println("Enter a value between 0 and 30");
            setIntrest();
        }
        intrest /= 1200;
    }
    public void setYears(){
        System.out.print("Period (Years) : ");
        years = SC.nextByte();
        if(years < 1 || years > 30) {
            System.out.println("Enter a value between 1 and 30");
            setYears();
        }
        years *= 12;
    }

    public double getPrincipal(){
        return principal;
    }
    public float getIntrest(){
        return intrest;
    }
    public int getYears(){
        return years;
    }

}

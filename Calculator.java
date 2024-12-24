package MortgageCalculator;

import java.lang.Math;

public class Calculator {
    public static float calculate(double principal, float intrest , int years){
        var power = Math.pow((1+intrest),years);
        var num =  principal*intrest*power;
        var den = power-1;
        var mortgage = num/den;
        System.out.println("Mortgage : $"+(float) Math.round(mortgage*100)/100);
        return (float) Math.round(mortgage*100)/100;
    }
}
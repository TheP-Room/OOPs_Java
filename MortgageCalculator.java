package MortgageCalculator;

public class MortgageCalculator {
    public static void main(String[] args){
        ReceiveInput object = new ReceiveInput();
        object.setPrincipal();
        object.setIntrest();
        object.setYears();
        var mortgage = Calculator.calculate(
                object.getPrincipal(),
                object.getIntrest(),
                object.getYears()
        );
        BalanceCheck.balance(object.getPrincipal(),mortgage);
    }
}

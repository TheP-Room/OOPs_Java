package Principles;

public class Employee implements CanHaveFun{
    private int baseSalary;
    private int hourlyRate;

    public static int noOfEmployees;

    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        noOfEmployees++;
    }
    @Override
    public String justFun(){
        return "FUNN";
    }
    public int calculateWage(int extraHours){
        /* first sign of oops i.e. no parameters to method compared to previous */
        return baseSalary + (extraHours * hourlyRate);
    }

    public int calculateWage(){ // method overloading
        return baseSalary;
    }
    private void setBaseSalary(int baseSalary){
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary can't be 0 or less.");
        this.baseSalary = baseSalary;
        /* throw keyword is used to raise an exception so that program will not
            get terminated on error
        */
    }
    private void setHourlyRate(int hourlyRate){
        if (hourlyRate <= 0)
            throw new IllegalArgumentException("Hourly rate can't be 0 or less.");
        this.hourlyRate = hourlyRate;
    }
}

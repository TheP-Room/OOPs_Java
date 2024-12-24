package Principles;

public class ProceduralToObjects {
    public static void main(String[] args){
        var employee = new Employee(50_000,100);
        System.out.println("$"+employee.calculateWage(12)+
                " & $"+employee.calculateWage());
        CanHaveFun fun;
        fun = employee;
        System.out.println("No of Employees : "+Employee.noOfEmployees+" "+fun.justFun());
    }
}

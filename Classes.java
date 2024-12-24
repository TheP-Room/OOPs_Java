public class Classes {
    public static void main(String[] args){
        /* Classes are like blueprint/template for creating objects while objects
            are instance of class
            there can be multiple objects and all of them are independent from each
             other

            fields are the portion of class which declares the variables
            methods are portion of class which consists of the functions

            in java it's preffered to write each class to separate file, it helps
             to organize the code in better way
        */
        var textBox1 = new TextBox(); // creating an instance of TextBox class
        /* var keyword automatically set the variable type by analysing the data
            after the equals sign
        */
        textBox1.setText("I am Box 1");
        System.out.println(textBox1.text);
        textBox1.clear();
        System.out.println(textBox1.text);


        /* java manages two parts of memory heap and stack
            stack stores all the primitive type variables and short term variables
            such as variables that store refrence to some other thing in heap

            heap stores the refrence types

            when a program is executed the type of variable at right side of equals
            is evaluated for refrence types it is then stored in heap then the left
            side is evaluated and it is given the address to that refrence type
            and then stored in stack

            means they do not store the value instead they do store the address to
            that object, hence creating multiple objects and assigning them to any
            one will be considered as same object as they both refer to same address
            and changes made to any of them is visible to all

            also after the program is completed java automatically clears the stack
            and also the refrence type in heap as the object will not be in use
        */

        /* First principle of OOPs
            Encapsulation

            it means to bundle the data and methods that operate on data in single
            unit
        */

        /* Getter and Setters

            it means to keep the fields private and access them using get or set
            methods
        */

        /* Second principle of OOPs
            Abstraction

            it means to reduce complexity by hiding unnecessary details

            Coupling

            it means how much one class is dependent on other class
            it directly relates to no of public fields and methods the less they
            are in number the better it is

            coupling can be reduced by dividing logic code into methods in the
            independent class and making it private
        */

        /* Use constructors to make program easy to use
        */

        /* Method Overloading

            it means to initialize multiple methods with same name but with
            different no of parameters to implement different operations

            constructors can be overloaded too

            for calling a constructor function inside same class we use
            this(parameters);
        */

        /* In OOPs a class can have two types of members
            instance members
            static members

            instance members belongs to object of that class and are accessible
            by the objects

            static members belongs to the class itself and do not require an object
            to be created to access it
            the class itself can access the static members

            ClassName.staticMethod || ClassName.staticField

            also inside static methods we can only call other static methods but
            can't call any instance methods

            main method is static to enable java to call main method without
            creating the object
        */
    }
}

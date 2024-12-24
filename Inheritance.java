public class Inheritance {
    public static void main(String[] args){
        /* Third principle of OOPs
            Inheritance is the concept to inherit functioning of parent
            class to child class

            keyword responsible for inheritance is "extends"

            Each class in java extends the "Object" class under java.lang package

            it inherits it's functions such as
            .equals() - checks for equality of two objects on basis of hashcode
             obj1.equals(obj2)
            .hashcode() - converts address of object to hash by encoding
            objects refrencing to same address will have same hashcode
            .toString() - returns string representation of an object including
            package name , class name and then it's hashcode in hexadecimal
        */

        /* When inheriting if both the classes have constructor then first
            the constructor of super/parent class is called then the constructor
            for child class is called

            if parent class constructor have some parameters then we need to
            define those parameters in constructor of child class using super
            keyword

            super(parameters);

            this super must be the first line of child class constructor
        */

        /* Access modifiers
            public - for any field that need to be accessed from anywhere
            private - for field that can only be accessed inside the class and
            not even the child class
            protected - for field that will act as public under same package and
            are accessed by child class even under different package

            if no access modifier is given than it means that it is public inside
            same package but private when packages are different
        */

        /* Method overriding
            we can change the functioning of any method inherited from parent class
            inside the child class

            for this first we need to provide an annotation to provide extra
            information to compiler, the annotation is
            @Override
            then we need to re-define the function as per our wish
            public String toString(){return "Changed";}
            it must have same return type / name / parameters type

            also if we simply prints an object it automatically executes the
            toString() method hence we don't need to call it explicitly
        */

        /* Upcasting and downcasting
            if a method accepts an object of a class as parameter and we
            provide it an object of one of child class then it will be
            called upcasting but inside function we can only use fields and
            methods of super class or we can say that during compile time
            we can only work with super class members

            to use the fields and methods of child class inside function we
            need to explicitly downcast super class to child class
            var anyName = (childClass)objectName; // downcasting

            if we are passing a super class object and then trying to
            explicitly cast that object to child class then it will throw
            an exception

        */

        /* "instanceof" is used to identify whether the object belongs to
            that class or not
            object instanceof class // will return true if object belongs to class
            also .getClass() can be used to identify the class of object

            to compare two objects we can override the equals() method and hashcode
            method
        */

        /* Fourth principle of OOPs
            Polymorphism - mutliple forms

            when we declare an array of objects for a parent class and iterate
            over the array then the variable used for iteration can take multiple
            forms of different objects of child classes
            eg
            parentClass[] anyName = { new childClass1 , new childClass2 }
            for ( var o : anyName )

            here 'o' will take multiple forms as object of childClass1 and
            then object of childClass2

            hence we can create an empty method in parent class and then
            override it in all other child class to efficiently use it
        */

        /* Abstract classes and methods
            if we don't want to allow creating objects to a class we can define
            the class as abstract it simply means that the abstract class is just
            a blueprint for other child classes and the abstract methods inside
            the class needs to be override in each child class

            public abstract class Name{}

            public abstract void function();
            now this abstract method need to be override in each child class

            if a method inside class is marked abstract then the class needs to
            be marked as abstract too
        */

        /* final classes and methods
            if we don't want to allow extending a class then we can define it
            final hence there can be no inheritance for that class

            public final class Name{}

            if we don't want any function to be overriden in child class then
            we use final methods

            public final void function(){};
        */
    }
}

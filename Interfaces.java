public class Interfaces {
    public static void main(String[] args){
        /* we use interfaces to build application loosely coupled, extensible,
            and testable

            we use them in classes by the keyword "implements"

            interfaces are contracts while abstract classes are shared code
            interfaces only contains method declaration while abstract classes
            do carry the logic code

            simply we use it when a class is first creating objects to other class
            then using them so it means that the class is tightly coupled to another
            now to loose them we use interfaces the steps are
            1 - create a private field of interface type in that class
            2 - using constructor/setter/methodOverriding take the objects
            that were created by that class first as inputs but of type interfaces
            and equate them to the fields
            3 - now using these fields call the required function
            ** interface type variables can hold implemented class objects

            private CanEncode encoder;
            private CanManageDatabase manageDatabase;
            private CanServiceEmail serviceEmail;

            public VideoProcessor(CanEncode encode,
                          CanManageDatabase manageDatabase,
                          CanServiceEmail serviceEmail
                          ){
                                this.encoder = encode;
                                this.manageDatabase = manageDatabase;
                                this.serviceEmail = serviceEmail;
                            }
            public void process(Video video) {
                encoder.encode(video);
    // the class containg encoder function must implement CanEncode interface
                manageDatabase.store(video);
                serviceEmail.sendEmail(video.getUser());
            }

            tightly coupled code needs the dependent classes to be changed each
            time we make a change in independent class if no strict changes are
            made then also the code needs to be recompiled each time even for
            minor changes

            interfaces do not carry any fields or code for implementation it just
            carries the method declaration and class implementing that
            interface will override the method with same type and parameters

            in simple terms interfaces declare methods then anyone of class
            implements that interface and initialize the declared methods
            then other classes can create a variable of interface type
            and set the value of that variable equal to object of the class
            which initialize the implemented method and then can call the
            method using that interface variable

            if value of interface variable is set to another class object
            which implemented the method diffrently then it will also give output
            differently means it is respective to object of class

            it is done so that classes will not have to create objects instead
            take objects as input using constructors, setters or methods and
            set the interface variable equal to them and use the methods with
            interface variable

            interfaceName anyName;
            anyName = objectOfAnyImplementedClass;
            // at place of objectOfAnyImplementedClass name we can also use
            // new className();
            anyName.implementedMethod();

            any class can implement an interface using "implements" keyword

            also methods inside interface do not need to be explicitly declared
            public as they are pre defined to be used in implementing class but
            in the implementing class we must define it public and also add
            override annotation

            public interface CanAnyName{
                String funName(parameters if any);
            }
        */

        /* Dependency injection states that our classes should not deal with
            instantiating objects of other classes instead they just need to use
            them

            we can use various ways to inject dependency such as
            constructor injection - using constructor to get implemented class object
            and set it equal to interface variable
            setters injection - using a setter method to get that object and equating
            with interface variable
            method injection - using the implemented method in same class to get
            interface variable as paramter and performing the call
        */

        /* It is preffered to divide different kind of methods to different
            interfaces as if they are in same interface and we have to edit any one
            of them then the all other need to be recompiled too
        */

        /* In java class can't have multiple inheritance but an interface can
            have as in case of interfaces if there are two identical methods in
            parent interfaces it will only inherit one of them
        */
    }
}

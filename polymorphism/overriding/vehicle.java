/* method overriding is a concept where a subclass provides a specific implementation of a method already defined in its parent class. The method in the child class must have the same name, return type, and parameters as the method in the parent class.
=>It is used for runtime (dynamic) polymorphism. 
=>The method in the child class must have the same signature (name, return type, and parameter list) as the parent method.
=>The @Override annotation is optional but recommended — it helps catch errors at compile time 
=>Static methods cannot be overridden — they belong to the class, not instances.
=>Constructors cannot be overridden.*/

public abstract class vehicle {

    public void start() {
        System.out.println("vehicle is starting....");
    }
}

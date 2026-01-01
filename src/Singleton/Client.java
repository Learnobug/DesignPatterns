package Singleton;


// Client code to demonstrate Singleton pattern
// It ensures that a class has only one instance and provides a global point of access to it
// This is useful for managing shared resources like configuration settings or connection pools
// It also helps in controlling access to resources and can be used for logging, caching, etc.
public class Client {
    public static void main(String[] args) {
      //Singleton Pattern Demo
        single instance1 = single.getInstance();
        single instance2 = single.getInstance();
        System.out.println("Instance 1 Name: " + single.getName());
        System.out.println("Instance 2 Name: " + single.getName());
        System.out.println(instance1 == instance2); // should print true
    }
}

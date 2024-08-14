// Step 1: Define a Functional Interface
@FunctionalInterface
interface MyFunctionalInterface {
    void execute(String message);
}

public class LambdaExample {
    public static void main(String[] args) {
        // Step 2: Implement the Functional Interface using a Lambda Expression
        MyFunctionalInterface myFunc = (message) -> {
            System.out.println("Message received: " + message);
            System.out.println("Thank You");
        };
        
        // Step 3: Use the Functional Interface
        myFunc.execute("Hello, Lambda!");
    }
}

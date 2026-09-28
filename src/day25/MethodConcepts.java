package day25;

public class MethodConcepts {
    int a;// global/class level variables
    int b;

    public void addition() {
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is : " + sum);
    }

    public void subtraction() {
        int subtract = a - b;
        System.out.println("The Difference of " + a + " and " + b + " is : " + subtract);
    }

    public void multiplication() {
        int product = a * b;
        System.out.println("The Product of " + a + " and " + b + " is : " + product);
    }
}

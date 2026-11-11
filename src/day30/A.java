package day30;

public class A implements Base {
    @Override
    public void addition(int a, int b) {
        int sum = a + b;
        System.out.println("Addition: " + sum);
    }

    @Override
    public void subtraction(int a, int b) {
        int diff = a - b;
        System.out.println("Subtraction: " + diff);
    }

    @Override
    public void multiplication(int a, int b) {
        int product = a * b;
        System.out.println("Multiplication: " + product);
    }

    @Override
    public void division(int a, int b) {
        int divide = a / b;
        System.out.println("Division: " + divide);
    }
}

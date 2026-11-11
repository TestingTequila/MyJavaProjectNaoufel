package day30;

public class B implements Base{
    @Override
    public void addition(int a, int b) {
        int sum = 2*a + b;
        System.out.println("Addition: " + sum);
    }

    @Override
    public void subtraction(int a, int b) {
        int diff = 2*a - b;
        System.out.println("Subtraction: " + diff);
    }

    @Override
    public void multiplication(int a, int b) {
        int product = 2*a * b;
        System.out.println("Multiplication: " + product);
    }

    @Override
    public void division(int a, int b) {
        int divide = 2*a / b;
        System.out.println("Division: " + divide);
    }
}

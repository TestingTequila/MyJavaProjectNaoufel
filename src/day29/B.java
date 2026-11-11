package day29;

public class B extends Base{

    @Override
    public void addition(int a, int b) {
        int sum = 2*a+b;
        System.out.println("Addition by B: " + sum);
    }
}

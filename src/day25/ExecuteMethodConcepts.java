package day25;

public class ExecuteMethodConcepts {
    static void main() {

        MethodConcepts mc = new MethodConcepts();
        mc.a = 12;
        mc.b = 8;
        mc.addition();//12+8 =20
        mc.subtraction();//12=8 = 4
        mc.multiplication(); //12* 8 = 96

        System.out.println("=====MethodsWithParameters");

        MethodWithParameters mwp = new MethodWithParameters();
        mwp.addition(12, 8);
        mwp.subtraction(35, 7);
        mwp.multiplication(4, 5);
    }
}

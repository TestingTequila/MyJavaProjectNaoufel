package day28;

public class TestInheritance {
    static void main() {

        System.out.println("=====Class A=======");
        A a = new A();
        a.addition(12, 14);

        System.out.println("=====Class B=======");

        B b = new B();
        b.addition(12, 4);
        b.subtraction(12, 4);

        System.out.println("=====Class C=======");

        C c = new C();
        c.addition(12, 4);
        c.subtraction(12, 4);
        c.multiplication(12, 4);

        System.out.println("=====Class D=======");

        D d = new D();
        d.addition(12, 4);
        d.subtraction(12, 4);
        d.multiplication(12, 4);
        d.division(12, 4);

        System.out.println("=====P-C==========");
        C c1 = new D();
        c1.addition(12,4);
        c1.subtraction(12,4);
        c1.multiplication(12,4);

        //ex: WebDriver driver = new ChromeDriver();

        //Html+Locators[xpath]+Java ==> Selenium

    }
}

package day25;

public class ExecuteMethodConcepts2 {
    static void main() {
        MethodConcepts2 mc = new MethodConcepts2();
        mc.fName = "Jason";
        mc.lName = "Hill";

        mc.printFullName();

        System.out.println("======================================");

        MethodConcepts2 mc1 = new MethodConcepts2();
        mc1.fName = "Ben";
        mc1.lName = "Fletcher";
        mc1.printFullName();

        System.out.println("=========================================");
    }
}

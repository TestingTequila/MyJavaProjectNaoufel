package day18;

public class MathOperations {
    static void main() {

        System.out.println("===Case 1: I/I = pick only the integer part=====");
        System.out.println(10 / 2); //5
        System.out.println(10 / 3); //3
        System.out.println(9 / 2); //4

        System.out.println("=====Case 2: I/D or D/I or D/D = i+d part=======");

        System.out.println(10 / 3.0);//3.3333333333333335
        System.out.println(9.0 / 2); //4.5
        System.out.println(8.2 / 2.2); // 3.7272727272727266

        System.out.println("=====Case 3: N%D= Remainder=======");

        System.out.println(9 / 2); // 4
        System.out.println(9.0 / 2.0); //4.5
        System.out.println(9 % 2); //1
        System.out.println(10 % 2);//0
        System.out.println(9.2 % 2);//1.9

    }
}

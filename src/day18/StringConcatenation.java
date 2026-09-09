package day18;

public class StringConcatenation {
    static void main() {

        String x = "Hello";
        String y = "World";

        int a = 100;
        int b = 200;

        System.out.println("The sum of a & b is : " + a + b); //The sum of a & b is : 100200
        System.out.println("The sum of a & b is : " + (a + b)); //The sum of a & b is : 300


        System.out.println(x);//Hello
        System.out.println(y);//World
        System.out.println(a); //100
        System.out.println(b); //200

        System.out.println(x + y); //Hello+World ==> HelloWorld
        System.out.println(a + b); //100+200     ==> 300

        System.out.println(x + a); //Hello+100   ==> Hello100
        System.out.println(a + b + x); // 100+200+Hello ==> 300+Hello ==> 300Hello
        System.out.println(x + y + a + b); //Hello+World+100+200 ==>HelloWorld100200
        System.out.println(a + b + x + y + b + a); //300HelloWorld200100

        System.out.println(146.1 + "Justin" + 200.56 + "Roger");

        int z = 300;
        System.out.println("The value of Z is : " + z);
    }
}

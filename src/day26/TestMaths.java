package day26;

public class TestMaths {
    static void main() {
        Maths math = new Maths();
        math.addition1(12, 4); //return void

        int total2 = math.addition2(12, 4); //return int a
        System.out.println("Total 2: " + total2); //12

        int total3 = math.addition3(12, 4); //return int b
        System.out.println("Total 3: " + total3); //4

        int total4 = math.addition4(12, 4); //return int sum
        System.out.println("Total 4: " + total4*5); //16

    }
}

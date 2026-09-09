package day18;

public class PreDecrement {
    static void main() {

        System.out.println("====pre decrement operator=========");
        int a = 1;
        int b = a;
        System.out.println(a);//1
        System.out.println(b);//1

        int x = 1;
        int y = --x;
        System.out.println(x);//0
        System.out.println(y);//0


        int c = 99;
        int d = --c;
        System.out.println(c);//98
        System.out.println(d);//98


        int e = -99;
        int f = --e;
        System.out.println(e);//-100
        System.out.println(f);//-100


        double p = 10.45;
        double q = --p;
        System.out.println(p);//9.45
        System.out.println(q);//9.45

        char ch = 'a';
        System.out.println(++ch);//b
        System.out.println(ch);//b

        int num =10;
        System.out.println(num++); //10
        System.out.println(num);//11

        int total = 10;
        System.out.println(total++);//10
        System.out.println(total);//11

        int sum = 100;
        System.out.println(++sum);//101
        System.out.println(sum);//101


    }
}

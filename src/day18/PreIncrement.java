package day18;

public class PreIncrement {
    static void main() {

        System.out.println("====pre increment operator=========");
        int a = 1;
        int b = a;
        System.out.println(a);//1
        System.out.println(b);//1

        int x = 1;
        int y = ++x;
        System.out.println(x);//2
        System.out.println(y);//2


        int c = 99;
        int d = ++c;
        System.out.println(c);//100
        System.out.println(d);//100


        int e = -99;
        int f = ++e;
        System.out.println(e);//-98
        System.out.println(f);//-98


        double p = 10.45;
        double q = ++p;
        System.out.println(p);//11.45
        System.out.println(q);//11.45


    }
}

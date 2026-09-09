package day18;

public class PostDecrement {
    static void main() {

        System.out.println("====post decrement operator=========");
        int a = 1;
        int b = a;
        System.out.println(a);//1
        System.out.println(b);//1

        int x = 1;
        int y = x--;
        System.out.println(x);//0
        System.out.println(y);//1


        int c = 99;
        int d = c--;
        System.out.println(c);//98
        System.out.println(d);//99


        int e = -99;
        int f = e--;
        System.out.println(e);//-100
        System.out.println(f);//-99

        double p = 10.45;
        double q = p--;
        System.out.println(p);//9.45
        System.out.println(q);//10.45



    }
}

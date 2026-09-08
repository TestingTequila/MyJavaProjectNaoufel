package day17;

public class DataTypeConcepts {

    static void main() {

        byte x = -128;  // 1 byte or 8 bits [-128 to 127]

        System.out.println(x);

        short x1 = -32768;  // 2 byte or 16 bits [-32768 to 32767]

        System.out.println(x1);

        int x2 = -214748364;  // 4 byte or 32 bits [-2147483648 to 2147483647]

        System.out.println(x2);

        long x3 = 2147483648L;  // 8 byte or 64 bits

        System.out.println(x3);
        //100, 27

        byte y = 100;
        byte z = 30;

        int sum = y + z;
        System.out.println(sum);
    }
}

//1. If the number that you are storing, will be used in any mathematical operation, use 'int' as data type
//2. we are not using the number for mathematical calculation, check the range of number and assign the
//   data type to  which it belongs
//3. If the number lies in the range of multiple data types, choose the one that takes least memory
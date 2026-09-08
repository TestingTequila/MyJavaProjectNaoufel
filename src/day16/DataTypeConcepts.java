package day16;

public class DataTypeConcepts {

    static void main() {

        // non-decimal number [byte, short, int, long], float, double, char, boolean
        // I want to store the number 10
                byte  y = 10;

                //I want to store the number 150

        //Data Type [memory consumption & range]

        // 1 byte = 8 bits
        byte x = -128;  // 1 byte or 8 bits [-128 to 127]

        short x1 = -32768;  // 2 byte or 16 bits [-32768 to 32767]

        int x2 = -214748364;  // 4 byte or 32 bits [-2147483648 to 2147483647]

        long x3 = 2147483648L;  // 8 byte or 64 bits

        //When a number lies in the range of multiple data types, we choose the one with least memory consumption
    }
}

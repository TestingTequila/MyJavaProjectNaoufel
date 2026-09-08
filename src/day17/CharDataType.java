package day17;

public class CharDataType {
    static void main() {
        //char --> 2 byte [16 bits]
        //         range[a-z][A-Z][!@#$%^&*()_-+={}][0-9]

        char c1 = 'a';
        char c2 = 'B';
        char c3 = '$';
        char c4 = '1';//49
        char c5 = '2';//50
        System.out.println(c4);//1
        System.out.println(c5);//2

        System.out.println(c4 + c5);//99
        System.out.println(c1 + c2); //a(97)+B(66) => 163

        int i1 = 1;
        int i2 = 2;

        System.out.println(i1 + i2);//3

        System.out.println((int)'a');
        System.out.println((int)'B');
        System.out.println((int)'$');

        System.out.println((char)97);
        System.out.println((char)66);
    }
}

// a char value will act as char data type till the time we don't perform mathematical operations using them

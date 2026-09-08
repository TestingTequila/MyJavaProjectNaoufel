package day17;

public class DecimalNumbers {

    static void main() {

        //float --> 4 byte (32 bits) //Range [5/6 decimal places]
        //double--> 8 byte (64 bits) //Range [more than 6 decimal places]

        float f1 = 1.1234567899F;
        System.out.println(f1);
        double d1 = 1.1234567899;
        System.out.println(d1);
    }
}


//non-decimal numbers: [byte, short, int, long] ---> int
//decimal numbers    : [float, double]          ---> double
//single character   : [char]
//true/false         : [boolean]
package day19;

public class IfStatementExample
{
    static void main() {

        System.out.println("======WAP to check if a person is eligible to Vote or Not============");
        int age = 25;

        if(age>=18)
        {
            System.out.println("Person Can Vote....");
        }
        else
        {
            System.out.println("Person can't Vote, below the defined age");
        }

        System.out.println("============WAP to check if a number is positive or negative========");

        int num = -44;
        if(num>0)
        {
            System.out.println("This is a positive number ");
        }
        else
        {
            System.out.println("This is a negative number ");
        }
    }
}


//90 + ==> Outstanding
//80-90 ==> Excellent
//70-80 ==> Very Good
//60-70 ==> Good
//60-50 ==> Average
//40-50 ==> Work Hard
// below 40 ==> Fail
package day19;

public class IfElseIfElseStatement {
    static void main() {
//90 + ==> Outstanding
//80-90 ==> Excellent
//70-80 ==> Very Good
//60-70 ==> Good
//60-50 ==> Average
//40-50 ==> Work Hard
// below 40 ==> Fail


        int marks = 96;

        if(marks>=90)
        {
            System.out.println("Outstanding");
        }
        else if (marks<90 & marks>=80)
        {
            System.out.println("Excellent");
        }
        else if (marks<80 & marks>=70)
        {
            System.out.println("Very Good");
        }
        else if (marks<70 & marks>=60)
        {
            System.out.println("Good");
        }
        else if (marks<60 & marks>=50)
        {
            System.out.println("Work Hard");
        }
        else
        {
            System.out.println("Fail");
        }
    }
}

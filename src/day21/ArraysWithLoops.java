package day21;

import java.util.Arrays;

public class ArraysWithLoops {
    static void main() {

        //dataType[] name = {value1, value2, value3.........};
        System.out.println("====Marks=====");
        int[] marks = {45, 67, 78, 98, 23, 45, 66, 100, 74};
        //System.out.println(marks.length); //9
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);
        System.out.println(marks[6]);
        System.out.println(marks[7]);

        System.out.println("====while loop=====");

        int i =0;
        while (i<marks.length)
        {
            System.out.println(marks[i]);
            i++;
        }

        System.out.println("====for loop=====");

        for (int j =0;j<marks.length;j++)
        {
            System.out.println(marks[j]);

        }

        System.out.println("====Advanced for loop=====");

        for(int m :marks)
        {
            System.out.println(m);
        }

        System.out.println("====Direct Array Printing=====");
        System.out.println(Arrays.toString(marks));



        System.out.println("==============students==================");
        //Leon, Naoufel, Lee, Kerrie, Lisa, Mike

        String[] students = {"Leon", "Naoufel", "Lee", "Kerrie", "Lisa", "Mike"};
        //System.out.println(students.length);//6
        System.out.println(students[0]);
        System.out.println(students[1]);
        System.out.println(students[2]);
        System.out.println(students[3]);
        System.out.println(students[4]);
        System.out.println(students[5]);

        System.out.println("====while loop=====");

        int k =0;
        while (k<students.length)
        {
            System.out.println(students[k]);
            k++;
        }

        System.out.println("====for loop=====");

        int l =0;
        while (l<students.length)
        {
            System.out.println(students[l]);
            l++;
        }

        System.out.println("====Advanced for loop=====");

        for(String s : students)
        {
            System.out.println(s);
        }

        System.out.println("====Direct Array Printing=====");
        System.out.println(Arrays.toString(students));



        System.out.println("==============temp=================");
        // 12.34, 45.67, 67.89, 12.33
        double[] temp = {12.34, 45.67, 67.89, 12.33};
        //System.out.println(temp.length);//4
        System.out.println(temp[0]);
        System.out.println(temp[1]);
        System.out.println(temp[2]);
        System.out.println(temp[3]);

        System.out.println("====while loop=====");

        int m =0;
        while (m<temp.length)
        {
            System.out.println(temp[m]);
            m++;
        }

        System.out.println("====for loop=====");

        int n =0;
        while (n<temp.length)
        {
            System.out.println(temp[n]);
            n++;
        }

        System.out.println("====Advanced for loop=====");

        for(double d : temp)
        {
            System.out.println(d);
        }

        System.out.println("====Direct Array Printing=====");
        System.out.println(Arrays.toString(temp));


       //dataType name = value;

       // dataType name;
       // name = value;



    }
}

package day21;

import java.util.Arrays;

public class ArrayConcepts2 {
    static void main() {

        int x;
        x = 100;
        //I want to store the marks of 6 students

        // dataType name = new DataType[count];

        int[] marks = new int[6];
        marks[0] = 300;
        marks[5] = 800;
        marks[3] = 560;
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);

        System.out.println("====Direct Method======");
        System.out.println(Arrays.toString(marks));

        System.out.println("====While loop Method======");
        int i = 0;
        while (i < marks.length) {
            System.out.println(marks[i]);
            i++;
        }

        System.out.println("====for loop Method======");

        for (int j = 0; j < marks.length; j++) {
            System.out.println(marks[j]);
        }

        System.out.println("====advanced for loop Method======");

        for (int d : marks) {
            System.out.println(d);
        }


    }
}

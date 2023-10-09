package Opgaver;

import com.sun.jdi.LocalVariable;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] num = new int[5]; // Her der blevet reseveret plads i computerens hukomelse til 5 heltal
        num[0] = 3;
        num[1] = 7;
        num[2] = 0;
        num[3] = -3;
        num[4] = 9;

        int[] num2 = {4, 2, 7, 4, 8, 2, 5, 3, 8, 5, 4};

        System.out.println(num);
        for (int i = 0; i < 5; i++)
            System.out.println(num[i]);
        int s = sum(num);
        System.out.println("sum= " + s);

        for (int i = 0; i < 5; i++)
            System.out.println(num[i]);

        int s2 = sum(num2);
        System.out.println("sum af sum2 = " + s2);
        for (int i = 0; i < num2.length; i++)
            System.out.println(num2[i]);
    }
    static int sum(int[] arr){ // static kan bruges kun i den klasse og alle klasser i den klasse. ikke udenfor klassen
        int result = 0;
        for (int i = 0; i<arr.length; i++)
            result=result+arr[i];
        arr[2]=1000;
        return result;

    }

}

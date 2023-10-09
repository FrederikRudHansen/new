package Opgaver;

import java.util.Random;

public class Opgave4_DetMindsteOgSt
{
    public static void main(String[] args) {
        Random gen=new Random();

        int a, b, c;
        a = gen.nextInt(10+1);
        b = gen.nextInt(10+1);
        c = gen.nextInt(10+1);
        System.out.println(a+" "+b+" "+c);

        if (a<c){
            if (c<b){
                System.out.println(a+" "+b);
            }
        }
        if (a<b)
        {
            if (b<c) {
                System.out.println(a + " " + c);
            }

        }
        if (b<a){
            if (a<c){
                System.out.println(b+" "+c);
            }
        }

        if (b<c){
            if (c<a) {
                System.out.println(b + " " + a);
            }
        }
        if (c<a){
            if(a<b){
                System.out.println(c+" "+b);
            }
        }
        if (c<b){
            if (b<a){
                System.out.println(a + " " + c);
            }
        }


        System.out.println("done");
    }
}

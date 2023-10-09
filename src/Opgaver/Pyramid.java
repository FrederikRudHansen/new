package Opgaver;

import java.util.Random;

public class Pyramid {
    public static void main(String[] args) {
Random gen=new Random();

//        pyramid p1= new pyramid(5,5,6);
//        pyramid p2= new pyramid(7,6,3);
//        pyramid p3= new pyramid(99,285,1000);
pyramid p1= new pyramid(gen.nextInt(25+1), gen.nextInt(25+1), gen.nextInt(25+1));
pyramid p3= new pyramid(gen.nextInt(25+1), gen.nextInt(25+1), gen.nextInt(25+1));
pyramid p2= new pyramid(gen.nextInt(25+1), gen.nextInt(25+1), gen.nextInt(25+1));
        System.out.println(p3);
        System.out.println(p2);
        System.out.println(p1);

    }
    static class pyramid{

        int side1;
        int side2;
        int height;
        double volume;
        pyramid (int s1, int s2, int he){
            side1=s1;
            side2=s2;
            height=he;
            volume=side1*side2*height/4;

    }


        @Override
        public String toString() {
            return "Volumen af de tre pyramider:\n "+volume;
        }
    }
}

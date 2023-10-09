package Opgaver;

import java.util.Random;

public class Terning2 {
    public static void main(String[] args) {
        Random gen=new Random();

        int Terning= gen.nextInt(6)+1;
String tal="";
        switch (Terning) {

            case 1: tal = "1";
                break;
            case 2: tal = "2";
                break;
            case 3: tal = "3";
                break;
            case 4: tal = "4";
                break;
            case 5: tal = "5";
                break;
            case 6: tal = "6";
                break;

        }
        System.out.println(tal);
    }
}

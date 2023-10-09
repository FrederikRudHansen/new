package Opgaver;

import java.util.Random;

public class DollarTilEuro {
    public static void main(String[] args) {
        Random gen=new Random();

        double euro,dollar,Kommission;
        dollar= gen.nextDouble(200.05)+0.5;
        euro=dollar*0.92;
        Kommission=euro*0.02;

        System.out.printf("\n Veksler %.2f $ til Euro = %.2f €", dollar, euro);
        System.out.printf("\n \n Indtjening fra Kommission: %.2f \n",Kommission);
    }
}

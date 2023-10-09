package Opgaver;

import java.util.Random;
import java.util.Scanner;

public class ValutaRegner {
    public static void main(String[] args) {
        double penge, euro, dkk, nok, isk,sek;
        double result;
        Scanner Keyboard= new Scanner(System.in);
char valuta;


euro=0.13;
nok=1.53;
sek=1.59;
isk=19.25;


        while(true){
            System.out.println("Velkommen til Valuta Regner");
            System.out.print("Indtast mængde penge eller 0 for at stoppe: ");
            dkk = Keyboard.nextDouble();
            if(dkk == 0) break;
            System.out.println("valutaer");
            System.out.println("euro: 0,13: for at vælge denne valuta tast: e");
            System.out.println("sek: 1,59: for at vælge denne valuta tast: s");
            System.out.println("nok: 1,53: for at vælge denne valuta tast: n");
            System.out.println("isk 19,25: for at vælge denne valuta tast: i");
            System.out.print("Indtast valuta: ");


            valuta=Keyboard.next().charAt(0);



            switch(valuta){

                case 'e':
                    result = euro*dkk;
                    break;
                case 'n':
                    result = nok*dkk;
                    break;
                case 's':
                    result=sek*dkk;
                    break;
                case 'i':
                    result=isk*dkk;
                    break;
                default:
                    System.out.println("ugyldig valuta");
                    System.out.println();
                    continue;



            }
            System.out.println(dkk+" dkk omregnet til "+result);
            System.out.println();

        }//while

    }
}

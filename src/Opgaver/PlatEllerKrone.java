package Opgaver;// import java.util.Random; skal være der hvis man skal bruge koden Random
import java.util.Random;

public class PlatEllerKrone {
    public static void main(String[] args) {
        Random gen=new Random();
        int tal=gen.nextInt(2);

        System.out.println("tal="+tal);

        if (tal==0) {
            System.out.println("Plat");
            System.out.println("Tillykke du vandt!!");
        }
        else {
            System.out.println("Krone");
            System.out.println("Tabte");
        }

            System.out.println("tak for i dag");


    }
}

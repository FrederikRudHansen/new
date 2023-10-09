package Opgaver;

import java.util.Random;

public class Alder {
    public static void main(String[] args) {
        Random gen=new Random();

        int alder;
        alder = gen.nextInt(18)+1;
        if (alder >= 18){
            System.out.println("alder:"+alder+" man er myndig");
        } else
            if ( alder >=13 ){
                System.out.println("alder:"+alder+" ik myndig");
            } else
                if (alder >=5){
                    System.out.println("alder:"+alder+" lille Barn");
                } else
            if (alder >=2){
        System.out.println("alder:"+alder+" baby...");
    }else
                System.out.println("spædbarn");

    }
}

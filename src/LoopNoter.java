public class LoopNoter {
    public static void main(String[] args) {


        int alder;
        alder = 15;
        while (alder < 18){ //Når alderen er under 18 læser den koden her
            System.out.println("Du er "+alder+" ikke myndig");
            alder = alder+1;
            System.out.println("Tillykke med Fødselsdagen");
        } // når alderen så er 18 stopper den koden. og læser koden nedenunder
        System.out.println("Du er "+alder+" du er myndig");



        // hvordan man bruger Math.sqrt
        int n;
        n = 0;
        while (n <= 10){
            System.out.println("kvadratroden af: "+n+" = "+ Math.sqrt(n));
            n = n+1;
        }
        int m;
        m = 1;
        while (m <=10){
            System.out.println("7 tabellen "+m+" : " + m*7);
            m = m+1;
        }

        //For Løkken
        // Initialisering tildeling af en tækkevariabel, f.esk. alder = 15
        //betingelse: løkken skal fortsætte indtil alder = <18
        // Opdatering: ændring af variabel alder = alder + 1

        for (int c=1; c<=10; c=c+1){
            System.out.println(c+ " : "+ 7*c);
        }
        for (int a=1; a<=10; a++){
            int sum = 0;
            for ( int b=0; b<a; b++){
                sum = sum +7;
                System.out.print(sum+"..");
            }
            System.out.println(" syv gange "+a+" giver: "+ sum);
        }
    }
}


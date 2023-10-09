import java.util.Scanner;

public class tester {
    public static void main(String[] args) {
        Scanner tast = new Scanner(System.in);
boolean stadig = true;
        System.out.println("Sten Saks, PAPIRRRR");
        System.out.println();

        // Indtaster spillernes navne
        System.out.print("Indtast spiller 1 navn: ");
        String spiller1= tast.nextLine();
        System.out.println();
        System.out.print("Indtast spiller 2 navn: ");
        String spiller2= tast.nextLine();


        System.out.println();
        System.out.println("Spillet begynder");
        System.out.println();

       while(stadig) {
           System.out.print(spiller1 + " vælg sten, saks eller papir: ");
           String valg1 = tast.nextLine();
           System.out.println("\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n \n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
           System.out.print(spiller2 + " vælg sten. saks eller papir: ");
           String valg2 = tast.nextLine();


           if (valg1.equals(valg2)) {
               System.out.println("uafgjort");

           } else if
           (valg1.equals("sten") && valg2.equals("saks")) {
               System.out.println(spiller1 + " vinder");
break;
           } else if (valg1.equals("saks") && valg2.equals("papir")) {
               System.out.println(spiller1 + " vinder");
break;
           } else if (valg1.equals("papir") && valg2.equals("sten")) {
               System.out.println(spiller1 + " vinder");
break;
           } else {
               System.out.println(spiller2 + " vinder");
               break;
           }

       }


    }
}

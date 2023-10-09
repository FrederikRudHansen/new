package Opgaver;

public class Opgaver_Math {
    public static void main(String[] args) {
        // Opgave 1 Skriv et program, som ud fra længde og bredde på et rektangel udskriver dets areal.
        int Width, Length, Area;
        Width = 5;
        Length = 6;

        Area = Width * Length;

        System.out.println("Opgave 1: Area = " + Area);

        // Opgave 2 Skriv et program, som for ligningen y=3*x*x+6*x+9 udskriver værdien af y for x=7.
        int x, y;
        x = 7;
        y = 3*x*x+6*x+9;

        System.out.println("Opgave 2: y =" + y);

        // Opgave 3 Skriv et program, som omregner et beløb fra dollar til euro (f.eks. kurs 95)

        double euro, dollar, kurs;

        dollar = 100;
        kurs = 95;
        euro = 100 * 0.95;

        System.out.println("Opgave3: Dollar til Euro =" + euro);

        //opgave 4: Skriv et program, som udskriver tre tilfældige tal (lavet med Math.random()), deres sum og gennemsnittet.

        double RandomNr1, RandomNr2, RandomNr3, summen, Gennemsnit;

        RandomNr1 = Math.random();
        RandomNr2 = Math.random();
        RandomNr3 = Math.random();
        summen = RandomNr1+RandomNr2+RandomNr3;
        Gennemsnit = summen/3;
        System.out.println("Tre numre " +RandomNr1+" "+RandomNr2+" "+RandomNr3+" "+"summen af 3 tal = "+summen+" gennemsnit = "+Gennemsnit);

        //Opgave 5: Hvad skriver følgende program ud? Hvis du kan regne det ud, uden at køre programmet, har du forstået idéen i tildelinger.




    }

}
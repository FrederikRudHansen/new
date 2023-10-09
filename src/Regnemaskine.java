import java.util.InputMismatchException;
import java.util.Scanner;

public class Regnemaskine {
    public static void main(String[] args) {
       Scanner keyboard = new Scanner(System.in);
       char op;
       double tal1;
       double tal2;
double result = 0;

boolean stop = false;
while (true) {
    System.out.println("Velkommen til regnemaskinen");
    System.out.println(" + for addition");
    System.out.println(" - for subtraktion");
    System.out.println(" / for division");
    System.out.println(" * for mulitplikation");
    System.out.println(" q for quit");
    System.out.print("Indtast operator: ");
        op=keyboard.next().charAt(0);
if (op=='q') break;

tal1=inputDouble("Indtast tal 1: ");
tal2=inputDouble("Indtast tal 2: ");


  //  System.out.print("Indtast tal 2 =" );
  //  tal2=keyboard.nextDouble();

   switch(op){
       case '+':
           result =tal1+tal2;
       break;
       case '-':
           result =tal1-tal2;
           break;
       case '*':
           result =tal1*tal2;
           break;
       case '/':
           result =tal1/tal2;
           break;
       default:
           System.out.println("ugyldig operator");
           System.out.println();
        continue;
   }
    System.out.println("resultatet er = "+result);
    System.out.println();

}//while
        System.out.println("ses");
    }//main
    static double inputDouble(String prompt) {

        Scanner keyboard=new Scanner(System.in);
        boolean ok=false;
        double tal=0;

        do {
            try{
                System.out.print(prompt);
                tal=keyboard.nextDouble();
                ok=true;
            } catch(InputMismatchException e) {
                System.out.println("Ulovlig input. Prøv igen");
                keyboard.nextLine();
            }

        } while(!ok);
        return tal;
    }

}

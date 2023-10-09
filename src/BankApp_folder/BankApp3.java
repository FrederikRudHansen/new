package BankApp_folder;

import javax.swing.*;
import java.time.LocalDate;
import java.util.ArrayList;

public class BankApp3 {
    public static void main(String[] args) {
         Account a1=new Indlaan("Joe Pass", 5);
        System.out.println("\n");
        Account a2=new Hojrente("Jimmy Hendrix",10,10000,LocalDate.of(2023,6,24));
        Account a3= new Kredit("Joe Hendrix", 7);

        a3.deposit(100);
        a3.withdraw(500);
        a3.printTransactions();
        a3.withdraw(9601);

//        ArrayList<Account> list= new ArrayList<>();
//        list.add(a1);
//        list.add(a2);
//        list.add(a3);
//
//        for (Account a: list) a.printTransactions();
//        for (Account a: list) a.deposit(100);
//        for (Account a: list) a.printTransactions();

    }
}
class Indlaan extends Account{
Indlaan(String ow, double ir){
super(ow,ir);

    }

    void withdraw(double amount) { // det der står i parantesen er lokal variablen.
    if (balance>=amount){
        super.withdraw(amount); // super betyder man henter "infomationerne" fra overklassen. Så man ikke skal skrive alt igen
    }                           // brugen af super skal bruges når der skal stå det samme
    else {
        System.out.println("Du kan højst hæve "+balance+" kr");
    }

    }
 }

 class Hojrente extends Account {
    LocalDate releaseDate;
     Hojrente(String ow, double ir, double startBalance, LocalDate rd){
         super(ow, ir);
         super.deposit(startBalance);
         releaseDate=rd;

     }

     void deposit(double amount){
         System.out.println("Du kan ikke sætte penge ind på denne konto");

     }
     void withdraw (double amount){
         if(releaseDate.isAfter(LocalDate.now()))
             System.out.println("du kan først hæve efter release date");
         else
        super.withdraw(amount);
     }



 }

 class Kredit extends Account {
     Kredit(String ow, double ir){
         super(ow, ir);
     }

     void withdraw(double amount){
         double minusbalance = balance-amount;
         double granse = -10000;
         double MuligWithdraw = balance - granse;
         if(minusbalance>granse)
             super.withdraw(amount);
         else
             System.out.println("Du er igang med at hæve "+ amount+ " du kan maksimalt hæve "+MuligWithdraw+" lige nu");

     }
 }
package BankApp_folder;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class BankApp2 {
    public static void main(String[] args) {
        Scanner tastatur=new Scanner(System.in);
        Account a1=new Account("Joe Pass",5);
        Account a2=new Account("Jimmy Hendrix",2);

        // static er til når metoden ikke er til objekter.

a1.deposit(100);
a1.withdraw(50);


a1.anualInterest();
a2.anualInterest();


        a1.printTransactions();
        a2.printTransactions();
    }



}
 class Account{
    protected static int noOfAccounts=0; //static foran variabel: der kun en kopi af hver static

    protected int accountNo;
    protected String owner;
    protected double balance;         //penge på konto
    protected double interestRate;    // årlig rente i %
    protected ArrayList<transaction> transactions=new ArrayList<transaction>(); // Arraylist for at bevare transaktioner

    Account( String ow, double ir){
        noOfAccounts++;
        accountNo =noOfAccounts; // Begreb: Instance variable
        owner=ow;
        interestRate=ir;
        balance=0;
    }

    void setOwner(String NewName){
        owner=NewName;
    }
    void deposit(double amount){
        balance=balance+amount;
        transactions.add(new transaction("Indsat", amount, balance));
    }
    void withdraw(double amount){
        balance=balance-amount;
        transactions.add(new transaction("Hævet", amount, balance));
    }

    void anualInterest(){
        double amount=balance*interestRate/100;
        balance=balance+amount;
        transactions.add(new transaction("renter", amount, balance));


    }
    void printTransactions(){
        System.out.println(this);
        System.out.println("Tekst\t   dato\t\tbeløb\t saldo");

        for (transaction t: transactions)
            System.out.println(t);
        System.out.println();
    }



    @Override
    public String toString() {
        return "Kontonr: "+accountNo+"\t"+owner+"\t"+balance;
    }

}

class transaction {
    String text;
    LocalDate date;
    double amount;
    double newBalance;

    transaction(String text, double amount, double newBalance) {
        this.text=text;
        this.amount=amount;
        this.newBalance=newBalance;
        date=LocalDate.now();
    }

    @Override
    public String toString() {
        return text+"\t"+date+"\t"+amount+"\t"+newBalance;
    }
}





package Opgaver;

import java.util.Random;
import java.util.Scanner;

public class Guess_nr {
    static Random gen = new Random();
    public static void main(String[] args) {
        Boolean KeepGoing = true;
        Scanner Keyboard = new Scanner(System.in);
        int a;
        int b;
        b = gen.nextInt(20 + 1);
        System.out.println("skriv tal: ");
        a = Keyboard.nextInt();

while (KeepGoing) {
    if (a < b) {
        System.out.println("højere");
        a = Keyboard.nextInt();
    } else if (a > b) {
        System.out.println("lavere");
        a = Keyboard.nextInt();
    } else KeepGoing = false;

}
        System.out.println("rigtigt");
    }
}

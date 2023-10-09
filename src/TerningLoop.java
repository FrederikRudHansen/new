import javax.swing.*;
import java.util.Random;

import static javax.swing.JOptionPane.YES_NO_OPTION;

public class TerningLoop {
    public static void main(String[] args) {


        Random gen = new Random();

            int dice;  // [1,6]
            String activity = "";
            int Answer;
            boolean KeepGoing=true;
                System.out.println("Diceman1");

                while (KeepGoing) {
                     dice = gen.nextInt(6) + 1;

                     if (dice == 1) {
                        activity = "breakfeast";
                    } else if (dice == 2) {
                        activity = "Study";
                    } else if (dice == 3) {
                        activity = "Go fishing";
                    } else if (dice == 4) {
                        activity = "Call mom";
                    } else if (dice == 5) {
                        activity = "Swim";
                    } else if (dice == 6) {
                        activity = "Go to bed";
                    }
                    System.out.println(activity);
                    //if (dice==6) KeepGoing=false;
                    Answer=JOptionPane.showConfirmDialog(null,activity+"\n Try again?", "Diceman",JOptionPane.YES_NO_OPTION);
                    if (Answer == JOptionPane.NO_OPTION) KeepGoing=false;

                }
                System.out.println(activity);

            System.out.println("Goodbye");
    }
}



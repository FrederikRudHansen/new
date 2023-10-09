import java.util.Random;

public class Terning {
    public static void main(String[] args) {

        Random gen=new Random();

        int dice= gen.nextInt(6)+1; // [1,6]
        String activity="";

        System.out.println("Diceman1");
        if (dice==1) {
            activity="breakfeast";
        } else
        if (dice==2) {
            activity="Study";
        } else
        if (dice==3) {
            activity="Go fishing";
        } else
        if (dice==4) {
            activity="Call mom";
        } else
        if (dice==5) {
            activity="Swim";
        } else
        if (dice==6) {
            activity="Go to bed";
        }
        System.out.println(activity);
        System.out.println("Goodbye");

    }
}

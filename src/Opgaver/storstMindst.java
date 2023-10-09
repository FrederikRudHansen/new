package Opgaver;

import java.util.Scanner;

public class storstMindst {
    public static void main(String[] args) {
        Scanner keyboard= new Scanner(System.in);
        int a, b, c;
        a=keyboard.nextInt();
        b=keyboard.nextInt();
        c=keyboard.nextInt();
        int storst;
int mindst;
        if (a>b && a>c) {
            storst = a;
        }
            else
                if (b>c){
                storst=b;
            } else
                storst=c;
        System.out.println("største = "+ storst);

        if (a<b && a<c){
            mindst = a;
        } else if (b<c){
            mindst = b;
        } else mindst = c;
        System.out.println("mindst = "+ mindst);


    }
}

import static javax.management.Query.plus;

public class Sum3 {
    public static void main(String[] args) {
        int a = 3;
        int b=5;
        int c=18;
        double sum;

        sum=plus(a,b,c);
        System.out.println("summen er "+sum);
    }// plus er metodens navn
    static double plus(int x,int y,int z){
        int result=x+y+z;
        return result;
    }
}
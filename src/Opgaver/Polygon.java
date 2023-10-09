package Opgaver;

public class Polygon {
    public static void main(String[] args) {

        Point[] p= new Point[5];
        p[0]= new Point(4,6);
        p[1]= new Point(2,7);
        p[2]= new Point(6,2);
        p[3]= new Point(9,6);
        p[4]= new Point(7,10);

        printDist(p);

    }

    static void printDist(Point[] array){
        for (int i=0; i<array.length; i++) {
            double dst = array[i].dist(array[(i+1)%array.length]);
            System.out.println(dst);
        }
    }
}

class Point {
    double x;
    double y;

    Point(double px, double py){
        x=px;
        y=py;
    }

    public double dist(Point p) {
        double a = this.x - p.x;
        double b = this.y - p.y;
        return Math.sqrt(a*a + b*b);
    }

    public String toString() {
        return "("+x+","+y+")";
    }

    static int sum(int[] arr){ // static kan bruges kun i den klasse og alle klasser i den klasse. ikke udenfor klassen
        int result = 0;
        for (int i = 0; i<arr.length; i++)
            result=result+arr[i];
        return result;
    }
}

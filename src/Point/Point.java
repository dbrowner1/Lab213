package Point;

/**
 * superclass
 */
public class Point {
    private double x; //x- coordinate
    private double y; //y- coordinate

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    public double getX(){
        return x;
    }

    public double getY(){
        return y;
    }

    public String toString(){
        return "(" + x + ", " + y + ")";
    }


    //distance method - static

    public static double distance (Point p1, Point p2 ){
        return Math.sqrt(Math.pow(p1.x - p2.x, 2)  + Math.pow(p1.y - p2.y, 2 ));
    }
}

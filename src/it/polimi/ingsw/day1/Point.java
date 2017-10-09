package it.polimi.ingsw.day1;

/**
 * Created by giovanniquattrocchi on 09/10/17.
 */
public class Point {

    float x;
    float y;

    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }

    public double distance(Point p){
        return Math.sqrt(Math.pow(x-p.x, 2)+Math.pow(y-p.y,2));
    }

    public static void main(String[] args){

        Point o = new Point(0, 0);
        Point p = new Point(0, 1);

        System.out.println(o.distance(p));

    }

}

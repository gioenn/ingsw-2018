package it.polimi.ingsw.day3;

import java.util.ArrayList;
import java.util.List;

public abstract class Polygon {

    public abstract float getPerimeter();
    public abstract String getName();

    public static void printPolygon(Polygon polygon){
        System.out.println("Il perimetro del "
                +polygon.getName()+" è "+
                polygon.getPerimeter());
    }

    public static void printPolygons(List<Polygon> polygons){
        for (Polygon p : polygons)
            printPolygon(p);
    }

    public static void main(String[] args){
        Square square = new Square(5);

        Rectangle rectangle = new Rectangle(1,1);

        Triangle triangle = new Triangle(2,2,2);

        List<Polygon> polygons = new ArrayList<>();
        polygons.add(square);
        polygons.add(triangle);
        polygons.add(rectangle);

        printPolygons(polygons);

        //it.polimi.ingsw.day1.Polygon p = new it.polimi.ingsw.day1.Polygon();

    }

}

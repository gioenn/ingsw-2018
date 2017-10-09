package it.polimi.ingsw.day1;

/**
 * Created by giovanniquattrocchi on 09/10/17.
 */
public class Polygon {

    Point[] vertices;

    public Polygon(int numVertices){
        vertices = new Point[numVertices];
    }

    public void setVertex(int i, float x, float y){
        vertices[i-1]= new Point(x, y);
    }

    public float perimeter(){
       float res = 0;

       for (int i = 0; i < vertices.length - 1 ; i++){
           res += vertices[i].distance(vertices[i+1]);
       }

       res += vertices[vertices.length - 1].distance(vertices[0]);

       return res;
    }

    public static void main(String[] args){
        Polygon p = new Polygon(4);
        p.setVertex(1, 0, 0);
        p.setVertex(2, 0, 1);
        p.setVertex(3, 1, 1);
        p.setVertex(4, 1, 0);

        System.out.println("Il perimetro del poligono è "+p.perimeter());
    }

}

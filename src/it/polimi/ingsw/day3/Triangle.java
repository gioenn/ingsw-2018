package it.polimi.ingsw.day3;

public class Triangle extends Polygon {

    private float e1, e2, e3;

    public Triangle(float e1, float e2, float e3){
        this.e1 = e1;
        this.e2 = e2;
        this.e3 = e3;
    }

    @Override
    public float getPerimeter() {
        return e1+e2+e3;
    }

    @Override
    public String getName() {
        return "Triangolo";
    }
}

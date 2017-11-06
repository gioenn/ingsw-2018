package it.polimi.ingsw.day3;

public class Square extends Polygon {

    private float edge;

    public Square(float edge){
        this.edge = edge;
    }

    @Override
    public float getPerimeter() {
        return 4.0f*edge;
    }

    @Override
    public String getName() {
        return "Quadrato";
    }
}

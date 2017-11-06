package it.polimi.ingsw.day3;

public class Rectangle extends Polygon {

    private float e1, e2;

    public Rectangle(float e1, float e2){
        this.e1 = e1;
        this.e2 = e2;
    }

    @Override
    public float getPerimeter() {
        return 2*(e1+e2);
    }

    @Override
    public String getName() {
        return "Rettangolo";
    }
}

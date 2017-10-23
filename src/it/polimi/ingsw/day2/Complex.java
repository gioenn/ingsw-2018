package it.polimi.ingsw.day2;

public class Complex {


    private double real, imaginary;

    public Complex(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    public double abs(){
        return Math.sqrt(this.real * this.real +
                this.imaginary * this.imaginary);
    }

    public double phase(){
        if(real > 0)
            return Math.atan(this.imaginary/this.real);
        else if(real < 0 && imaginary >= 0)
            return Math.atan(this.imaginary/this.real+Math.PI);
        else if(real < 0 && imaginary < 0)
            return Math.atan(this.imaginary/this.real-Math.PI);
        else if(real == 0 && this.imaginary > 0)
            return Math.PI/2;
        else if(real == 0 && imaginary < 0)
            return -Math.PI/2;
        else
            return -999999;
    }

    public Complex sum(Complex other){
        return new Complex(real + other.real,
                imaginary + other.imaginary);
    }

    public Complex sub(Complex other){
        return new Complex(real - other.real,
                imaginary - other.imaginary);
    }

    public boolean approximatelyEquals(Complex other, double precision){
        return Math.abs(real - other.real) < precision &&
                Math.abs(imaginary - other.imaginary) < precision;
    }
}

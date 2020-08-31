package chapter6;

public class Rectangle {
    private double length;
    private double width;

    //default constructor (no parameter passed)
    public Rectangle(){
        this.length = 0;
        this.width = 0;
    }

    //constructor with parameter
    public Rectangle(double _length, double _width){
        this.length = _length;
        this.width = _width;
    }

    //constructor using setter to assign value
    //public Rectangle(double _length, double _width){
         //setLength(_length);
         //setWidth(_width);
    //}

    //getter method for length
    public double getLength(){
        return length;
    }

    //setter method for length
    public void setLength(double _length){
        this.length = _length;
    }

    //getter method for width
    public double getWidth(){
        return width;
    }

    //setter method
    public void setWidth(double _width){
        this.width = _width;
    }

    public double calculatePerimeter(){
        return (2 * length) + (2 * width);
    }

    public double calculateArea(){
        return length * width;
    }
}

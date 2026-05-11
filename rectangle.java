package kethua;

public class rectangle extends shape {
    private double width = 1.0;
    private double length = 1.0;

    //Contructor
    rectangle(){}
    rectangle(double width, double length){
        this.width = width;
        this.length = length;
    }
    rectangle(double width, double length,String color, boolean filled){
        super(color,filled);
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length) {
        this.length = length;
    }
    @Override
    public double getArea() {
        return length*width;
    }
    @Override
    public double getPerimeter() {
        return (length+width)*2;
    }
    @Override
    public String toString() {
        return "Rectangle["+ super.toString()+"width=" + width +" " + "length"+ length+"]";
    }
}


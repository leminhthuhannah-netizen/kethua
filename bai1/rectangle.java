package kethua.bai1;

public class rectangle extends shape {
    //Sử dụng protected thay vì private để gây mâu thuẩn về conflict resolution
    protected double width ;
    protected double length ;

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


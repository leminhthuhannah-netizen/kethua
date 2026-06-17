Hhdidjssdshdsid

package kethua;

public class circle extends shape {
    private double radius = 1.0;
    //Contructor
    public circle(){}
    public circle(double radius){
        this.radius = radius;
    }
    public circle(double radius,String color,boolean filled){
        super(color,filled); // gọi shape đầu tiên nếu ko sẽ lỗi 
        this.radius = radius;
    }

    // getters setters cua hinh tron de bao mat
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    @Override
    public String toString() {
        return "Circle["+ super.toString()+"radius=" + radius +"]";
    }

    //Tính diện tích
    @Override
    public double getArea() {
        return Math.PI *radius*radius;
    }
    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    
}

package kethua;

public class circle extends shape {
    private double radius = 1.0;
    public circle(){}
    public circle(double radius){
        this.radius = radius;
    }
    public circle(double radius,String color,boolean filled){
        super(color,filled); // gọi shape đầu tiên nếu ko sẽ lỗi 
        this.radius = radius;
    }
    
}

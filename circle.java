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
    // getters setters
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    //Để biến toString thành riêng của circle ta cần thay đổi trong nó  -- ghi đè
    @Override
    public String toString() {
        return "Circle["+ super.toString()+"radius=" + radius +"]";
    }

    //phuong thuc tinh toan
    //Tính diện tích
    public double getArea(){
        return Math.PI *radius*radius;
    }
    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }
    
}

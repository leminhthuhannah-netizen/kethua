package kethua;
public abstract class shape {
    private String color = "red";
    private boolean filled = true;
    // Tạo contructor
    public shape(){}
    public shape(String color, boolean filled){
        this.color = color;
        this.filled = filled;

    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    //Việc dùng is biến cái tên phương thức thành một câu nghi vấn. 
    // Đọc code sẽ giống như đang đọc tiếng Anh tự nhiên vậy
    public boolean isFilled() {
        return filled;
    }
    public void setFilled(boolean filled) {
        this.filled = filled;
    }
    //toString trong lớp cha Object là như này:
    // @Override
    // public String toString() {
    //     // TODO Auto-generated method stub
    //     return super.toString();
    
    @Override
    public String toString() {
        return "Shape[color=" + color + ", filled=" + filled + "]";
    }


    //Phương thức chung về trừu tượng 
    public abstract double getArea();
    public abstract double getPerimeter();
}

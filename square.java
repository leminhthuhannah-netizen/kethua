package kethua;

public class square extends rectangle {
    //contructor
    public square(){}
    public square(double side){
        super(side, side);
    }
    public square(double side,String color,boolean filled){
        super(side, side, color, filled);
    }

    //Lấy get, set của lớp cha
    public double getSide(){
        return getWidth();
    }
    public void setSide(double side){
        setLength(side);
        setWidth(side);
    }


    //Ghi đè length width tránh trường hợp 2 cạnh ko bằng nhau
    @Override
    public void setLength(double side) {
        super.setLength(side);
        super.setWidth(side);

    }
    @Override
    public void setWidth(double side) {
        super.setWidth(side);
        super.setLength(side);
    }

    @Override
    public String toString() {
        return "Square[" + super.toString() + "]";
    }
}

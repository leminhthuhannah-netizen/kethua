package kethua.bai2;

public class circle2 extends shape2 {
    private float ban_kinh;

    public circle2(){

    }
    public circle2(float ban_kinh){
        this.ban_kinh = ban_kinh;
        this.loai_hinh_hoc = "Hinh Tron";
    }
    @Override
    public String toString() {
        return super.toString()+ "[Ban kinh: " + ban_kinh+ "Dien tich:" + tinh_dien_tich() + "]";
    }
    public void setBan_kinh(float ban_kinh) {
        this.ban_kinh = ban_kinh;
    }
    public float getBan_kinh() {
        return ban_kinh;
    }

    @Override
    public float tinh_dien_tich() {
        // ép kiểu : (kieu du lieu) bien
        //Vì math là kiểu double nên phải ép về float
        return (float) (Math.PI * getBan_kinh() *getBan_kinh());
    }

    
    

}

package kethua.bai2;

public class rectangle2 extends shape2{
    private float chieu_dai;
    private float chieu_rong;

    public rectangle2(){}
    public rectangle2(float chieu_dai, float chieu_rong){
        this.chieu_dai = chieu_dai;
        this.chieu_rong = chieu_rong;
        this.loai_hinh_hoc = "Hinh Chu Nhat";
    }
    
    public void setChieu_dai(float chieu_dai) {
        this.chieu_dai = chieu_dai;
    }
    public float getChieu_dai() {
        return chieu_dai;
    }
    public void setChieu_rong(float chieu_rong) {
        this.chieu_rong = chieu_rong;
    }
    public float getChieu_rong() {
        return chieu_rong;
    }
    
    @Override
    public String toString() {
        return super.toString() + "[Chieu dai:" + chieu_dai + ", " + "Chieu rong: " + chieu_rong +", " + "Dien tich: " + tinh_dien_tich() + "]";
    }

    @Override
    public float tinh_dien_tich() {
        return chieu_dai*chieu_rong;
    }
}

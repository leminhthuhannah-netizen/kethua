package kethua.bai2;

public class shape2 {
    protected String loai_hinh_hoc;

    //Phuong thuc
    public float tinh_dien_tich(){
        return 0;
    }

    @Override
    public String toString() {
        return "Loai hình: " + loai_hinh_hoc;
    }

}

package kethua.testbai;

import kethua.ontap.child;
import kethua.ontap.father;
import kethua.ontap.mother;

public class testpeop {
    public static void main(String[] args) {
        father f1 = new father();
        f1.skill(); //Do void 
        //sysout(f1.skill()); Này là return cần in ra các kiểu dữ liệu còn lại

        mother m1 = new mother();
        m1.skill();

        child c1 = new child();
        c1.skill();


//Đơn kế thừa (Có thể có nhiều cấp)
// vd: shape <- Hcn <- Hv (nhiều cấp nhưng vẫn là đơn kế thừa)
//JVM 
//Đa kế thừa (Một lớp con có thể kế thừa từ nhiều lớp cha)









    }
}

package Bai1;
import java.io.Serializable;
import java.util.*;
/**
 *
 * @author vanqu
 */
public class SinhVien extends Nguoi{
    private String maSV;
    private Diem diem = new Diem();

    public void nhapSV(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma sinh vien: ");
        maSV=sc.nextLine();
        super.nhapNguoi();
        System.out.println("Nhap diem cho sinh vien: ");
        diem.nhapDiem();
    }
    static void tieuDe(){
        System.out.printf("%-10s| %-15s| %-10s| %-10s| %-10s| %-10s| %-10s| %-10s| \n",
                "MaSV","HoTen","Tuoi","GioiTinh","Mon 1","Mon 2","Mon 3","DTB");
    }
    @Override
    public String toString(){
        String fm = String.format("%-10s| ",maSV) + super.toString() + diem.toString();
        return fm;
    }

    public Diem getDiem() {
        return diem;
    }


}

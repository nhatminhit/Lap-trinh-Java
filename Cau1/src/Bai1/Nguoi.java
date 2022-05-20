package Bai1;
import java.io.Serializable;
import java.util.*;
/**
 *
 * @author vanqu
 */
public class Nguoi implements Serializable{
    protected String hoTen;
    protected int tuoi;
    protected String gioiTinh;

    public Nguoi() {
        super();
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void nhapNguoi(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten: ");
        hoTen=sc.nextLine();
        System.out.print("Nhap tuoi: ");
        tuoi=sc.nextInt();
        sc.nextLine();
        System.out.print("Nhap gioi tinh: ");
        gioiTinh=sc.nextLine();
    }
    @Override
    public String toString(){
        String fm = String.format("%-15s| %-10s| %-10s|",hoTen, tuoi, gioiTinh);
        return fm;
    }

}

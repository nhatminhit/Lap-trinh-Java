package Bai1;
import java.io.Serializable;
import java.util.*;
/**
 *
 * @author vanqu
 */
public class Diem implements Serializable{
    private float mon1, mon2, mon3;

    public Diem() {
        super();
    }


    public Diem(float mon1, float mon2, float mon3) {
        this.mon1 = mon1;
        this.mon2 = mon2;
        this.mon3 = mon3;
    }

    public float getMon1() {
        return mon1;
    }

    public float getMon2() {
        return mon2;
    }

    public float getMon3() {
        return mon3;
    }

    public float DTB(){
        float kq=(mon1+mon2+mon3)/3;
        return kq;

    }

    public void nhapDiem(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap diem mon 1: ");
        mon1=sc.nextFloat();
        System.out.print("Nhap diem mon 2: ");
        mon2=sc.nextFloat();
        System.out.print("Nhap diem mon 3: ");
        mon3=sc.nextFloat();
    }
    @Override
    public String toString(){
        String fm = String.format("%-10s| %-10s| %-10s| %-10s| \n",mon1, mon2, mon3,DTB());
        return fm;
    }
}


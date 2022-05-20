package Bai1;
import java.util.*;
/**
 *
 * @author vanqu
 */
public class QLSV {
    static ArrayList<SinhVien> dsSV = new ArrayList<>();
    static String tep = "Data.dat";
    public static void main(String[] args){
//        SinhVien sv1 = new SinhVien();
//        sv1.nhapSV();
//        SinhVien.tieuDe();
//        System.out.println(sv1.toString());
        Scanner sc = new Scanner(System.in);
        int chon;
        do{
            System.out.println("===MENU CHUONG TRINH===");
            System.out.println("1. Nhap du lieu");
            System.out.println("2. Hien thi");
            System.out.println("3. Hien thi neu DTB >=5");
            System.out.println("4. Thoat");
            System.out.print("Nhap lua chon: ");
            chon= sc.nextInt();
            switch(chon){
                case 1:
                    taoDS();
                    break;
                case 2:
                    xuatDS();
                    break;
                case 3:
                    dtbHon5();
                    break;
            }
        }while(chon!=4);
        System.out.println("Chuong trinh da ket thuc!");
    }
    public static void taoDS(){
        try {
            Scanner sc = new Scanner(System.in);
            int chon;
            System.out.println("1. Nhap danh sach");
            System.out.println("2. Doc tu file");
            System.out.print("Nhap lua chon: ");
            chon= sc.nextInt();
            switch(chon){
                case 1:
                    System.out.print("Nhap so luong sv: ");
                    int soSV = sc.nextInt();
                    for(int i=0;i<soSV;++i){
                        System.out.println("Nhap thong tin sinh vien thu "+(int)(i+1));
                        SinhVien tmp = new SinhVien();
                        tmp.nhapSV();
                        dsSV.add(tmp);
                    }
                    DAOSinhVien.LuuFile(tep, dsSV);
                    break;
                case 2:
                    dsSV = (ArrayList<SinhVien>) DAOSinhVien.docFile(tep);
                    break;
            }
        } catch (Exception ex) {
            System.out.println("Loi doc ghi file: "+ex);
            //Logger.getLogger(QLSV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public static void xuatDS(){
        SinhVien.tieuDe();
        for(SinhVien itm : dsSV)
            System.out.println(itm.toString());
    }
    public static void dtbHon5(){
        System.out.println("Cac sinh vien co DTB>=5: ");
        SinhVien.tieuDe();
        for(SinhVien itm : dsSV){
            if(itm.getDiem().DTB() >= 5.0f)
                System.out.println(itm.toString());
        }
    }
}


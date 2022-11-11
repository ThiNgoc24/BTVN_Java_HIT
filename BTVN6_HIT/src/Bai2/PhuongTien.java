package Bai2;

import java.util.Scanner;

public class PhuongTien {
    public static Scanner sc = new Scanner(System.in);
    public static PhuongTien pt = new PhuongTien();
    private String tenChuXe;
    private String loaiXe;
    private int dungTich;
    private double triGia;
    private double thuePhaiNop;

    public PhuongTien(String tenChuXe, String loaiXe, int dungTich, double triGia, double thuePhaiNop) {
        this.tenChuXe = tenChuXe;
        this.loaiXe = loaiXe;
        this.dungTich = dungTich;
        this.triGia = triGia;
        this.thuePhaiNop = thuePhaiNop;
    }

    public PhuongTien(){}

    public String getTenChuXe() {
        return tenChuXe;
    }

    public void setTenChuXe(String tenChuXe) {
        this.tenChuXe = tenChuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public void setLoaiXe(String loaiXe) {
        this.loaiXe = loaiXe;
    }

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }

    public double getTriGia() {
        return triGia;
    }

    public void setTriGia(double triGia) {
        this.triGia = triGia;
    }

    public double getThuePhaiNop() {
        return thuePhaiNop;
    }

    public void setThuePhaiNop(double thuePhaiNop) {
        this.thuePhaiNop = thuePhaiNop;
    }

    public void input(){
        System.out.println("Moi nhap ten chu xe: ");
        tenChuXe = sc.nextLine();
        System.out.println("Moi nhap loai xe: ");
        loaiXe = sc.nextLine();
        System.out.println("Moi nhap dung tich: ");
        dungTich = sc.nextInt();
        System.out.println("Moi nhap tri gia: ");
        triGia = sc.nextDouble();
        sc.nextLine();
        if(dungTich < 100){
            thuePhaiNop = (triGia*2)/100;
        }else if(dungTich <= 200){
            thuePhaiNop = (triGia*6)/100;
        }else {
            thuePhaiNop = (triGia*10)/100;
        }
//        PhuongTien pt = new PhuongTien(tenChuXe, loaiXe,dungTich,triGia,thuePhaiNop);
//        return pt;
    }

    public void output(){
        System.out.printf("%-20s%-20s%-20d%-20f%-20f\n", tenChuXe, loaiXe, dungTich, triGia, thuePhaiNop);
    }

    @Override
    public String toString() {
        return "PhuongTien{" +
                "tenChuXe='" + tenChuXe + '\'' +
                ", loaiXe='" + loaiXe + '\'' +
                ", dungTich=" + dungTich +
                ", triGia=" + triGia +
                ", thuePhaiNop=" + thuePhaiNop +
                '}';
    }
}

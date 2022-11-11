package Bai1;

import java.util.Scanner;

public class May {
    private static Scanner sc = new Scanner(System.in);
    private int maMay;
    private String kieuMay;
    private String tinhTrang;


    public May() {
    }

    public May(int maMay, String kieuMay, String tinhTrang) {
        this.kieuMay = kieuMay;
        this.maMay = maMay;
        this.tinhTrang = tinhTrang;
    }

    public int getMaMay() {
        return maMay;
    }

    public void setMaMay(int maMay) {
        this.maMay = maMay;
    }

    public String getKieuMay() {
        return kieuMay;
    }

    public void setKieuMay(String kieuMay) {
        this.kieuMay = kieuMay;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    public void inputttMay() {
        System.out.print("Moi nhap ma may: ");
        maMay = sc.nextInt();
        sc.nextLine();
        System.out.print("Moi nhap kieu may: ");
        kieuMay = sc.nextLine();
        System.out.print("Moi nhap tinh trang cua may: ");
        tinhTrang = sc.nextLine();
    }

    public void outputttMay() {
        System.out.println("Ma may: " + maMay);
        System.out.println("Kieu may: " + kieuMay);
        System.out.println("Tinh trang may: " + tinhTrang);
    }
}

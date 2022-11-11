package Bai1;

import java.util.Scanner;

public class PhongMay {
    public static Scanner sc = new Scanner(System.in);
    private int maPhong;
    private String tenPhong;
    private double dienTich;
    private QuanLy x = new QuanLy();
    private May y = new May();

    public PhongMay() {

    }

    public PhongMay(int maPhong, String tenPhong, double dienTich, QuanLy x, May y) {
        this.maPhong = maPhong;
        this.tenPhong = tenPhong;
        this.dienTich = dienTich;
        this.x = x;
        this.y = y;
    }

    public int getMaPhong() {
        return maPhong;
    }

    public void setMaPhong(int maPhong) {
        this.maPhong = maPhong;
    }

    public String getTenPhong() {
        return tenPhong;
    }

    public void setTenPhong(String tenPhong) {
        this.tenPhong = tenPhong;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public QuanLy getX() {
        return x;
    }

    public void setX(QuanLy x) {
        this.x = x;
    }

    public May getY() {
        return y;
    }

    public void setY(May y) {
        this.y = y;
    }

    public void input() {
        System.out.print("Moi nhap ma phong may: ");
        maPhong = sc.nextInt();
        sc.nextLine();
        System.out.println("");
        System.out.print("Moi nhap ten phong: ");
        tenPhong = sc.nextLine();
        System.out.println("");
        System.out.print("Moi nhap dien tich cua phong(m): ");
        dienTich = sc.nextDouble();
        sc.nextLine();
        x.inputttQL();
//            sc.nextLine();
        y.inputttMay();
    }

    public void output() {
        System.out.println("             THÔNG TIN PHÒNG MÁY");
        System.out.print("Ma phong: " + maPhong);
        System.out.println("");
        System.out.print("Ten phong: " + tenPhong);
        System.out.println("");
        System.out.print("Dien tich phong(m): " + dienTich);
        System.out.println("");
        x.outputttQL();
        y.outputttMay();
    }

    public static void main(String[] args) {
        PhongMay phongMay = new PhongMay();
        phongMay.input();
        phongMay.output();
    }
}



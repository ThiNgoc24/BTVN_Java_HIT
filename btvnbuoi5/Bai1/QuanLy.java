package Bai1;

import java.util.Scanner;

public class QuanLy {
    private static Scanner sc = new Scanner(System.in);
    private int maQL;
    private String hoTen;

    public QuanLy(int maQL, String hoTen) {
        this.hoTen = hoTen;
        this.maQL = maQL;
    }

    public QuanLy() {

    }

    public int getMaQL() {
        return maQL;
    }

    public void setMaQL(int maQL) {
        this.maQL = maQL;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void inputttQL() {
        System.out.print("Moi nhap ten quan ly: ");
        hoTen = sc.nextLine();
        System.out.print("Moi nhap ma quan ly: ");
        maQL = sc.nextInt();
    }

    public void outputttQL() {
        System.out.println("Ten quan ly: " + hoTen);
        System.out.println("Ma quan ly: " + maQL);
    }
}

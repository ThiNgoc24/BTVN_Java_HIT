package Bai1;

import java.util.Scanner;

public class HinhChuNhat {
    public static Scanner scanner = new Scanner(System.in);
    private double chieuDai;
    private double chieuRong;

    public void input(){
        System.out.print("Chieu dai HCN a: ");
        chieuDai = scanner.nextDouble();
        System.out.print("Chieu rong HCN a: ");
        chieuRong = scanner.nextDouble();
    }

    public double tinhDienTich(){
        double S;
        S = chieuDai * chieuRong;
        return S;
    }

    public double tinhChuVi(){
        double P;
        P = (chieuDai + chieuRong) * 2;
        return P;
    }

    public void output(){
        System.out.printf("%-10f%-10f%-10f%-10f" , chieuDai , chieuRong , tinhDienTich(),tinhChuVi());
    }

    public void setChieuDai(double chieuDais){
        if(chieuDais > 0){
            chieuDai = chieuDais;
        }
    }

    public double getChieuDai(){
        return chieuDai;
    }

    public void setChieuRong(double chieuRongs){
        if(chieuRongs > 0){
            chieuRong = chieuRongs;
        }
    }

    public double getChieuRong(){
        return chieuRong;
    }

    public static void main(String[] args) {
        HinhChuNhat hcna = new HinhChuNhat();
        HinhChuNhat hcnb = new HinhChuNhat();
        System.out.println("Nhap thong tin HCN a bang cach 1:");
        hcna.input();
        System.out.println("Nhap thong tin HCN b bang cach 2: ");
        hcnb.setChieuDai(6);
        hcnb.setChieuRong(3);
        System.out.print("Chieu dai HCN b: "+hcnb.getChieuDai());
        System.out.print("\n");
        System.out.println("Chieu rong HCN b: " +hcnb.getChieuRong());

        System.out.println("HCN a có chieu dai, chieu rong, dien tich, chu vi lan luot la:  ");
        hcna.output();
        System.out.print("\n");
        System.out.println("HCN b có chieu dai, chieu rong, dien tich, chu vi lan luot la:  ");
        hcnb.output();
        System.out.print("\n");
        if(hcna.tinhDienTich() > hcnb.tinhDienTich()) System.out.println("HCN a co dien tich lon hon");
        else if(hcna.tinhDienTich() < hcnb.tinhDienTich())System.out.println("HCN b co dien tich lon hon");
        else System.out.println("Hai hcn co dien tich bang nhau");
    }
}

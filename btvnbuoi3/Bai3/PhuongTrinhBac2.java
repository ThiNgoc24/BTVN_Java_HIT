package Bai3;

import java.util.Scanner;

public class PhuongTrinhBac2 {
    private double a;
    private double b;
    private double c;
    public static Scanner sc = new Scanner(System.in);
//    public PhuongTrinhBac2(double a, double b, double c){
//        this.a = a;
//        this.b = b;
//        this.c = c;
//    }

    public void input(){
        System.out.print("Nhap a = ");
        a = sc.nextDouble();
        System.out.print("Nhap b = ");
        b = sc.nextDouble();
        System.out.print("Nhap c = ");
        c = sc.nextDouble();

    }

    public void tinhToan(){
        double denta = b*b - 4*a*c;
        double x1, x2;
        if(a == 0) {
            x1 = -c/b;
            System.out.println("co 1 nghiem: x = "+x1);
        }
        else {
            if(denta > 0){
                x1 = (-b+Math.sqrt(denta))/(2*a);
                x2 = (-b-Math.sqrt(denta))/(2*a);
                System.out.println("co 2 nghiem phan biet: x1 = "+x1+"; x2 = "+x2);
            }else if(denta == 0){
                x1 = -b/(2*a);
                System.out.println("co nghiem kep: x1 = x2 = "+x1);
            }else System.out.println("vo nghiem");
        }
    }

    public void output(){
        System.out.printf("Phuong trinh: %.2fx^2 + %.2fx + %.2f = 0 ",a,b,c);
        tinhToan();
    }

    public static void main(String[] args) {
            PhuongTrinhBac2 PtBac2 = new PhuongTrinhBac2();
            PtBac2.input();
            PtBac2.output();
    }

}

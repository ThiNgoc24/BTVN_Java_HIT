package btvnbuoi1;

import java.util.Scanner;

public class bai3 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap n = ");
        int n = scanner.nextInt();
        int tong = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                tong += i;
            }
        }
        System.out.println("Tong cac uoc nguyen duong cua n la: "+tong);
    }

}

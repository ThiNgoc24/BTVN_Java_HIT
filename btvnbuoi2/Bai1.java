package btvnbuoi2;

import java.util.Scanner;

public class Bai1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Moi nhap so phan tu cua mang: ");
        int n = scanner.nextInt();
        int a[] = new int[n];
        NhapMang(a, n);
        System.out.print("Mang ban vua nhap la: ");
        XuatMang(a);
        System.out.print('\n');
        //a)
        TBC(a);


        System.out.print('\n');

        //b)
        System.out.print("Vi tri cac so nho nhat trong mang la: ");
        MinTrongMang(a);
        System.out.print('\n');

        //c)
        System.out.print("Cac so chinh phuong trong mang la: ");
        SoChinhPhuongTrongMang(a);
        System.out.print('\n');

        //d)
        System.out.print("Cac SNT trong mang la: "); SNTTrongMang(a);
        System.out.print('\n');

        //e)
        System.out.print("Mang sau khi sap xep la: ");
        SapXep(a);
        XuatMang(a);

    }

    public static void NhapMang(int a[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.printf("a[%d] = ", i);
            a[i] = scanner.nextInt();
        }
    }

    public static void XuatMang(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void TBC(int a[]) {
        int tong = 0;
        int dem = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 1 && i % 2 == 0) {
                tong += a[i];
                dem++;
            }
        }
        if(dem == 0) System.out.println("Trong mang khong ton tai so le o vi tri chan");
        else System.out.print("TBC cac so le o vi tri chan la: "+(float)tong/dem);
    }

    public static void MinTrongMang(int a[]) {

        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (min > a[i]) {
                min = a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] == min) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean KtraSoChinhPhuong(int n) {
        for (int i = 1; i * i <= n; i++) {
            if (i * i == n) return true;
        }
        return false;
    }

    public static void SoChinhPhuongTrongMang(int a[]) {
        int dem = 0;
        for (int i = 0; i < a.length; i++) {
            if (KtraSoChinhPhuong(a[i])) {
                dem++;
                System.out.print(a[i] + " ");
            }
        }
        if (dem == 0) System.out.print("Trong mang khong co so chinh phuong nao!");
    }

    public static boolean KtraSNT(int n){
        if(n < 2) return false;
        for(int i = 2; i*i <= n; i++){
            if(n % i == 0) return false;
        }
        return true;
    }

    public static void SNTTrongMang(int a[]){
        int dem = 0;
        for(int i = 0; i < a.length; i++){
            if(KtraSNT(a[i])) {
                dem++;
                System.out.print(a[i] + " ");
            }
        }
        if(dem == 0) System.out.print("Trong mang khong co SNT!");
    }
    public static void SapXep(int a[]){
        int temp;
        for(int i = 0; i < a.length-1; i++){
            for(int j = i+1; j < a.length; j++){
                if(a[i] > a[j]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
    }

}

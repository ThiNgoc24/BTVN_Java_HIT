package Bai2;

import jdk.swing.interop.SwingInterOpUtils;

public class NhanVien {
    private static int mnv = 0;
    private int tuoi;
    private String tenNV;
    private String diaChi;
    private String boPhan;

    public NhanVien(int tuoi, String tenNV, String diaChi, String boPhan){
        this.tuoi = tuoi;
        this.tenNV = tenNV;
        this.diaChi = diaChi;
        this.boPhan = boPhan;
    }


    public void output(){
        mnv ++;
        System.out.printf("%-10d%-10s%-10d%-10s%-10s",mnv,tenNV,tuoi,diaChi,boPhan);
        System.out.println("");
    }


    public static void main(String[] args) {
        System.out.printf("%s","           THONG TIN CAC NHAN VIEN");
        System.out.println("");
        System.out.printf("%-10s%-10s%-10s%-10s%-10s", "Manv","Tennv","Tuoi","DiaChi","BoPhan");
        System.out.println("");
        NhanVien nv1 = new NhanVien(23, "A","TH","CNTT" );
        NhanVien nv2 = new NhanVien(21, "B","HN","QLI" );
        NhanVien nv3 = new NhanVien(21, "C","HP","CNTT" );
        NhanVien nv4 = new NhanVien(24, "D","QLI","CNTT" );
        NhanVien nv5 = new NhanVien(25, "E","HN","QLI" );
        nv1.output();
        nv2.output();
        nv3.output();
        nv4.output();
        nv5.output();
    }
}

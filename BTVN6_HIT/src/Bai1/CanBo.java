package Bai1;

import java.util.Scanner;

public class CanBo {
    static Scanner sc = new Scanner(System.in);
    protected int id ;
    protected static int temp = 1;

    protected String hoTen;
    protected int namSinh;
    protected String gioiTinh;
    protected String diaChi;

    public CanBo(String hoTen, int namSinh, String gioiTinh, String diaChi){

        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public CanBo(){
        this.id = temp++;//mỗi lần khởi tạo thì id bằng temp+1? --> thì lần khởi tạo đầu tiên phải là id = temp+1 = 1+1???
    }

    public int getId() {
        return id;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void input(){
//        id++;
//        sc.nextLine();
        System.out.print("Moi nhap ho va ten: ");
        hoTen = sc.nextLine();
        System.out.println("");
        System.out.print("Moi nhap nam sinh: ");
        namSinh = sc.nextInt();
        sc.nextLine();
        System.out.println("");
        System.out.print("Moi nhap gioi tinh: ");
        gioiTinh = sc.nextLine();
        System.out.println("");
        System.out.print("Moi nhap dia chi: ");
        diaChi = sc.nextLine();
        System.out.println("");
    }

    public void output(){
        System.out.printf("%-5d%-15s%-10d%-10s%-20s", id, hoTen, namSinh, gioiTinh, diaChi);
    }

//    public String toString(){
//        return "Ho va ten: "+hoTen+", Nam sinh: "+namSinh+", Gioi tinh: "+gioiTinh+", Dia chi: "+diaChi;
//    }
}

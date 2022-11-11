package Bai2;

import java.util.Scanner;

public class Address {
    private static Scanner sc = new Scanner(System.in);
//    private int id;
    private String district;
    private String province;

    public static Scanner getSc() {
        return sc;
    }

    public static void setSc(Scanner sc) {
        Address.sc = sc;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public void input(){
//        System.out.println("Moi nhap ma sv: ");
//        id = sc.nextInt();
        System.out.println("Moi nhap huyen: ");
        district = sc.nextLine();
        System.out.println("Moi nhap tinh/thanh pho: ");
        province = sc.nextLine();
    }

    public void output(){
//        System.out.println("Huyen: "+district);
//        System.out.println("Tinh/Thanh pho: "+province);
        System.out.printf("%-5s,%-5s",district,province);
    }
}

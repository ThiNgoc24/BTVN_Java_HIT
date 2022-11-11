package Bai2;

import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);

    public static Student[] xoaMang(Student []sv, int k){
        Student []newSV = new Student[sv.length-1];
        for(int i = 0; i < sv.length-1; i++){
            newSV[i] = new Student();
        }

        for(int i = 0; i < k; i++){
            newSV[i] = sv[i];
        }

        for(int i = k+1; i < sv.length; i++){
            newSV[i-1] = sv[i];
        }
        return newSV;
    }

    public static void main(String[] args) {
        System.out.println("Moi nhap 1 so nguyen n: ");
        int n = sc.nextInt();
        Student []sv = new Student[n];

        for(int i = 0; i < n; i++){//khởi tạo từng phần tử trong mảng
            sv[i] = new Student();
        }

        for(int i = 0; i < n; i++){//làm thế nào để không cho nhập các id giống nhau ???
            System.out.println("Moi nhap thong tin cua sv thu "+(i+1));
            sv[i].input();
        }

        System.out.println("              Menu");
        System.out.println("1. Hiển thị thông tin các sinh viên ra màn hình.");
        System.out.println("2. Tìm kiếm sinh viên theo Id và hiển thị ra màn hình.");
        System.out.println("3. Sửa các sinh viên có province là “Thanh Hóa” thành “Hải Phòng”");
        System.out.println("4. Xóa sinh viên theo Id.");

        int luaChon;
        do{
            System.out.println("Moi nhap lua chon cua ban: ");
            luaChon = sc.nextInt();
        }while(luaChon < 0 || luaChon >5);

        switch (luaChon){
            case 1: {
                System.out.println("     Danh sach sinh vien");
                System.out.printf("%-10s%-20s%-10s%-20s\n","id","Ten","Tuoi","Dia chi");
                for(int i = 0; i < sv.length; i++){
                    sv[i].output();
                    System.out.println("");
                }
                break;
            }

            case 2: {
                System.out.println("Nhap ma sv ban muon tim: ");
                int id = sc.nextInt();
                for(int i = 0; i < sv.length; i++){
                    if(sv[i].getId() == id) {
                        sv[i].output();
                    }else System.out.println("Khong tim thay thong tin!");
                    break;
                }
            }

            case 3:{
                //equalsIgnoreCase: so sánh chuỗi không phân biệt hoa thường
                //equals: So sánh chuỗi phân biệt hoa thường
                System.out.println("Danh sách sinh viên sau khi đổi sinh viên có province là “Thanh Hóa” thành “Hải Phòng” là: ");
                System.out.printf("%-10s%-20s%-10s%-20s\n","id","Ten","Tuoi","Dia chi");
                for(int i = 0; i < sv.length; i++){
                    if(sv[i].province().equalsIgnoreCase("Thanh Hóa")){
                        sv[i].getAddress().setProvince("Hải Phòng");
                    }
                    sv[i].output();
                    System.out.println("");
                }

                break;
            }

            case 4:{
                System.out.print("Nhap id sv can xoa: ");
                int id = sc.nextInt();
                for(int i = 0; i < sv.length; i++){
                    if(sv[i].getId() == id){
                        sv = xoaMang(sv,i);
                    }
                }
                System.out.println("Danh sách sinh viên sau khi xóa");
                System.out.printf("%-10s%-20s%-10s%-20s\n","id","Ten","Tuoi","Dia chi");
                for(int i = 0; i < sv.length; i++){
                    sv[i].output();
                    System.out.println("");
                }
                break;
            }
        }
    }
}

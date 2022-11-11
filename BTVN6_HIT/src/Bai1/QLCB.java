package Bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<CongNhan> listCN = new ArrayList<>();
    public static ArrayList<KySu> listKS = new ArrayList<>();
    public static ArrayList<NhanVien> listNV = new ArrayList<>();

    public static void main(String[] args) {

        int luaChon;
        do{
            System.out.println("\t\t\tMENU");
            System.out.println("1: Add 1 cán bộ vào List tương ứng");
            System.out.println("2: Hiển thị danh sách các cán bộ");
            System.out.println("3: Xóa 1 cán bộ theo id");
            System.out.println("4: Tìm kiếm 1 cán bộ theo id");
            System.out.println("5: Dừng chương trình");

            System.out.print("Moi nhap lua chon cua ban: ");
            luaChon = sc.nextInt();
            sc.nextLine();

            switch (luaChon){
                case 1: {
                    addCanBo();
                    break;
                }

                case 2:{
                    hienThiDSCB();
                    break;
                }

                case 3:{
                    xoaCB();
                    break;
                }

                case 4:{
                    timKiem();
                    break;
                }

                case 5:{
                    System.out.println("Goodbye!");
                    break;
                }
            }

        }while(luaChon != 5);
    }

    //1. Add 1 can bo
    public static void addCanBo(){

        System.out.println("Ban muon them can bo co chuc vu nao?\n1. Cong nhan \n2. Ky su \n3.Nhan vien phuc vu");
        int luaChon2 = sc.nextInt();
        sc.nextLine();
        switch (luaChon2){
            case 1:{
                CongNhan cn = new CongNhan();
                cn.inputCN();
                listCN.add(cn);
                break;
            }

            case 2:{
                KySu ks = new KySu();
                ks.inputKS();
                listKS.add(ks);
                break;
            }

            case 3:{
                NhanVien nv = new NhanVien();
                nv.inputNV();
                listNV.add(nv);
                break;
            }
        }
    }

    //2. Hien thi danh sach
    public static void hienThiDSCB(){

        System.out.println("DANH SACH CAC CAN BO ");

        if(listCN.isEmpty()) System.out.println("Danh sach cong nhan: <Trong>");
        else{
            System.out.println("\t\t\tDanh sach cong nhan: ");
            System.out.printf("%-5s%-15s%-10s%-10s%-20s%-10s\n","id", "Ho va ten", "Nam sinh", "Gioi tinh", "Dia chi", "Cap bac(/7)");
            for(int i = 0; i < listCN.size(); i++){
                listCN.get(i).outputCN();
            }
        }

        if(listKS.isEmpty()) System.out.println("Danh sach ky su: <Trong>");
        else{
            System.out.println("\t\t\tDanh sach ky su: ");
            System.out.printf("%-5s%-15s%-10s%-10s%-20s%-10s\n","id", "Ho va ten", "Nam sinh", "Gioi tinh", "Dia chi", "Nganh dao tao");
            for(int i = 0; i < listKS.size(); i++){
                listKS.get(i).outputKS();
            }
        }


        if(listNV.isEmpty()) System.out.println("Danh sach nhan vien: <Trong>");
        else{
            System.out.println("\t\t\tDanh sach nhan vien: ");
            System.out.printf("%-5s%-15s%-10s%-10s%-20s%-10s\n","id", "Ho va ten", "Nam sinh", "Gioi tinh", "Dia chi", "Cong viec");
            for(int i = 0; i < listNV.size(); i++){
                listNV.get(i).outputNV();
            }
        }

    }

    //3. Xoa can bo theo id
    public static void xoaCB(){
        System.out.print("Moi nhap id cac bo ban muon xoa: "); int id = sc.nextInt();
        int count = 0;

        for(int i = 0; i < listCN.size(); i++){
            if(listCN.get(i).getId() == id){
                System.out.println("Id ban nhap thuoc danh sach cong nhan");
                count ++;
                listCN.remove(i);
                System.out.println("Danh sach cong nhan sau khi xoa");
                System.out.println("\t\t\tDanh sach cong nhan: ");
                System.out.printf("%-5s%-15s%-10s%-10s%-20s%-10s\n","id", "Ho va ten", "Nam sinh", "Gioi tinh", "Dia chi", "Cap bac(/7)");
                for(int j = 0; j < listCN.size(); j++){
                    listCN.get(j).outputCN();
                }
            }
        }

        for(int i = 0; i < listKS.size(); i++){
            if(listKS.get(i).getId() == id){
                System.out.println("Id ban nhap thuoc danh sach ky su");
                count ++;
                listKS.remove(i);
                System.out.println("Danh sach ky su sau khi xoa");
                System.out.println("\t\t\tDanh sach ky su: ");
                System.out.printf("%-5s%-15s%-10s%-10s%-20s%-10s\n","id", "Ho va ten", "Nam sinh", "Gioi tinh", "Dia chi", "Nganh dao tao");
                for(int j = 0; j < listKS.size(); j++){
                    listKS.get(j).outputKS();
                }
            }
        }

        for(int i = 0; i < listNV.size(); i++){
            if(listNV.get(i).getId() == id){
                System.out.println("Id ban nhap thuoc danh sach nhan vien");
                count ++;
                listNV.remove(i);
                System.out.println("Danh sach nhan vien sau khi xoa");
                System.out.println("\t\t\tDanh sach nhan vien: ");
                System.out.printf("%-5s%-15s%-10s%-10s%-20s%-10s\n","id", "Ho va ten", "Nam sinh", "Gioi tinh", "Dia chi", "Cong viec");
                for(int j = 0; j < listNV.size(); j++){
                    listNV.get(j).outputNV();
                }
            }
        }

        if(count == 0) System.out.println("Id ban nhap khong ton tai!");
    }

    //4. Tim kiem can bo theo id
    public static void timKiem(){
        System.out.print("Moi nhap id can bo ban muon tim: "); int id = sc.nextInt();
        int count = 0;
        for(int i = 0; i < listCN.size(); i++){
            if(listCN.get(i).getId() == id){
                count++;
                System.out.println("Thong tin can bo ban muon tim: "+listCN.get(i));
            }
        }

        for(int i = 0; i < listKS.size(); i++){
            if(listKS.get(i).getId() == id){
                count++;
                System.out.println("Thong tin can bo ban muon tim: "+listKS.get(i));
            }
        }

        for(int i = 0; i < listNV.size(); i++){
            if(listNV.get(i).getId() == id){
                count++;
                System.out.println("Thong tin can bo ban muon tim: "+listNV.get(i));
            }
        }

        if(count == 0) System.out.println("ID ban nhap khong ton tai!");
    }
}

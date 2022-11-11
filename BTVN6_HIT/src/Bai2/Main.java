package Bai2;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static Scanner sc = new Scanner(System.in);
    static ArrayList<PhuongTien> listPT = new ArrayList<>();
    public static void main(String[] args) {
        String luaChon;
        do{
            System.out.println("\t\t\tMENU");
            System.out.println("a. Nhập thông tin và tạo danh sách các xe \n" +
                    "b. Xuất bảng kê khai tiền thuế trước bạ của các xe. \n" +
                    "c. Xuất bảng kê khai tiền thuế trước bạ của các xe với tiền thuế giảm dần\n" +
                    "d. Xuất bảng kê khai tiền thuế trước bạ của các xe với trị giá tăng dần\n" +
                    "e. Thoát.\n");

            System.out.print("Moi nhap lua chon cua ban: ");
            luaChon = sc.nextLine();

            switch (luaChon){
                case "a":{
                    nhapDS();
                    break;
                }

                case "b":{
                    hienThi();
                    break;
                }

                case "c":{
                    hienThiTheoTienThue();
                    break;
                }

                case "d":{
                    hienThiTheoTriGia();
                    break;
                }

                case "e":{
                    System.out.println("GoodBye!");
                    break;
                }
            }

        }while (luaChon.equals("e") == false);
    }

    //a. Nhap danh sach
    public static void nhapDS(){
        int n;
        System.out.println("Moi nhap danh sach cac phuong tien");
        do{
            System.out.println("1. Tiep tuc nhap\n0. Ket thuc danh sach");
            n = sc.nextInt();
            sc.nextLine();
            if(n == 0) break;
            if(n == 1){
                PhuongTien pt = new PhuongTien();
                pt.input();
                listPT.add(pt);
            }
        }while(n != 0);
    }

    //b. Hien thi danh sach
    public static void hienThi(){
        if(listPT.isEmpty()) System.out.println("Danh sach cac xe: <Trong>");
        else{
            System.out.println("\t\t\t\t\tDanh sach cac xe");
            System.out.printf("%-20s%-20s%-20s%-20s%-20s\n", "Ten chu xe", "Loai xe", "Dung tich", "Tri gia", "Thue phai nop");
            for(int i = 0; i < listPT.size(); i++){
                listPT.get(i).output();
            }
        }
    }

    //c. Hien thi theo tien thue
    public static void hienThiTheoTienThue(){
        PhuongTien temp = new PhuongTien();
        for(int i = 0; i < listPT.size()-1; i++){
            for(int j = i+1; j <listPT.size(); j++){
                if(listPT.get(i).getThuePhaiNop() < listPT.get(j).getThuePhaiNop()){
                    doiCho(listPT.get(i), listPT.get(j));
                }
            }
        }
        System.out.println("Danh sach sau khi sap xep theo cuoc thue giam dan");
        hienThi();
    }

    //d. Hien thi danh sach voi tri gia tang dan
    public static void hienThiTheoTriGia(){
        for(int i = 0; i < listPT.size()-1; i++){
            for(int j = i+1; j < listPT.size(); j++){
                if(listPT.get(i).getTriGia() > listPT.get(j).getTriGia()){
                    doiCho(listPT.get(i), listPT.get(j));
                }
            }
        }
        System.out.println("Danh sach cac xe sau khi sap xep tri gia tang dan");
        hienThi();
    }

    //Doi cho 2 doi tuong
    public static void doiCho(PhuongTien a, PhuongTien b){
        PhuongTien temp = new PhuongTien();

        temp.setTenChuXe(a.getTenChuXe());
        temp.setLoaiXe(a.getLoaiXe());
        temp.setDungTich(a.getDungTich());
        temp.setTriGia(a.getTriGia());
        temp.setThuePhaiNop(a.getThuePhaiNop());

        a.setTenChuXe(b.getTenChuXe());
        a.setLoaiXe(b.getLoaiXe());
        a.setDungTich(b.getDungTich());
        a.setTriGia(b.getTriGia());
        a.setThuePhaiNop(b.getThuePhaiNop());

        b.setTenChuXe(temp.getTenChuXe());
        b.setLoaiXe(temp.getLoaiXe());
        b.setDungTich(temp.getDungTich());
        b.setTriGia(temp.getTriGia());
        b.setThuePhaiNop(temp.getThuePhaiNop());
    }

}

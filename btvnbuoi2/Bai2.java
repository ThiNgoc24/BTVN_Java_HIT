package btvnbuoi2;

import java.util.Locale;
import java.util.Scanner;

public class Bai2 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Moi nhap vao mot chuoi bat ki: ");
        String s = scanner.nextLine();
        System.out.print("Chuoi ky tu truoc khi chuan hoa: ");
        System.out.print(s);
        s = s.trim();//xoa cac dau cach thua o dau va cuoi;
        s = s.toLowerCase();//viet thuong tat ca cac ky tu trong chuoi;
        //thay the tat cac cac ki tu khoang trang(nhieu khoang trang) thanh ky tu " "(1 khoang trang)
        s = s.replaceAll("\\s+", " ");// replace() va replaceAll() khac nhau cho nao?
        //tach cac tu trong chuoi roi gan vao mang cac chuoi;
        String[] news = s.split(" ");
        //Dua chuoi ky tu s ve chuoi rong;
        s = "";
        //Viet hoa cac chu cai dau moi tu
        for(int i = 0; i < news.length; i++){
            s += String.valueOf(news[i].charAt(0)).toUpperCase() + news[i].substring(1) + " ";
            //phai o cung kieu String thi moi cong duoc cac xau lai voi nhau
            //Phương thức: String.valueOf()-->chuyển kí tự thành kiểu String
        }
        //Xoa dau khoang trang thua o cuoi chuoi
        s = s.trim();
        //Xoa het cac so co trong chuoi
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) >= '0' && s.charAt(i) <= '9'){
                s = s.replace(String.valueOf(s.charAt(i)), "");
            }
        }
        System.out.print('\n');
        System.out.print("Chuoi ki tu sau khi chuan hoa la: ");
        System.out.print(s);

    }

}



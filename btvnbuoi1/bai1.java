package btvnbuoi1;

import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ngay, thang, nam;
        System.out.print("Moi nhap ngay, thang, nam sinh cua ban: ");
        ngay = scanner.nextInt();
        thang = scanner.nextInt();
        nam = scanner.nextInt();

        switch (thang) {
            case 1: {
                if (ngay >= 1 && ngay <= 19) System.out.print("Ma Ket");
                else if(ngay > 19 && ngay <= 31) System.out.println("Bao Binh");//nếu không có ngay > 19 thì trường hợp nhập ngay < 0 sẽ rơi vào trường hợp này?
                else System.out.println("Ngay thang nam sinh ban nhap khong hop le!");
                break;
            }
            case 2: {
                //Kiem tra nam nhuan
                if(nam % 400 == 0 || (nam % 4 == 0 && nam % 100 != 0)){
                    if(ngay >= 1 && ngay <= 18 ) System.out.print("Bao Binh");
                    else if(ngay > 18 && ngay <= 29 )System.out.print("Song Ngu");
                    else System.out.println("Ngay thang nam sinh ban nhap khong hop le!");
                    break;
                }else{
                    if(ngay >= 1 && ngay <= 18 ) System.out.print("Bao Binh");
                    else if(ngay > 18 && ngay <= 28 )System.out.print("Song Ngu");
                    else System.out.println("Ngay thang nam sinh ban nhap khong hop le!");
                    break;
                }
            }
            case 3: {
                if(ngay >= 1 && ngay <= 20) System.out.println("Song Ngu");
                else if(ngay > 20 && ngay <= 31) System.out.println("Bach Duong");
                else System.out.println("Ngay thang nam sinh ban nhap khong hop le!");
                break;
            }
            case 4: {
                if(ngay >= 1 && ngay <= 20) System.out.println("Bach Duong");
                else if(ngay > 20 && ngay <= 30) System.out.println("Kim Nguu");
                else System.out.println("Ngay thang nam sinh ban nhap khong hop le!");
                break;
            }
            case 5:{
                if(ngay >= 1 && ngay <= 20) System.out.println("Kim nguu");
                else if(ngay > 20 && ngay <= 31) System.out.println("Song Tu");
                else System.out.println("Ngay thang nam sinh ban nhap khong hop le!");
                break;
            }
            case 6:{
                if(ngay >= 1 && ngay <= 21) System.out.println("Song Tu");
                else if(ngay > 21 && ngay <= 30) System.out.println("Cu Giai");
                else System.out.println("Ngay thang nam sinh ban nhap khong hop le!");
                break;
            }
            case 7:{
                if(ngay >= 1 && ngay <= 22) System.out.println("Cu Giai");
                else if(ngay > 22 && ngay <= 31) System.out.println("Su Tu");
                break;
            }
            case 8:{
                if(ngay >= 1 && ngay <= 22) System.out.println("Su Tu");
                else if(ngay > 22 && ngay <= 31) System.out.println("Xu Nu");
                else System.out.println("Ngay thang nam sinh ban nhap khong hop le!");
                break;
            }
            case 9:{
                if(ngay >= 1 && ngay <= 22) System.out.println("Xu Nu");
                else if(ngay > 22 && ngay <= 30) System.out.println("Thien Binh");
                else System.out.println("Ngay thang nam sinh ban nhap khong hop le!");
                break;
            }
            case 10: {
                if(ngay >= 1 && ngay <= 23) System.out.println("Thien Binh");
                else if(ngay > 23 && ngay <= 31) System.out.println("Bo Cap");
                else System.out.println("Ngay thang nam sinh ban nhap khong hop le!");
                break;
            }
            case 11:{
                if(ngay >= 1 && ngay <= 22) System.out.println("Bo Cap");
                else if(ngay > 22 && ngay <= 30) System.out.println("Nhan Ma");
                else System.out.println("Ngay thang nam sinh ban nhap khong hop le!");
                break;
            }
            case 12: {
                if(ngay >= 1 && ngay <= 21) System.out.println("Nhan Ma");
                else if(ngay > 21 && ngay <= 31) System.out.println("Ma Ket");
                else System.out.println("Ngay thang nam sinh ban nhap khong hop le!");
                break;
            }

        }
    }
}

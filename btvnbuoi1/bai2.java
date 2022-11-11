package btvnbuoi1;


import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;
        System.out.print("Moi nhap 3 canh cua tam giac: ");
        a = scanner.nextInt(); b = scanner.nextInt(); c = scanner.nextInt();
        if(a+b<c || a+c<b || b+c<a) System.out.println("3 canh khong tao thanh mot tam giac!");
        else {
            if(a*a+b*b==c*c || a*a+c*c==b*b || b*b+c*c==a*a) System.out.println("3 canh tao thanh mot tam giac vuong");
            else if(a==b && b == c) System.out.println("3 canh tao thanh tam giac deu");
            else if((a==b || a==c || b == c)) System.out.println("3 canh tao thanh tam giac can");
            else if((a==b && c*c==2*a*a) || (b==c && a*a==2*b*b) || (a==c && b*b==2*a*a)) System.out.println("3 canh tao thanh mot tam giac vuong can");
            else System.out.println("3 canh tao thanh 1 tam giac thuong");
        }
    }
}

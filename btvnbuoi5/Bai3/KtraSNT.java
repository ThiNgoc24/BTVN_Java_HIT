package Bai3;

import java.util.Scanner;

public class KtraSNT {

    public static boolean isPrime(int n){
        if(n < 2) return false;
        else{
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0) return false;
            }
        }
        return true;
    }

    public static boolean isPrime(long n){
        if(n < 2) return false;
        else{
            for(int i = 2; i <= Math.sqrt(n); i++){
                if(n % i == 0) return false;
            }
        }
        return true;
    }

    public static boolean isPrime(float n){
        if(n - (int)n != 0) return false;
        else {
            if(n < 2) return false;
            else{
                for(int i = 2; i <= Math.sqrt(n); i++){
                    if(n % i == 0) return false;
                }
            }
            return true;
        }
    }

    public static boolean isPrime(double n){
        if(n - (int)n != 0) return false;
        else {
            if(n < 2) return false;
            else{
                for(int i = 2; i <= Math.sqrt(n); i++){
                    if(n % i == 0) return false;
                }
            }
            return true;
        }
    }

    public static void main(String[] args) {
        System.out.println("Kiem tra 3.14 có là số nguyên tố? "+isPrime(3.14));
        System.out.println("Kiem tra 6 có phải là số nguyên tố?" +isPrime(6));
        System.out.println("Kiem tra 5.00 có phải là số nguyên tố?" +isPrime(5.00));
//        System.out.println("Kiem tra 6 có phải là số nguyên tố?" +isPrime(6));
    }
}

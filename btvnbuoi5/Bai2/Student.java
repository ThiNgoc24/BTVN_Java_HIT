package Bai2;

import java.util.Scanner;

public class Student {
    private static Scanner sc = new Scanner(System.in);
    private int id;
    private String name;
    private int age;
    private Address address = new Address();

    public static Scanner getSc() {
        return sc;
    }

    public static void setSc(Scanner sc) {
        Student.sc = sc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void setAge(int age) {
        this.age = age;
    }



    public void input(){
        System.out.println("Moi nhap ma sv: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Moi nhap ten sv: ");
        name = sc.nextLine();
        System.out.println("Moi nhap tuoi: ");
        age = sc.nextInt();
        sc.nextLine();
        address.input();
    }

    public void output(){
//        System.out.println("MaSV: "+id);
//        System.out.println("Ten: "+name);
//        System.out.println("Tuoi: "+age);
//        address.output();
        System.out.printf("%-10d%-20s%-10d",id,name,age);
        address.output();
    }

    public String province(){
        return address.getProvince();
    }
}

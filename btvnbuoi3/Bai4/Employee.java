package Bai4;

import java.util.Scanner;

public class Employee {
    private String id;
    private String name;
    private int age;
    private int workingDays;
    private double salary;
    private static int price = 50;
    static Scanner sc = new Scanner(System.in);
//    public Employee(String id, String name, int age, int workingDays, double salary){
//        this.id = id;
//        this.name = name;
//        this.age = age;
//        this.workingDays = workingDays;
//        this.salary = salary;
//    }
    public Employee(){}

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public void setAge(int age) {
        this.age = age;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(int workingDays) {
        this.workingDays = workingDays;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    public double layRaThuocTinhSalary(){
        salary = workingDays*price;
        return salary;
    }

    public void input(){
        System.out.print("Nhap ma nhan vien: ");id = sc.nextLine();
        System.out.print("\n");
        System.out.print("Nhap ten nhan vien: ");name = sc.nextLine();
        System.out.print("\n");
        System.out.print("Nhap tuoi cua nhan vien: ");age = sc.nextInt();
        System.out.print("\n");
        System.out.print("Nhap so ngay cong cua nhan vien: ");workingDays = sc.nextInt();
    }

    public void output(){
        System.out.println("Employee: ");
        System.out.println("+ ID: "+getId());
        System.out.println("+ NAME: "+getName());
        System.out.println("+ AGE: "+getAge());
        System.out.println("+ WORKINGDAYS: "+getWorkingDays());
        System.out.println("+ SALARY: "+layRaThuocTinhSalary());
    }

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.input();
        employee1.output();
    }
}

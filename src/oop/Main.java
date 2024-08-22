package oop;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Student a = new Student("Nam",18,"email@123");
//        System.out.println(a.getName());

    // tạo class bank
    // tạo thuộc tính : account number, balance, name, phone
    // tạo get , set
    // tạo contructor
    // tạo 2 phương thức gửi tiền và rút tiền

        Bank bank = new Bank("123123",500,"Nguyen Van A","1231");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số tiền ");
        double money = scanner.nextDouble();
        bank.rutTien(money);



    }
}

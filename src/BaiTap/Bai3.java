package BaiTap;

import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số thứ nhất:");
        int soThuNhat = sc.nextInt();
        System.out.println("Nhập vào số thứ hai:");
        int soThuHai = sc.nextInt();

        int phanNguyen = soThuNhat / soThuHai;
        int phanDu = soThuNhat % soThuHai;

        System.out.printf("Phần nguyên là: " + phanNguyen);
        System.out.printf("Phần dư là:" + phanDu);

    }
}

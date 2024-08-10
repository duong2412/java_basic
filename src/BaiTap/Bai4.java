package BaiTap;

import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào cạnh a:");
        double a = sc.nextDouble();
        System.out.println("Nhập vào cạnh b:");
        double b = sc.nextDouble();
        System.out.println("Nhập vào cạnh c:");
        double c = sc.nextDouble();

        // Tổng hai cạnh bất kì phải lớn hơn cạnh còn lại
        if((a + b > c) && (a + c > b )&&( b + c > a)){
            System.out.println("Ba số này là 3 cạnh của một tam giác");
        }else {
            System.out.println("Ba số này không phải là 3 cạnh của một tam giác");
        }
    }
}

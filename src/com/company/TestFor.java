package com.company;

import java.util.Scanner;

public class TestFor {
    private int a;

    public static void main(String[] args) {

        //switch - case
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tháng");
        int month = scanner.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("Tháng "+month+" có 31 ngày");
                break;
            case 4:
            case 6:
            case 11:
                System.out.println("Tháng "+month+" có 30 ngày");
                break;
            case 2 :
                System.out.println("Nhập năm: ");
                int year = scanner.nextInt();
                if ((year % 4 == 0 && year  % 100 != 0) || year % 400 == 0){
                    System.out.println("Tháng "+month+" của năm "+year+" có 29 ngày");
                }else {
                    System.out.println("Tháng "+month+" của năm "+year+" có 28 ngày");
                }
                break;
            default:
                System.out.println("Tháng nhập không hợp lệ");
        }
    }
}

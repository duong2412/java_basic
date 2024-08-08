package com.company;

import java.util.Scanner;

public class Main {
    // keyword và khoảng trắng
    //if  else
    //switch case

    public static void main(String[] args) {
//        int luong = 10;
//        if((luong > 9 && luong > 15) || (luong < 15)){
//            System.out.println("điều kiện && ");
//        }
//
//        if(luong > 9 || luong > 15 ){
//            System.out.println("điều kiện || ");
//        }
//
//
//        if (luong == 9)
//            System.out.println("d");System.out.println("e");
//
//
//        switch (luong) {
//            case 8 : System.out.println("a");
//            case 10 :  System.out.println("b");
//            default: System.out.println("c");
//        }
    // kiểm tra năm nhập vào có là năm nhuận hay k
    // chia hết cho 4 và không chia hết cho 100
    // hoặc chia hết cho 400
    // 2021,2022,...
//        Scanner scanner = new Scanner(System.in);
//        int year = scanner.nextInt();

//        if(year % 4 == 0 && year % 100 != 0 ){
//            System.out.println("Năm "+year+" là năm nhuận (dk1)");
//        } else if(year % 400 == 0){
//            System.out.println("Năm "+year+" là năm nhuận (dk2)");
//        }else {
//            System.out.println("Năm "+year+" không phải là năm nhuận");
//        }

        // tìm số nhỏ nhất trong 2 số

//        int soNhoNhat = soNhoNhatTrongHaiSo(5,10);
//        System.out.println(soNhoNhat);


        int x = 4;
        int y = 10;
        int z = 3;
        int soNhoNhat =soNhoNhat(x,y);
        System.out.println(soNhoNhat);
    }
  //  double > float > int > short > byte

    private static float soLonNhat(int a, int b){
        int max;
       if (a > b){
           max = a;
       }else {
           max = b;
       }
       return max;
    }

    private static int soNhoNhat(int a, int b){
        int min;
        if(a > b){
            min = b;
        }else {
            min = a;
        }
        return min;
    }

    private static int soNhoNhat(int a, int b, int c){
        int min;
        if(a > b){
            min = b;
        }else if(b > c){
            min = c;
        }else {
            min = a;
        }
        return min;
    }
}

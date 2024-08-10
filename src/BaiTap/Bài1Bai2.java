package BaiTap;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Scanner;

public class Bài1Bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào giá trị của x:");
        int x = sc.nextInt();
// Bài 1:
        if(x >= 0){
            System.out.println("Đây là số nguyên dương");
        }else{
            System.out.println("Đây là số nguyên âm");
        }

// Bài 2:
        if(x % 2 == 0){
            System.out.printf("Dây là số chẵn" );
        }else {
            System.out.printf("Dây là số lẻ");
        }
    }


}

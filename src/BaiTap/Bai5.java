package BaiTap;

import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Cạnh a: ");
        double a = sc.nextDouble();
        System.out.println("Cạnh b: ");
        double b = sc.nextDouble();
        System.out.println("Cạnh c: ");
        double c = sc.nextDouble();

      if ((Math.pow(a, 2)) + (Math.pow(b, 2)) == (Math.pow(c, 2))){
          System.out.println("Ba số này là 3 cạnh của một tam giác vuông");
      }else {
          System.out.println("ba số này không phải là 3 cạnh của một tam giác vuông");
      }
    }
}


package BaiTap.OOP;

public class PTbac2 {
    private double a;
    private double b;
    private double c;
    private double delta;

    public PTbac2(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public PTbac2(){

    }

    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public void calculateDelta (double a, double b, double c){
        delta = b*b - 4*a*c;
        System.out.println("delta của pt là:" + delta);
    }
    public void nghiemPT(double a, double b, double c){
        if(delta > 0){
            System.out.println("Phương trình có 2 nghiệm:");
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println("x1=" + x1);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("x2=" + x2);
        }else if(delta == 0){
            double y1 = -b / (2*a);
            System.out.println("Phương trình có nghiệm kép y1 = y2" + y1);
        }else{
            System.out.println("Phương trình vô nghiệm");
        }

    }

}

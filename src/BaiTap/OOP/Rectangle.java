package BaiTap.OOP;

public class Rectangle {
    private Double chieuDai;
    private Double chieuRong;

    public Rectangle(Double chieuDai, Double chieuRong) {
        this.chieuDai = chieuDai;
        this.chieuRong = chieuRong;
    }
    public Rectangle(){

    }

    public Double getChieuDai() {
        return chieuDai;
    }

    public void setChieuDai(Double chieuDai) {
        this.chieuDai = chieuDai;
    }

    public Double getChieuRong() {
        return chieuRong;
    }

    public void setChieuRong(Double chieuRong) {
        this.chieuRong = chieuRong;
    }


    public void dienTichHinhChuNhat(double chieuDai, double chieuRong){
       System.out.println("Diện tích hình chữ nhật là:" + (chieuDai * chieuRong));
    }
    public void chuViHinhChuNhat(double chieuDai, double chieuRong){
        System.out.println("Chu vi hình chữ nhật là:" + (chieuDai + chieuRong) * 2);
    }
}

package oop.collection;

public class Bank {

    private String accountNumber;
    private double balance;
    private String name;
    private String phone;

    public Bank(String accountNumber, double balance, String name, String phone) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.name = name;
        this.phone = phone;
    }

    public Bank() {

    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone.length() == 9 || phone.length() == 10){
            this.phone = phone;
        }else {
            System.out.println("sdt ko hợp lệ");
        }

    }

    public void guiTien(double money){
        balance += money;
        System.out.println("Gửi tiền thành công ");
        System.out.println("Số dư hiện tại : "+ balance);
    }

    public void rutTien(double money){
        if (balance < money){
            System.out.println("Số dư hiện tại không đủ");
            System.out.println("Số dư hiện tại : "+ balance);
        }else {
            System.out.println("Rút thành công "+ money);
            System.out.println("Số dư hiện tại : "+ balance);
        }


    }

}

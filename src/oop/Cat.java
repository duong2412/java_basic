package oop;

public class Cat extends Animal{
    private String color;

    public void move(){
       this.color ="blue";
        super.move();
        System.out.println("di chuyển Cat");
    }


}

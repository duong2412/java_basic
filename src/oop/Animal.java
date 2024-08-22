package oop;

public class Animal {
    private String name;

    public Animal(String name){
        this.name = name;
    }
    public Animal(){
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void move(){
        System.out.println("di chuyển Animal");
    }


}

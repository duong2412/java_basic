package oop;

public class Student {
    private String name;
    public int age;
    private String email;


    public Student(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

package BaiTap.chuaBT;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        List<Student> studentList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        boolean flag = true;
        while (flag){
            System.out.println("nhập 1 : thêm sinh viên");
            System.out.println("nhập 2 : hiển thị danh sách");
            System.out.println("nhập 3 : tìm kiếm sinh viên theo tên");
            System.out.println("nhập 4 : tìm kếm sinh viên theo id");
            System.out.println("nhập 0 : kết thúc");
            System.out.println("---------------------------");
            int result = scanner.nextInt();
            switch (result){
                case 1 :
                    //thêm sinh viên
                    addStudent(studentList);
                    break;
                case 2 :
                    //hiển thị danh sách
                    //SELECT * FROM... -> list student
                    findAllStudent(studentList);
                    break;
                case 3:
                    // tìm kiếm sinh viên theo tên
                    break;
                case 4:
                    //tìm kếm sinh viên theo id
                    System.out.println("Nhập id sinh viên muốn tìm kiếm");
                    int id = scanner.nextInt();
                    findStudentById(studentList, id);
                    break;
                case 0:
                    flag = false;
                    break;
            }

        }
        System.out.println("Kết thúc chương trình");

    }

    private static void findAllStudent(List<Student> studentList){
        for (Student student : studentList){
                System.out.println("Sinh viên có id :"+student.getId()+ ",Tên :"+student.getName());
        }
    }

    public static void addStudent(List<Student> studentList){
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id");
        int id =  scanner.nextInt();
        scanner.nextLine();
        student.setId(id);

        System.out.println("Nhập tên");
        String name =  scanner.nextLine();
        student.setName(name);
        studentList.add(student);//sql INSERT
        System.out.println("Thêm thành công");
        System.out.println("---------------");
    }

    public static void findStudentById(List<Student> studentList, int id){
        boolean check = false;
        for (Student student : studentList){
            if (student.getId() == id){
                System.out.println("Sinh viên có id :"+id+ ",Tên :"+student.getName());
                check = true;
            }
        }
        if (check == false){
            System.out.println("k co  nao Sinh viên có id :"+id);
        }

//        Student student =  //select * from student where id  = ...
//        if(student != null){
//            System.out.println("Sinh viên có id :"+id+ ",Tên :"+student.getName());
//        }else {
//            System.out.println();
//        }
    }
}

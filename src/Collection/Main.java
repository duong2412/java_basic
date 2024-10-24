package Collection;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Collections : list, array, map, set, vector, queue (queue - stack)
        // List : arrayList, linkedList, vector

        // LinkedList insert,xóa nhanh hon arrayList khi ở giữa list, và số lượng nhỏ
        // arrayList tim kiem nhanh hon LinkedList
        // arrayList ton it bo nho hon vi chi quan tam den node do
        // linkedList phai luu gia node truoc va node sau

        // set : khong co cac phan tu trung nhau

//        long n = 10000000;
//        LinkedList linkedList = new LinkedList();
//
//        for (int i = 0; i < n; i++) {
//            linkedList.add(i);
//        }
//        long s = System.currentTimeMillis();
//        linkedList.add(100000, 1);
//        linkedList.remove(100000);
//        System.out.println("linkedList add :" + (System.currentTimeMillis()-s));
//
//        ArrayList arrayList = new ArrayList();
//        for (int i = 0; i < n; i++) {
//            arrayList.add(i);
//        }
//        s = System.currentTimeMillis();
//
//        arrayList.add(100000, 1);
//        arrayList.remove(100000);
//        System.out.println("arrayList add :" + (System.currentTimeMillis()-s));

//
//        s = System.currentTimeMillis();
//        System.out.println(arrayList.get(100000));
//
//        System.out.println("arrayList get :" + (System.currentTimeMillis()-s));
//
//        s = System.currentTimeMillis();
//        System.out.println(linkedList.get(100000));
//        System.out.println("linkedList get :" + (System.currentTimeMillis()-s));


//        Set<String> stringSet = new HashSet<>();
//        stringSet.add("a");
//        stringSet.add("b");
//        stringSet.add("b");
//        stringSet.add("a");
//        for (String item : stringSet){
//            System.out.println(item);
//        }
//        System.out.println("-------------------------------");
//        List<String> stringList = new ArrayList<>();
//        stringList.add("a");
//        stringList.add("b");
//        stringList.add("b");
//        stringList.add("a");
//
//        for (String item : stringList){
//            System.out.println(item);
//        }


//       [a] ,[b]

        // Heap va stack trong java
        //on OOP, SQL,

//        String a = new String("abc");
//        String b = new String("abc");
//        String c = a;
//
//        if (a == b){
//            System.out.println(" a = b");
//        }else {
//            System.out.println(" a != b");
//        }
//
//        if (a == c){
//            System.out.println(" a = c");
//        }else {
//            System.out.println(" a != c");
//        }
//
//        if (a.equals(b)){
//            System.out.println(" a equals b");
//        }else {
//            System.out.println(" a not equals b");
//        }
        List<Integer> intList = new ArrayList<>();

        intList.add(10);
        intList.add(5);
        intList.add(1);
        intList.add(8);
        intList.add(12);
        intList.add(6);

//        intList.forEach(e -> System.out.println(e));
//        Collections.sort(intList);
//        System.out.println("-0------------------------------");
//        System.out.println("sau khi sort");
//        intList.forEach(e -> System.out.println(e));
//    Collections có những phương thức để thao tác vs các đối tượng thuộc kiểu Collection ( List, Set, Queue )

        Iterator<Integer> iterator = intList.iterator();

        while (iterator.hasNext()){
            Integer test = iterator.next();
            System.out.println(test);
        }

    }
}

package oop.collection;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[2];
        a[0] = 1;
        a[1] = 2;

        for (int i = 0; i < a.length; i++) {
            System.out.println("array = " + a[i]);

        }



        List<Integer> a2 = new ArrayList<>();
        a2.add(10);
        a2.add(30);
        a2.add(20);


        List<Integer> a3 = new ArrayList<>();
        a3.addAll(a2);

        for (int i = 0; i < a2.size(); i++) {
            System.out.println("a2 = "+a2.get(i));
        }

        for (Integer e : a3){
            System.out.println("a3 = "+ e);
        }


        Bank bank1 = new Bank();
        bank1.setName("BIDV");
        Bank bank2= new Bank();
        bank2.setName("ACB");
        Bank bank3 = new Bank();
        bank3.setName("TechCombank");

        List<Bank> testString = new ArrayList<>();
        testString.add(bank1);
        testString.add(bank2);
        testString.add(bank3);

        for(Bank bank : testString){
            if (bank.getName() == "ACB"){

            }
        }





 //       ArrayList<Integer>
//        LinkedList<Integer>
//        Queue<Integer>
//        Vector<Integer>
        Map<String, Bank> testMap = new HashMap<>();
        testMap.put("003",bank3);
        testMap.put("002",bank2);
        testMap.put("001",bank1);


        Bank acb = testMap.get("002");
        System.out.println(acb.getName());

    }
}

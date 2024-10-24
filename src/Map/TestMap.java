package Map;

import java.util.HashMap;
import java.util.Map;

public class TestMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"a");
        map.put(2,"b");
        map.put(5,"d");
        map.put(7,"e");
        map.put(3,"f");
        map.put(1,"abc");
        map.put(10,"abc");

//        System.out.println(map.get(10));



        for (Map.Entry<Integer,String> e : map.entrySet()){
            System.out.println(e);
        }


    }
}

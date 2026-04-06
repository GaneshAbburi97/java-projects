import java.util.*;
public class treemap {
    public static void main(String[] args) {
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(1,"java");
        map.put(2,"Python");
        map.put(3,"C++");
        System.out.println(map);
        System.out.println("value of 2:"+map.get(2));
        map.remove(1);
        System.out.println(map);
        System.out.println("Contains key3?"+map.containsKey(3));}
    } 


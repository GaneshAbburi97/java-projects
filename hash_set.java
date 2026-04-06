import java.util.*;
public class hash_set {
    public static void main(String[] args)
    {
        HashSet<String> set = new HashSet<>();
        set.add("apple");
        set.add("banana");
        set.add("orange");
        System.out.println(set);
        set.remove("banana");
        System.out.println(set);
    }
}

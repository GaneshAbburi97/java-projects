import java.util.LinkedHashMap;
public class linked_hapmap {
    public static void main(String[] args) {
        LinkedHashMap<String,String> cities=new LinkedHashMap<>();
        cities.put("India","Delhi");
        cities.put("USA","Washington DC");  
        cities.put("UK","London");
        cities.put("France","Paris");
        cities.put("Germany","Berlin");
        System.out.println(cities); 
    }
}

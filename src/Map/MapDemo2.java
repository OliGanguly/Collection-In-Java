package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<Integer,String> maps = new HashMap<>();
        maps.put(1,"Oli");
        maps.put(2,"ria");
        maps.put(3,"diya");
//1st way
        Set<Integer> data = maps.keySet();
        for(Integer i :data ){
//            System.out.println(i + " " + maps.get(i));
        }
        //2nd
        Set<Map.Entry<Integer, String>> entries = maps.entrySet();
        entries.forEach((j)-> System.out.println(j.getKey()+" "+j.getValue()));
        System.out.println("....");
        for (Map.Entry<Integer, String> k :entries ){
            System.out.println(k.getKey()+ " "+k.getValue());
        }


    }
}

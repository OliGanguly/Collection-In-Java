package Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer,String> maps = new HashMap<>();
        maps.put(1,"Oli");
        maps.put(2,"sonnet");
        maps.put(3,"sonu");
        maps.put(4,"sonet");
        maps.put(4,"Titly");//update previous one
//        System.out.println(maps);
//        System.out.println(maps.get(3));
        Set<Integer> keys =  maps.keySet();
        for(Integer key:keys){
            System.out.println(key +" "+maps.get(key));
        }
        Set<Integer> set = maps.keySet();
        set.forEach((s)-> System.out.println(s + " " + maps.get(s)));

        System.out.println("Second Way");
        /*
        * Entry is a Interface in Map
        *
        * */
        Set<Map.Entry<Integer,String>>data = maps.entrySet();
        for (Map.Entry<Integer,String> e :data){
            System.out.println(e.getKey()+" "+e.getValue());
        }

    }
}

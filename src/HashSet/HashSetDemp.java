package HashSet;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemp {
    public static void main(String[] args) {
        Set<Integer>set=new HashSet<>();
        set.add(1);
        set.add(3);
        System.out.println(set.contains(3));
    }
}

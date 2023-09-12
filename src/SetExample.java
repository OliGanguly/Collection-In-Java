import java.util.HashSet;
import java.util.Set;

public class SetExample {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(3);
        set.add(9);
        set.add(7);
        set.add(9);
        set.forEach((i)-> System.out.println(i));
    }
}

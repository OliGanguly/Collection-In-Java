import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ComparatorExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(78);
        list.add(55);
        list.add(67);
        Collections.sort(list);
        list.forEach((i)-> System.out.println(i));
        Comparator<Integer> com = new ComImplementation();
        Collections.sort(list,com);
        System.out.println("///////////////////////////");
        list.forEach((i)-> System.out.println(i));
        //Comparable
    }
}
